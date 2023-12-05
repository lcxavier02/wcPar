package cifradortexto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class cifradoHill {
    String key = "hill";

    ArrayList<String> palabrasSec=new ArrayList<String>();
    ArrayList<String> palabrasCon=new ArrayList<String>();
    CifradorTexto cifrador = new CifradorTexto(palabrasSec, palabrasCon);
    ContadorDePalabras contadorPalabras=new ContadorDePalabras();
    String nombreArchivo = "C:/Users/Xavi/Documents/NetBeansProjects/CifradorTexto/src/cifradortexto/"; // Nombre del archivo a leer
    ContadorDePalabrasHilos contadorHilos=new ContadorDePalabrasHilos();
    int numCifrado=10000;
    
    int numHilos = 8;
    
    CifradoRMIServidor server;

    
    public void arraySecuencial(String[] texto, ArrayList<String> palabrasSec ){
        for(int i = 0; i < texto.length; i++){
            texto[i] = palabrasSec.get(i);
        }
    }
    
    public void arrayCopySecuencial(String[] texto, String[] textCopy ){
        for(int i = 0; i < texto.length; i++){
           texto[i]  = textCopy[i];
        }
    }
    

    public void cifrarSecuencial() throws IOException{
        long tiempoInicioSecuencial = System.currentTimeMillis();

        int totPalabras=contadorPalabras.contarPalabras(nombreArchivo, palabrasSec);
        System.out.println("Número de palabras (secuencial): " + totPalabras);
       
        String[] texto;
        
        texto=new String[palabrasSec.size()];
        arraySecuencial(texto, palabrasSec);
        
        String[] textCopy;
        textCopy=new String[palabrasSec.size()];

        for(int i=0;i<numCifrado; i++){
        for(int j=0; j<texto.length;j++){
           textCopy[j]=cifradoSecuencial(texto[j]);
           
        }
        
            arrayCopySecuencial(texto, textCopy);
        }
 
          
        
        int count=0;
        for(int i=0; i<textCopy.length;i++){
           escribirArchivo(textCopy[i]);
           count++;
           if(count%10==0){
               escribirArchivo("\n");
           }
        }
        long tiempoFinSecuencial = System.currentTimeMillis();
        long tiempoTotalSecuencial = tiempoFinSecuencial - tiempoInicioSecuencial;
        System.out.println("Tiempo de ejecución (secuencial): " + tiempoTotalSecuencial + " ms");
        
                
    }
    
 private class CifradoRunnable implements Runnable {
    private String[] texto;
    private String[] textosCifrados;
    private int startIndex;
    private int endIndex;

    public CifradoRunnable(String[] texto, String[] textosCifrados, int startIndex, int endIndex) {
        this.texto = texto;
        this.textosCifrados = textosCifrados;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    @Override
    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            String textoCifrado = texto[i];
            for (int j = 0; j < numCifrado; j++) {
                textoCifrado = cifradoSecuencial(textoCifrado);
            }
            textosCifrados[i] = textoCifrado;
        }
    }
}
  
 public void cifrarConHilosClientes(CifradoRMIServidor server) throws IOException {
     
    
    int totPalabras = contadorPalabras.contarPalabras(nombreArchivo, palabrasSec);
    System.out.println("Número de palabras (con hilos): " + totPalabras);

    String[] texto = new String[palabrasSec.size()];
    arraySecuencial(texto, palabrasSec);
    

    String[] textosCifrados = new String[palabrasSec.size()];
    
     System.out.println(server.clientes.size());
    server.cifrarPorHilos(texto);
}
 
  public String[] cifrarConHilosClientesFinal(String[] textoACifrar, int numPalabras) throws IOException {
    System.out.println("Número de palabras (Clientes): " + numPalabras);

    String[] texto = new String[numPalabras];
    arrayCopySecuencial(texto, textoACifrar);

    String[] textosCifrados = new String[numPalabras];

    ExecutorService executorService = Executors.newFixedThreadPool(numHilos);

    int batchSize = numPalabras / numHilos;

    for (int i = 0; i < numHilos; i++) {
        int startIndex = i * batchSize;
        int endIndex = (i == numHilos - 1) ? numPalabras : (i + 1) * batchSize;

        executorService.submit(new CifradoRunnable(texto, textosCifrados, startIndex, endIndex));
    }

    executorService.shutdown();

    try {
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
      
      return textosCifrados;
  }
 
public void cifrarConHilos() throws IOException {
    long tiempoInicioConHilos = System.currentTimeMillis();

    int totPalabras = contadorPalabras.contarPalabras(nombreArchivo, palabrasSec);
    System.out.println("Número de palabras (con hilos): " + totPalabras);

    String[] texto = new String[palabrasSec.size()];
    arraySecuencial(texto, palabrasSec);

    String[] textosCifrados = new String[palabrasSec.size()];

    ExecutorService executorService = Executors.newFixedThreadPool(numHilos);

    int batchSize = palabrasSec.size() / numHilos;

    for (int i = 0; i < numHilos; i++) {
        int startIndex = i * batchSize;
        int endIndex = (i == numHilos - 1) ? palabrasSec.size() : (i + 1) * batchSize;

        executorService.submit(new CifradoRunnable(texto, textosCifrados, startIndex, endIndex));
    }

    executorService.shutdown();

    try {
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }



    int count = 0;
    for (int i = 0; i < textosCifrados.length; i++) {
        escribirArchivo(textosCifrados[i]);
        count++;
        if (count % 10 == 0) {
            escribirArchivo("\n");
        }
    }
    long tiempoFinConHilos = System.currentTimeMillis();
    long tiempoTotalConHilos = tiempoFinConHilos - tiempoInicioConHilos;
    System.out.println("Tiempo de ejecución (con hilos): " + tiempoTotalConHilos + " ms");
    
}
    
    public void escribirArchivo(String textCopy){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:/Users/Xavi/Documents/NetBeansProjects/CifradorTexto/src/cifradortexto/test.txt", true));

            writer.write(textCopy + " ");

            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
    
    public String cifradoSecuencial(String texto){
        texto = texto.replaceAll("\\s" , "");
        texto = texto.toUpperCase();

        int tamanioLetra = 0;
        if (texto.length() % 2 != 0){
            texto += "0";
            tamanioLetra = 1;
        }

        // message to matrices
        int[][] msg2D = new int[2][texto.length()];
        int itr1 = 0;
        int itr2 = 0;
        for (int i = 0; i < texto.length(); i++){
            if (i%2 == 0){
                msg2D[0][itr1] = ((int)texto.charAt(i)) - 65;
                itr1++;
            } else {
                msg2D[1][itr2] = ((int)texto.charAt(i)) - 65;
                itr2++;
            }
        }

        key = key.replaceAll("\\s","");
        key = key.toUpperCase();

        int[][] key2D = new int[2][2];
        int itr3 = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                key2D[i][j] = (int)key.charAt(itr3)-65;
                itr3++;
            }
        }

        int deter = key2D[0][0] * key2D[1][1] - key2D[0][1] * key2D[1][0];
        deter = moduloFunc(deter, 26);

        int mulInverse = -1;
        for (int i = 0; i < 26; i++) {
            int tempInv = deter * i;
            if (moduloFunc(tempInv, 26) == 1){
                mulInverse = i;
                break;
            } else {
                continue;
            }
        }

        if (mulInverse == -1){
            System.out.println("invalid key");
            System.exit(1);
        }

        String textCopy="";
        
        int itrCount = texto.length() / 2;
        if (tamanioLetra == 0){
            // if msg length % 2 = 0
            for (int i = 0; i < itrCount; i++) {
                int temp1 = msg2D[0][i] * key2D[0][0] + msg2D[1][i] * key2D[0][1];
                textCopy += (char)((temp1 % 26) + 65);
                int temp2 = msg2D[0][i] * key2D[1][0] + msg2D[1][i] * key2D[1][1];
                textCopy += (char)((temp2 % 26) + 65);
            }
        } else {
            // if msg length % 2 != 0 (irregular length msg)
            for (int i = 0; i < itrCount-1; i++) {
                int temp1 = msg2D[0][i] * key2D[0][0] + msg2D[1][i] * key2D[0][1];
                textCopy += (char)((temp1 % 26) + 65);
                int temp2 = msg2D[0][i] * key2D[1][0] + msg2D[1][i] * key2D[1][1];
                textCopy += (char)((temp2 % 26) + 65);
            }
        }
        
        return textCopy;

    }
    
    public static int moduloFunc(int a, int b){
        int result = a % b;
        if (result < 0){
            result += b;
        }
        return result;
    }
}
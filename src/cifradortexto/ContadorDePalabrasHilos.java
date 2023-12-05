/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradortexto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ContadorDePalabrasHilos {

    public ContadorDePalabrasHilos() {
    }

    public int contarPalabrasConcurrente(String nombreArchivo, int numHilos, List<String> palabrasArch)
            throws IOException, InterruptedException {
        int conteoTotal = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            ExecutorService executor = Executors.newFixedThreadPool(numHilos);

            List<ContadorPalabras> contadores = new ArrayList<>();

            for (int i = 0; i < numHilos; i++) {
                ContadorPalabras contador = new ContadorPalabras();
                contadores.add(contador);
                executor.submit(() -> procesarLineas(lector, contador, palabrasArch));
            }

            executor.shutdown();
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

            for (ContadorPalabras contador : contadores) {
                conteoTotal += contador.getConteo();
            }
        }

        return conteoTotal;
    }

    private void procesarLineas(BufferedReader lector, ContadorPalabras contador, List<String> palabrasArch) {
        try {
            String linea;
            while ((linea = lector.readLine()) != null) {
                contador.procesarLinea(linea, palabrasArch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ContadorPalabras {
        private int conteo;

        public void procesarLinea(String linea, List<String> palabrasArch) {
            String[] palabrasArray = linea.split("\\s+");
            Collections.addAll(palabrasArch, palabrasArray);
            conteo += contarPalabrasNoVacias(palabrasArray);
        }

        private int contarPalabrasNoVacias(String[] palabrasArray) {
            int contador = 0;
            for (String palabra : palabrasArray) {
                if (!palabra.isEmpty()) {
                    contador++;
                }
            }
            return contador;
        }

        public int getConteo() {
            return conteo;
        }
    }
}

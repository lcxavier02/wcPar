
package contadorpalabras;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ContadorDePalabras {

    public ContadorDePalabras() {
    }

    public int contarPalabras(String nombreArchivo, ArrayList<String> palabrasArch) throws IOException {
        int conteo = 0;

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;

            while ((linea = lector.readLine()) != null) {
                conteo += contarPalabrasEnLinea(linea, palabrasArch);
            }
        }

        return conteo;
    }

    private int contarPalabrasEnLinea(String linea, ArrayList<String> palabrasArch) {
        String[] palabras = linea.split("\\s+");
        int conteo = 0;

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {  // Ignorar palabras vacías
                palabrasArch.add(palabra);
                conteo++;
            }
        }
        
        return conteo;
    }
}

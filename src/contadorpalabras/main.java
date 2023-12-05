package contadorpalabras;

import java.io.IOException;

public class main {
    
    public static void main(String[] args) throws IOException, InterruptedException {
        cifradoHill hill=new cifradoHill();
        
        hill.cifrarConHilos();
    }
}
package contadorpalabras;

import java.util.ArrayList;

public class ContadorTexto {

        private ArrayList<String> palabrasSec=new ArrayList<String>();
        private ArrayList<String> palabrasCon=new ArrayList<String>();

    public ContadorTexto(ArrayList<String> palabrasSec, ArrayList<String> palabrasCon) {
        this.palabrasCon=palabrasCon;
        this.palabrasSec=palabrasSec;
    }

    public ArrayList<String> getPalabrasSec() {
        return palabrasSec;
    }

    public void setPalabrasSec(ArrayList<String> palabrasSec) {
        this.palabrasSec = palabrasSec;
    }

    public ArrayList<String> getPalabrasCon() {
        return palabrasCon;
    }

    public void setPalabrasCon(ArrayList<String> palabrasCon) {
        this.palabrasCon = palabrasCon;
    }
}

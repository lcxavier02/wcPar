package cifradortexto;

import java.util.ArrayList;

public class CifradorTexto {

        private ArrayList<String> palabrasSec=new ArrayList<String>();
        private ArrayList<String> palabrasCon=new ArrayList<String>();

    public CifradorTexto(ArrayList<String> palabrasSec, ArrayList<String> palabrasCon) {
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

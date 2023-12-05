package contadorpalabras;

import java.rmi.Naming;
import javax.swing.JTextArea;


public class CifradoRMICliente {
    

    public void connect(String ip, CifradoRMI service, JTextArea log) {
        try {
            service = (CifradoRMI) Naming.lookup("rmi://" + ip + ":9000/CifradoRMI");

            ClientCallbackImpl clientCallback = new ClientCallbackImpl();
            service.registerClient(clientCallback);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


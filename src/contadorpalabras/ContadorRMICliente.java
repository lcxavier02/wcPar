package contadorpalabras;

import java.rmi.Naming;
import javax.swing.JTextArea;


public class ContadorRMICliente {
    JTextArea log;
    

    public void connect(String ip, ContadorRMI service, JTextArea log) {
        try {
            service = (ContadorRMI) Naming.lookup("rmi://" + ip + ":9000/CifradoRMI");

            ClientCallbackImpl clientCallback = new ClientCallbackImpl();
            this.log=log;
            service.registerClient(clientCallback);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


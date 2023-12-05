package cifradortexto;

import java.rmi.Naming;


public class CifradoRMICliente {
    

    public void connect(String ip, CifradoRMI service) {
        try {
            service = (CifradoRMI) Naming.lookup("rmi://" + ip + ":9000/CifradoRMI");

            ClientCallbackImpl clientCallback = new ClientCallbackImpl();
            service.registerClient(clientCallback);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


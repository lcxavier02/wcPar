package cifradortexto;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientCallback extends Remote {
    void receiveMessage(String[] message, CifradoRMI servidor, int identifier) throws RemoteException;
}
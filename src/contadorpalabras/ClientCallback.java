package contadorpalabras;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientCallback extends Remote {
    void receiveMessage(String[] message, ContadorRMI servidor, int identifier) throws RemoteException;
}
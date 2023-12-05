package cifradortexto;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CifradoRMI extends Remote {
    void cifrarPorHilos(String[] texto) throws RemoteException;
    void registerClient(ClientCallback client) throws RemoteException;    
    void sendResult(String[] message, int identifier)throws RemoteException;
}

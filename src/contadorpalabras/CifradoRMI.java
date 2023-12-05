package contadorpalabras;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.JTextArea;

public interface CifradoRMI extends Remote {
    void contarPalabrasClientes(String[] texto, JTextArea log) throws RemoteException;
    void registerClient(ClientCallback client) throws RemoteException;    
    void sendResult(String[] message, int identifier) throws RemoteException;
}

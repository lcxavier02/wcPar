package contadorpalabras;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientCallbackImpl extends UnicastRemoteObject implements ClientCallback {


    public ClientCallbackImpl() throws RemoteException {

    }

    @Override
    public void receiveMessage(String[] message, CifradoRMI servidor, int identifier) throws RemoteException {
        cifradoHill cifrador=new cifradoHill();
        System.out.println("Texto recibido: " + Arrays.toString(message));
        try {
            String[] textoCifrado=cifrador.cifrarConHilosClientesFinal(message, message.length);
                    System.out.println(Arrays.toString(textoCifrado));
                    servidor.sendResult(textoCifrado, identifier);
                    
        } catch (IOException ex) {
            Logger.getLogger(ClientCallbackImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
}

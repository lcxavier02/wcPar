package contadorpalabras;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class cifradorVisual extends javax.swing.JFrame {
    CifradoRMIServidor server;
    CifradoRMICliente client;
    CifradoRMI service;

    String resetRoute="C:/Users/Xavi/Documents/NetBeansProjects/CifradorTexto/src/cifradortexto/";

    public cifradorVisual() throws RemoteException {
        this.client = new CifradoRMICliente();
        this.server = new CifradoRMIServidor();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbCodigos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        chkConcurrente = new javax.swing.JCheckBox();
        btnIniciar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbEscogerTexto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLogs = new javax.swing.JTextArea();
        btnServer = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();
        btnIniciarPorRMI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Cifrador de Texto");

        cmbCodigos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hill", "lion", "test", "dfhc", "lkop" }));

        jLabel2.setText("Escoge tu clave de cifrado:");

        chkConcurrente.setText("Concurrente");
        chkConcurrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConcurrenteActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "6", "8" }));
        jComboBox1.setEnabled(false);

        jLabel3.setText("Cantidad de hilos (Concurrente)");

        cmbEscogerTexto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lorem", "Shrek" }));

        jLabel4.setText("Escoge el texto a cifrar");

        txtCantidad.setText("10000");

        jLabel5.setText("Cantidad de veces a cifrar:");

        txtLogs.setColumns(20);
        txtLogs.setRows(5);
        txtLogs.setText("Logs:");
        jScrollPane1.setViewportView(txtLogs);

        btnServer.setText("Server");
        btnServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServerActionPerformed(evt);
            }
        });

        btnClient.setText("Client");
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnIniciarPorRMI.setText("Iniciar por Cliente servidor");
        btnIniciarPorRMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarPorRMIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCodigos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(chkConcurrente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbEscogerTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnIniciar)
                                .addGap(47, 47, 47))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnIniciarPorRMI))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClient)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnServer, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCodigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkConcurrente)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEscogerTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIniciar)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnServer)
                            .addComponent(btnClient))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarPorRMI)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        cifradoHill cifradoHill=new cifradoHill();
        if(esNumeroEntero(txtCantidad.getText().toString())){
            borrarCrearResultado();
            
            
        String codigos=cmbCodigos.getSelectedItem().toString();
        int cantidadHilos=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        String textoCifrar=cmbEscogerTexto.getSelectedItem().toString();
        
        int cantidadCifrar=Integer.parseInt(txtCantidad.getText().toString());
        
        cifradoHill.key=codigos;
        cifradoHill.numHilos=cantidadHilos;
        cifradoHill.nombreArchivo=cifradoHill.nombreArchivo+textoCifrar+".txt";
        cifradoHill.numCifrado=cantidadCifrar;
        
        if(!chkConcurrente.isSelected()){
            try {
                long tiempoInicioSecuencial = System.currentTimeMillis();
                cifradoHill.cifrarSecuencial();
                long tiempoFinSecuencial = System.currentTimeMillis();
                long tiempoTotalSecuencial = tiempoFinSecuencial - tiempoInicioSecuencial;
               
                JOptionPane.showMessageDialog(this, "Tiempo de ejecución (secuencial): " + tiempoTotalSecuencial + " ms");
                
                txtLogs.append("\nTiempo de ejecución (secuencial): " + tiempoTotalSecuencial + " ms\n");
            } catch (IOException ex) {
                Logger.getLogger(cifradorVisual.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            try {
                long tiempoInicioConHilos = System.currentTimeMillis();

                cifradoHill.cifrarConHilos();
                long tiempoFinConHilos = System.currentTimeMillis();
                long tiempoTotalConHilos = tiempoFinConHilos - tiempoInicioConHilos;
                JOptionPane.showMessageDialog(this, "Tiempo de ejecución (concurrente): " + tiempoTotalConHilos + " ms");

                txtLogs.append("\nTiempo de ejecución (concurrente): " + tiempoTotalConHilos + " ms\n");
                
                
            } catch (IOException ex) {
                Logger.getLogger(cifradorVisual.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        cifradoHill.nombreArchivo=resetRoute;
        
        }else{
        JOptionPane.showMessageDialog(this, "Error: Ingrese un número entero válido.");

        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    
    private void chkConcurrenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkConcurrenteActionPerformed
        if(chkConcurrente.isSelected()){
            jComboBox1.setEnabled(true);
        }
        else{
            jComboBox1.setEnabled(false);

        }

    }//GEN-LAST:event_chkConcurrenteActionPerformed

    private void btnServerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServerActionPerformed
        String Ip=JOptionPane.showInputDialog(rootPane, "Escribe tu ip", "Servidor", HEIGHT);
        System.out.println(Ip);
        service=server.connect(Ip, server);
        
        txtLogs.append("Se ha conectado al servidor \n");
        
    }//GEN-LAST:event_btnServerActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        System.out.println(server.clientes.size());
        client = new CifradoRMICliente();

        String Ip=JOptionPane.showInputDialog(rootPane, "Escribe la ip del servidor", "Cliente", HEIGHT);
        client.connect(Ip, service);
       
        txtLogs.append("Se ha conectado al servidor \n");
        System.out.println(server.clientes.size());
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnIniciarPorRMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarPorRMIActionPerformed
        cifradoHill cifradoHill=new cifradoHill();
        if(esNumeroEntero(txtCantidad.getText().toString())){
            borrarCrearResultado();
            
            
        String codigos=cmbCodigos.getSelectedItem().toString();
        int cantidadHilos=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        String textoCifrar=cmbEscogerTexto.getSelectedItem().toString();
        
        int cantidadCifrar=Integer.parseInt(txtCantidad.getText().toString());
        
        cifradoHill.key=codigos;
        cifradoHill.numHilos=cantidadHilos;
        cifradoHill.nombreArchivo=cifradoHill.nombreArchivo+textoCifrar+".txt";
        cifradoHill.numCifrado=cantidadCifrar;
        }
                
        try {
                long tiempoInicioConHilos = System.currentTimeMillis();
                
                cifradoHill.cifrarConHilosClientes(server);
                
                long tiempoFinConHilos = System.currentTimeMillis();
                long tiempoTotalConHilos = tiempoFinConHilos - tiempoInicioConHilos;
                JOptionPane.showMessageDialog(this, "Tiempo de ejecución (RMI): " + tiempoTotalConHilos + " ms");

                txtLogs.append("\nTiempo de ejecución (RMI): " + tiempoTotalConHilos + " ms\n");
                
                
            } catch (IOException ex) {
                Logger.getLogger(cifradorVisual.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            cifradoHill.nombreArchivo=resetRoute;

    }//GEN-LAST:event_btnIniciarPorRMIActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cifradorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cifradorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cifradorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cifradorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new cifradorVisual().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(cifradorVisual.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    private boolean esNumeroEntero(String input) {
    try {
        Integer.parseInt(input);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
    
    private void borrarCrearResultado() {
        
        String nombreArchivo = "C:/Users/Xavi/Documents/NetBeansProjects/CifradorTexto/src/cifradortexto/test.txt";

        File archivo = new File(nombreArchivo);

        if (archivo.exists()) {
            if (archivo.delete()) {
                System.out.println("El archivo existente ha sido eliminado.");
            } else {
                System.out.println("No se pudo eliminar el archivo existente.");
            }
        }

        try {
            // Crear un nuevo archivo con el mismo nombre
            if (archivo.createNewFile()) {
                System.out.println("Se ha creado un nuevo archivo: " + nombreArchivo);
            } else {
                System.out.println("No se pudo crear el nuevo archivo.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }   
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIniciarPorRMI;
    private javax.swing.JButton btnServer;
    private javax.swing.JCheckBox chkConcurrente;
    private javax.swing.JComboBox<String> cmbCodigos;
    private javax.swing.JComboBox<String> cmbEscogerTexto;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtLogs;
    // End of variables declaration//GEN-END:variables
}

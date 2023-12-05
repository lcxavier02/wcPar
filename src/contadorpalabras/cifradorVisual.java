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
        chkConcurrente = new javax.swing.JCheckBox();
        btnIniciar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbEscogerTexto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLogs = new javax.swing.JTextArea();
        btnServer = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();
        btnIniciarPorRMI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 9));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Contador de palabras");

        chkConcurrente.setForeground(new java.awt.Color(0, 0, 0));
        chkConcurrente.setText("Concurrente");
        chkConcurrente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkConcurrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConcurrenteActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Iniciar");
        btnIniciar.setBorder(null);
        btnIniciar.setBorderPainted(false);
        btnIniciar.setContentAreaFilled(false);
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.setOpaque(true);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "6", "8" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setEnabled(false);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad de hilos (Concurrente)");

        cmbEscogerTexto.setBackground(new java.awt.Color(0, 0, 0));
        cmbEscogerTexto.setForeground(new java.awt.Color(255, 255, 255));
        cmbEscogerTexto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "1000", "10000", "100000", "1000000", "2000000" }));
        cmbEscogerTexto.setBorder(null);
        cmbEscogerTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Escoge el texto a cifrar");

        txtLogs.setEditable(false);
        txtLogs.setBackground(new java.awt.Color(0, 0, 0));
        txtLogs.setColumns(20);
        txtLogs.setForeground(new java.awt.Color(255, 255, 255));
        txtLogs.setRows(5);
        txtLogs.setText("Logs:");
        jScrollPane1.setViewportView(txtLogs);

        btnServer.setBackground(new java.awt.Color(0, 0, 0));
        btnServer.setForeground(new java.awt.Color(255, 255, 255));
        btnServer.setText("Server");
        btnServer.setBorder(null);
        btnServer.setBorderPainted(false);
        btnServer.setContentAreaFilled(false);
        btnServer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnServer.setOpaque(true);
        btnServer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServerActionPerformed(evt);
            }
        });

        btnClient.setBackground(new java.awt.Color(0, 0, 0));
        btnClient.setForeground(new java.awt.Color(255, 255, 255));
        btnClient.setText("Client");
        btnClient.setBorder(null);
        btnClient.setBorderPainted(false);
        btnClient.setContentAreaFilled(false);
        btnClient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClient.setOpaque(true);
        btnClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientActionPerformed(evt);
            }
        });

        btnIniciarPorRMI.setBackground(new java.awt.Color(0, 0, 0));
        btnIniciarPorRMI.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarPorRMI.setText("Iniciar por RMI");
        btnIniciarPorRMI.setBorder(null);
        btnIniciarPorRMI.setBorderPainted(false);
        btnIniciarPorRMI.setContentAreaFilled(false);
        btnIniciarPorRMI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarPorRMI.setOpaque(true);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClient, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnServer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(chkConcurrente, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbEscogerTexto, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciarPorRMI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEscogerTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(chkConcurrente)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnServer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIniciarPorRMI, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        cifradoHill cifradoHill=new cifradoHill();
        int cantidadHilos=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        String textoCifrar=cmbEscogerTexto.getSelectedItem().toString();
        
        cifradoHill.numHilos=cantidadHilos;
        cifradoHill.nombreArchivo=cifradoHill.nombreArchivo+textoCifrar+"w.txt";
        
        if(!chkConcurrente.isSelected()){
            try {
                cifradoHill.contarPalabrasSecuencial(txtLogs);
            } catch (IOException ex) {
                Logger.getLogger(cifradorVisual.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else{
                try {
                    cifradoHill.contarPalabrasConcurrente(txtLogs);
                } catch (IOException ex) {
                    Logger.getLogger(cifradorVisual.class.getName()).log(Level.SEVERE, null, ex);
                }
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
        service=server.connect(Ip, server, txtLogs);
        
        txtLogs.append("\nSe ha conectado al servidor \n");
    }//GEN-LAST:event_btnServerActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        System.out.println(server.clientes.size());
        client = new CifradoRMICliente();

        String Ip=JOptionPane.showInputDialog(rootPane, "Escribe la ip del servidor", "Cliente", HEIGHT);
        client.connect(Ip, service, txtLogs);
       
        txtLogs.append("\nSe ha conectado al servidor \n");
        System.out.println(server.clientes.size());
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnIniciarPorRMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarPorRMIActionPerformed
        cifradoHill cifradoHill=new cifradoHill();
        
        int cantidadHilos=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        String textoCifrar=cmbEscogerTexto.getSelectedItem().toString();
       
        cifradoHill.numHilos=cantidadHilos;
        cifradoHill.nombreArchivo=cifradoHill.nombreArchivo+textoCifrar+"w.txt";
                
        try {
            cifradoHill.contarPalabrasParalelo(server, txtLogs);
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClient;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnIniciarPorRMI;
    private javax.swing.JButton btnServer;
    private javax.swing.JCheckBox chkConcurrente;
    private javax.swing.JComboBox<String> cmbEscogerTexto;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtLogs;
    // End of variables declaration//GEN-END:variables
}

package contadorpalabras;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class contadorVisual extends javax.swing.JFrame {
    ContadorRMIServidor server;
    ContadorRMICliente client;
    ContadorRMI service;

    String resetRoute="C:/Users/Xavi/Documents/NetBeansProjects/wcPar/src/cifradortexto/";

    public contadorVisual() throws RemoteException {
        this.client = new ContadorRMICliente();
        this.server = new ContadorRMIServidor();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        chkConcurrente = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbEscogerTexto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLogs = new javax.swing.JTextArea();
        btnServer = new javax.swing.JButton();
        btnClient = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        btnIniciarPorRMI = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 9));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Contador de palabras");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 55));

        chkConcurrente.setForeground(new java.awt.Color(0, 0, 0));
        chkConcurrente.setText("Concurrente");
        chkConcurrente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkConcurrente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkConcurrenteActionPerformed(evt);
            }
        });
        jPanel1.add(chkConcurrente, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 112, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "4", "6", "8" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.setEnabled(false);
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 170, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cantidad de hilos (Concurrente)");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        cmbEscogerTexto.setBackground(new java.awt.Color(0, 0, 0));
        cmbEscogerTexto.setForeground(new java.awt.Color(255, 255, 255));
        cmbEscogerTexto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "100", "1000", "10000", "100000", "1000000", "2000000" }));
        cmbEscogerTexto.setBorder(null);
        cmbEscogerTexto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(cmbEscogerTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 218, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Escoge el texto a cifrar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 218, -1));

        txtLogs.setEditable(false);
        txtLogs.setBackground(new java.awt.Color(0, 0, 0));
        txtLogs.setColumns(20);
        txtLogs.setForeground(new java.awt.Color(255, 255, 255));
        txtLogs.setRows(5);
        txtLogs.setText("Logs:");
        jScrollPane1.setViewportView(txtLogs);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 296, 330));

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
        jPanel1.add(btnServer, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 100, 28));

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
        jPanel1.add(btnClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 100, 28));

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
        jPanel1.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 218, 29));

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
        jPanel1.add(btnIniciarPorRMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 218, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\xvelazquez\\Documents\\NetBeansProjects\\wcPar\\src\\images\\bikini2.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 980, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        Contadores cifradoHill=new Contadores();
        int cantidadHilos=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        String textoCifrar=cmbEscogerTexto.getSelectedItem().toString();
        
        cifradoHill.numHilos=cantidadHilos;
        cifradoHill.nombreArchivo=cifradoHill.nombreArchivo+textoCifrar+"w.txt";
        
        if(!chkConcurrente.isSelected()){
            try {
                cifradoHill.contarPalabrasSecuencial(txtLogs);
            } catch (IOException ex) {
                Logger.getLogger(contadorVisual.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else{
                try {
                    cifradoHill.contarPalabrasConcurrente(txtLogs);
                } catch (IOException ex) {
                    Logger.getLogger(contadorVisual.class.getName()).log(Level.SEVERE, null, ex);
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
        btnClient.setVisible(false);
    }//GEN-LAST:event_btnServerActionPerformed

    private void btnClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientActionPerformed
        System.out.println(server.clientes.size());
        client = new ContadorRMICliente();

        String Ip=JOptionPane.showInputDialog(rootPane, "Escribe la ip del servidor", "Cliente", HEIGHT);
        client.connect(Ip, service, txtLogs);
       
        txtLogs.append("\nSe ha conectado al servidor \n");
        txtLogs.append("Cliente(s): " + String.valueOf(server.clientes.size()));
        btnServer.setVisible(false);
        btnIniciarPorRMI.setVisible(false);
    }//GEN-LAST:event_btnClientActionPerformed

    private void btnIniciarPorRMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarPorRMIActionPerformed
        Contadores cifradoHill=new Contadores();
        
        int cantidadHilos=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        String textoCifrar=cmbEscogerTexto.getSelectedItem().toString();
       
        cifradoHill.numHilos=cantidadHilos;
        cifradoHill.nombreArchivo=cifradoHill.nombreArchivo+textoCifrar+"w.txt";
                
        try {
            cifradoHill.contarPalabrasParalelo(server, txtLogs);
        } catch (IOException ex) {
            Logger.getLogger(contadorVisual.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(contadorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(contadorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(contadorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(contadorVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new contadorVisual().setVisible(true);
                } catch (RemoteException ex) {
                    Logger.getLogger(contadorVisual.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtLogs;
    // End of variables declaration//GEN-END:variables
}

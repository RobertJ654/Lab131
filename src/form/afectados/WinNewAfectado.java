package form.afectados;

import java.awt.Color;
import modelo.personas.Afectado;
import modelo.personas.ListaAfectados;

public class WinNewAfectado extends javax.swing.JFrame {

    private PanelAfectados pnlAfectados;
    private ListaAfectados listaAfectados;
    
    public WinNewAfectado() {
        initComponents();
    }
    public WinNewAfectado(PanelAfectados pnlAfectados, ListaAfectados listaAfectados) {
        initComponents();
        this.getContentPane().setBackground(new Color(255,255,255));
        this.pnlAfectados = pnlAfectados;
        this.listaAfectados = listaAfectados;
        txtNombreAfectado.setLabelText("Nombre");
        txtEdadAfectado.setLabelText("Edad");
        txtCiAfectado.setLabelText("CI");
        txtGeneroAfectado.setLabelText("Genero");
        txtObsAfectado.setLabelText("Observación");
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarAfectado = new com.swing.Button();
        txtNombreAfectado = new com.swing.TextField();
        txtEdadAfectado = new com.swing.TextField();
        txtCiAfectado = new com.swing.TextField();
        txtGeneroAfectado = new com.swing.TextField();
        txtObsAfectado = new com.swing.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 42, 48));
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nuevo afectado");

        btnAgregarAfectado.setForeground(new java.awt.Color(0, 255, 0));
        btnAgregarAfectado.setText("Agregar");
        btnAgregarAfectado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgregarAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAfectadoActionPerformed(evt);
            }
        });

        txtNombreAfectado.setBackground(new java.awt.Color(35, 42, 48));
        txtNombreAfectado.setForeground(new java.awt.Color(255, 255, 255));

        txtEdadAfectado.setBackground(new java.awt.Color(35, 42, 48));
        txtEdadAfectado.setForeground(new java.awt.Color(255, 255, 255));

        txtCiAfectado.setBackground(new java.awt.Color(35, 42, 48));
        txtCiAfectado.setForeground(new java.awt.Color(255, 255, 255));

        txtGeneroAfectado.setBackground(new java.awt.Color(35, 42, 48));
        txtGeneroAfectado.setForeground(new java.awt.Color(255, 255, 255));

        txtObsAfectado.setBackground(new java.awt.Color(35, 42, 48));
        txtObsAfectado.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAgregarAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtNombreAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(66, 66, 66))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCiAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(116, 116, 116)))
                            .addGap(71, 71, 71)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtEdadAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGeneroAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(51, 51, 51)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtObsAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdadAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCiAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneroAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtObsAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnAgregarAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAfectadoActionPerformed
        int edad, ci;
        String nombre = txtNombreAfectado.getText();
        String edadTxt = txtEdadAfectado.getText();
        String ciTxt = txtCiAfectado.getText();
        String genero = txtGeneroAfectado.getText();
        String obs = txtObsAfectado.getText();
        if (edadTxt.isBlank()) edad = 0;
        else edad = Integer.parseInt(edadTxt);
        if (ciTxt.isBlank()) ci = 0;
        else ci = Integer.parseInt(ciTxt);
        
        Afectado newAf = new Afectado(nombre, edad, ci, genero, obs);
        listaAfectados.adiFinal(newAf);
        pnlAfectados.datosTabla();
        txtNombreAfectado.setText("");
        txtEdadAfectado.setText("");
        txtCiAfectado.setText("");
        txtGeneroAfectado.setText("");
        txtObsAfectado.setText("");
    }//GEN-LAST:event_btnAgregarAfectadoActionPerformed

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
            java.util.logging.Logger.getLogger(WinNewAfectado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinNewAfectado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinNewAfectado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinNewAfectado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinNewAfectado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.swing.Button btnAgregarAfectado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.swing.TextField txtCiAfectado;
    private com.swing.TextField txtEdadAfectado;
    private com.swing.TextField txtGeneroAfectado;
    private com.swing.TextField txtNombreAfectado;
    private com.swing.TextField txtObsAfectado;
    // End of variables declaration//GEN-END:variables
}

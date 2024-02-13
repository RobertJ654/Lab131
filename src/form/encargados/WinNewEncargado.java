package form.encargados;

import java.awt.Color;
import modelo.personas.Encargado;
import modelo.personas.ListaEncargados;

public class WinNewEncargado extends javax.swing.JFrame {

    private PanelEncargados pnlEncargados;
    private ListaEncargados listaEncargados;
    
    public WinNewEncargado() {
        initComponents();
    }
    public WinNewEncargado(PanelEncargados pnlEncargados, ListaEncargados listaEncargados) {
        initComponents();
        this.getContentPane().setBackground(new Color(255,255,255));
        this.pnlEncargados = pnlEncargados;
        this.listaEncargados = listaEncargados;
        txtNombreEncargado.setLabelText("Nombre");
        txtEdadEncargado.setLabelText("Edad");
        txtCiEncargado.setLabelText("CI");
        txtGeneroEncargado.setLabelText("Genero");
        txtCargoEncargado.setLabelText("Cargo");
        txtSueldoEncargado.setLabelText("Sueldo");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarEncargado = new com.swing.Button();
        txtNombreEncargado = new com.swing.TextField();
        txtEdadEncargado = new com.swing.TextField();
        txtCiEncargado = new com.swing.TextField();
        txtGeneroEncargado = new com.swing.TextField();
        txtCargoEncargado = new com.swing.TextField();
        txtSueldoEncargado = new com.swing.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 42, 48));
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nuevo encargado");

        btnAgregarEncargado.setForeground(new java.awt.Color(0, 255, 0));
        btnAgregarEncargado.setText("Agregar");
        btnAgregarEncargado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgregarEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEncargadoActionPerformed(evt);
            }
        });

        txtNombreEncargado.setBackground(new java.awt.Color(35, 42, 48));
        txtNombreEncargado.setForeground(new java.awt.Color(255, 255, 255));

        txtEdadEncargado.setBackground(new java.awt.Color(35, 42, 48));
        txtEdadEncargado.setForeground(new java.awt.Color(255, 255, 255));

        txtCiEncargado.setBackground(new java.awt.Color(35, 42, 48));
        txtCiEncargado.setForeground(new java.awt.Color(255, 255, 255));

        txtGeneroEncargado.setBackground(new java.awt.Color(35, 42, 48));
        txtGeneroEncargado.setForeground(new java.awt.Color(255, 255, 255));

        txtCargoEncargado.setBackground(new java.awt.Color(35, 42, 48));
        txtCargoEncargado.setForeground(new java.awt.Color(255, 255, 255));

        txtSueldoEncargado.setBackground(new java.awt.Color(35, 42, 48));
        txtSueldoEncargado.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNombreEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCiEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(116, 116, 116)))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEdadEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGeneroEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCargoEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtSueldoEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdadEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCiEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGeneroEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargoEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSueldoEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(btnAgregarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnAgregarEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEncargadoActionPerformed
        int edad, ci, sueldo;
        String nombre = txtNombreEncargado.getText();
        String edadTxt = txtEdadEncargado.getText();
        String ciTxt = txtCiEncargado.getText();
        String genero = txtGeneroEncargado.getText();
        String cargo = txtCargoEncargado.getText();
        String sueldoTxt = txtSueldoEncargado.getText();
        if (edadTxt.isBlank()) edad = 0;
        else edad = Integer.parseInt(edadTxt);
        if (ciTxt.isBlank()) ci = 0;
        else ci = Integer.parseInt(ciTxt);
        if (sueldoTxt.isBlank()) sueldo = 0;
        else sueldo = Integer.parseInt(sueldoTxt);

        Encargado newEn = new Encargado(nombre, edad, ci, genero, cargo, sueldo);
        listaEncargados.adiFinal(newEn);
        pnlEncargados.datosTabla();
        txtNombreEncargado.setText("");
        txtEdadEncargado.setText("");
        txtCiEncargado.setText("");
        txtGeneroEncargado.setText("");
        txtCargoEncargado.setText("");
        txtSueldoEncargado.setText("");        
    }//GEN-LAST:event_btnAgregarEncargadoActionPerformed

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
            java.util.logging.Logger.getLogger(WinNewEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinNewEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinNewEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinNewEncargado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinNewEncargado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.swing.Button btnAgregarEncargado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.swing.TextField txtCargoEncargado;
    private com.swing.TextField txtCiEncargado;
    private com.swing.TextField txtEdadEncargado;
    private com.swing.TextField txtGeneroEncargado;
    private com.swing.TextField txtNombreEncargado;
    private com.swing.TextField txtSueldoEncargado;
    // End of variables declaration//GEN-END:variables
}

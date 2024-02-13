package form.municipios;

import form.encargados.WinNewEncargado;
import java.awt.Color;
import modelo.municipio.ListaMunicipios;
import modelo.municipio.Municipio;
import modelo.personas.ListaAfectados;
import modelo.personas.ListaEncargados;
import modelo.provincia.ListaProvincias;
import modelo.provincia.NodoProvincia;
import modelo.provincia.Provincia;

public class WinNewMunicipio extends javax.swing.JFrame {

    private ListaProvincias listaProvincias;
    private PanelMunicipios pnlMunicipios;
    private ListaMunicipios listaMunicipios;
    private ListaEncargados listaEncargados;
    private ListaAfectados listaAfectados;
    
    public WinNewMunicipio() {
        initComponents();
    }
    public WinNewMunicipio(PanelMunicipios pnlMunicipios) {
        initComponents();
        this.getContentPane().setBackground(new Color(255,255,255));
        this.pnlMunicipios = pnlMunicipios;
        listaProvincias = pnlMunicipios.getListaProvincias();
        listaMunicipios = pnlMunicipios.getListaMunicipios();
        listaEncargados = pnlMunicipios.getListaEncargados();
        listaAfectados = pnlMunicipios.getListaAfectados();
        datosCombBoxCod();
        txtNombreMunicipio.setLabelText("Nombre");
        txtCodMunicipio.setLabelText("Código");
    }
    
    public void agregarMunicipio(Municipio m) {
        listaMunicipios.adiFinal(m);
        pnlMunicipios.datosTabla();
    }
    private void datosCombBoxCod() {
        combBoxCodProvincia.removeAllItems();
        NodoProvincia q = listaProvincias.getP();
        while(q!=null){
            Provincia p = q.getProvincia();
            combBoxCodProvincia.addItem(p.getCod());
            q = q.getSig();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarMunicipio = new com.swing.Button();
        txtNombreMunicipio = new com.swing.TextField();
        txtCodMunicipio = new com.swing.TextField();
        combBoxCodProvincia = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 42, 48));
        jPanel1.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Nuevo Municipio");

        btnAgregarMunicipio.setForeground(new java.awt.Color(0, 255, 0));
        btnAgregarMunicipio.setText("Agregar");
        btnAgregarMunicipio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgregarMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMunicipioActionPerformed(evt);
            }
        });

        txtNombreMunicipio.setBackground(new java.awt.Color(35, 42, 48));
        txtNombreMunicipio.setForeground(new java.awt.Color(255, 255, 255));

        txtCodMunicipio.setBackground(new java.awt.Color(35, 42, 48));
        txtCodMunicipio.setForeground(new java.awt.Color(255, 255, 255));

        combBoxCodProvincia.setBackground(new java.awt.Color(51, 51, 51));
        combBoxCodProvincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combBoxCodProvincia.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txtCodMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combBoxCodProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(combBoxCodProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnAgregarMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnAgregarMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMunicipioActionPerformed
        String nombre = txtNombreMunicipio.getText();
        String cod = txtCodMunicipio.getText();
        String codProv = combBoxCodProvincia.getSelectedItem().toString();
        ListaEncargados listaEncargados = new ListaEncargados();
        ListaAfectados listaAfectados = new ListaAfectados();
        Municipio newMunicipio = new Municipio(nombre, cod, listaEncargados, listaAfectados);
        
        listaMunicipios.adiFinal(newMunicipio);
        pnlMunicipios.datosTabla();
        txtNombreMunicipio.setText("");
        txtCodMunicipio.setText("");
        this.dispose();
    }//GEN-LAST:event_btnAgregarMunicipioActionPerformed

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
            java.util.logging.Logger.getLogger(WinNewMunicipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinNewMunicipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinNewMunicipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinNewMunicipio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinNewMunicipio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.swing.Button btnAgregarMunicipio;
    private javax.swing.JComboBox<String> combBoxCodProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private com.swing.TextField txtCodMunicipio;
    private com.swing.TextField txtNombreMunicipio;
    // End of variables declaration//GEN-END:variables
}

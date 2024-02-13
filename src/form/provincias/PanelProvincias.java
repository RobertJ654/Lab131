package form.provincias;

import archivo.Archivo;
import form.main.Principal;
import javax.swing.table.DefaultTableModel;
import modelo.provincia.ListaProvincias;
import modelo.provincia.NodoProvincia;
import modelo.provincia.Provincia;

public class PanelProvincias extends javax.swing.JPanel {
    
    Archivo archivo = new Archivo("usuarios.txt");
    private Principal main;
    private ListaProvincias listaProvincias;
    // Getters y setters
    public Principal getMain() { return main; }
    public void setMain(Principal main) { this.main = main; }
    public ListaProvincias getListaProvincias() { return listaProvincias; }
    public void setListaProvincias(ListaProvincias listaProvincias) { this.listaProvincias = listaProvincias; }
   
    public PanelProvincias() {
        initComponents();
    }
    
    public PanelProvincias(Principal main) {
        initComponents();
        this.main = main;
        DefaultTableModel model = (DefaultTableModel)tableProvincias.getModel();
        tableProvincias.fixTable(jScrollPane1);
        setOpaque(false);
        // Cargar datos a la tabla
        //this.listaProvincias = new modelo.provincia.ListaProvincias(); // Verificar dato cambiado
        listaProvincias = main.getLP();
        datosTabla();
    }
    
    public void datosTabla() {
        tableProvincias.clearTable();
        NodoProvincia p = listaProvincias.getP();
        while (p != null) {
            Provincia prov = p.getProvincia();
            objetoFila(prov);
            p = p.getSig();
        }
    }
    public void objetoFila(Provincia prov) {
        Object arr[] = new Object[]{prov.getNombre(), prov.getCod()};
        tableProvincias.addRow(arr);
    }
    
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new com.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEliminarProvincia = new com.swing.Button();
        btnAgregarProvincia = new com.swing.Button();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProvincias = new com.swing.Table();
        jLabel2 = new javax.swing.JLabel();

        roundPanel2.setBackground(new java.awt.Color(35, 42, 48));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Provincias");

        btnEliminarProvincia.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarProvincia.setText("Eliminar");
        btnEliminarProvincia.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProvinciaActionPerformed(evt);
            }
        });

        btnAgregarProvincia.setForeground(new java.awt.Color(51, 255, 0));
        btnAgregarProvincia.setText("Agregar");
        btnAgregarProvincia.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgregarProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProvinciaActionPerformed(evt);
            }
        });

        panelTable.setBackground(new java.awt.Color(35, 42, 48));

        tableProvincias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Código"
            }
        ));
        jScrollPane1.setViewportView(tableProvincias);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Información de las provincias del departamento del Beni - Bolivia");

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(20, 303, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(0, 481, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProvinciaActionPerformed
        WinNewProvincia newProvincia = new WinNewProvincia(this);
        newProvincia.setVisible(true);
    }//GEN-LAST:event_btnAgregarProvinciaActionPerformed

    private void btnEliminarProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProvinciaActionPerformed
        listaProvincias.eliFinal();
        datosTabla();
    }//GEN-LAST:event_btnEliminarProvinciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.swing.Button btnAgregarProvincia;
    private com.swing.Button btnEliminarProvincia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTable;
    private com.swing.RoundPanel roundPanel2;
    private com.swing.Table tableProvincias;
    // End of variables declaration//GEN-END:variables
}

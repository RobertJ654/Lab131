package form.municipios;

import form.afectados.PanelAfectados;
import form.encargados.PanelEncargados;
import form.main.Principal;
import javax.swing.table.DefaultTableModel;
import modelo.municipio.ListaMunicipios;
import modelo.municipio.Municipio;
import modelo.municipio.NodoMunicipio;
import modelo.personas.ListaAfectados;
import modelo.personas.ListaEncargados;
import modelo.provincia.ListaProvincias;

public class PanelMunicipios extends javax.swing.JPanel {

    private Principal main;
    private ListaProvincias listaProvincias;
    private ListaMunicipios listaMunicipios;
    private ListaEncargados listaEncargados;
    private ListaAfectados listaAfectados;
    private PanelEncargados pnlEncargados;
    private PanelAfectados pnlAfectados;
    // Getters y setters
    public Principal getMain() { return main; }
    public void setMain(Principal main) { this.main = main; }
    public ListaProvincias getListaProvincias() { return listaProvincias; }
    public void setListaProvincias(ListaProvincias listaProvincias) { this.listaProvincias = listaProvincias; }
    public ListaMunicipios getListaMunicipios() { return listaMunicipios; }
    public void setListaMunicipios(ListaMunicipios listaMunicipios) { this.listaMunicipios = listaMunicipios; }
    public ListaEncargados getListaEncargados() { return listaEncargados; }
    public void setListaEncargados(ListaEncargados listaEncargados) { this.listaEncargados = listaEncargados; }
    public ListaAfectados getListaAfectados() { return listaAfectados; }
    public void setListaAfectados(ListaAfectados listaAfectados) { this.listaAfectados = listaAfectados; }
    
    public PanelMunicipios() {
        initComponents();
    }
    
    public PanelMunicipios(Principal main, PanelEncargados pnlEncargados, PanelAfectados pnlAfectados) {
        initComponents();
        this.main = main;
        DefaultTableModel model = (DefaultTableModel)tableMunicipios.getModel();
        tableMunicipios.fixTable(jScrollPane1);
        setOpaque(false);
        // Cargar datos a la tabla
        //this.listaProvincias = new modelo.provincia.ListaProvincias();
        //this.listaMunicipios = new modelo.municipio.ListaMunicipios();
        //this.listaEncargados = new modelo.personas.ListaEncargados();
        //this.listaAfectados = new modelo.personas.ListaAfectados();
        listaProvincias = main.getLP();
        listaMunicipios = main.getLM();
        listaEncargados = main.getLE();
        listaAfectados = main.getLA();
        this.pnlEncargados = pnlEncargados;
        this.pnlAfectados = pnlAfectados;
        datosTabla();
    }
    
    public void datosTabla() {
        tableMunicipios.clearTable();
        NodoMunicipio q = listaMunicipios.getM();
        while (q != null) {
            Municipio g = q.getMunicipio();
            objetoFila(g);
            q = q.getSig();
        }
        pnlEncargados.codMunicipioCombBox();
        pnlAfectados.codMunicipioCombBox();
    }

    private void objetoFila(Municipio mun) {
        Object arr[] = new Object[]{mun.getNombre(), mun.getCod()};
        tableMunicipios.addRow(arr);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new com.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEliminarMunicipio = new com.swing.Button();
        btnAgregarMunicipio = new com.swing.Button();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMunicipios = new com.swing.Table();
        jLabel2 = new javax.swing.JLabel();

        roundPanel2.setBackground(new java.awt.Color(35, 42, 48));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Municipios");

        btnEliminarMunicipio.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarMunicipio.setText("Eliminar");
        btnEliminarMunicipio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminarMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMunicipioActionPerformed(evt);
            }
        });

        btnAgregarMunicipio.setForeground(new java.awt.Color(51, 255, 0));
        btnAgregarMunicipio.setText("Agregar");
        btnAgregarMunicipio.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgregarMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMunicipioActionPerformed(evt);
            }
        });

        panelTable.setBackground(new java.awt.Color(35, 42, 48));

        tableMunicipios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableMunicipios);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Información de los municipios por provincia");

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(20, 432, Short.MAX_VALUE))
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
                        .addComponent(btnAgregarMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(0, 473, Short.MAX_VALUE)))
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
                    .addComponent(btnEliminarMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAgregarMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMunicipioActionPerformed
        WinNewMunicipio newMunicipio = new WinNewMunicipio(this);
        newMunicipio.setVisible(true);
    }//GEN-LAST:event_btnAgregarMunicipioActionPerformed

    private void btnEliminarMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMunicipioActionPerformed
        listaMunicipios.eliFinal();
        datosTabla();
    }//GEN-LAST:event_btnEliminarMunicipioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.swing.Button btnAgregarMunicipio;
    private com.swing.Button btnEliminarMunicipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTable;
    private com.swing.RoundPanel roundPanel2;
    private com.swing.Table tableMunicipios;
    // End of variables declaration//GEN-END:variables
}

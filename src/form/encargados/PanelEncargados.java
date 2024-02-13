package form.encargados;

import form.main.Principal;
import javax.swing.table.DefaultTableModel;
import modelo.municipio.ListaMunicipios;
import modelo.municipio.Municipio;
import modelo.municipio.NodoMunicipio;
import modelo.personas.Encargado;
import modelo.personas.ListaEncargados;
import modelo.personas.NodoEncargado;

public class PanelEncargados extends javax.swing.JPanel {

    private Principal main;
    private ListaMunicipios listaMunicipios;
    
    public PanelEncargados() {
        initComponents();
    }
    
    public PanelEncargados(Principal main) {
        initComponents();
        DefaultTableModel model = (DefaultTableModel)tableEncargados.getModel();
        tableEncargados.fixTable(jScrollPane1);
        setOpaque(false);
        // Cargar datos a la tabla
        //this.listaMunicipios = new modelo.municipio.ListaMunicipios();
        this.main = main;
        listaMunicipios = main.getLM();
        codMunicipioCombBox();
        datosTabla();
    }
    
    
    public void codMunicipioCombBox() {
        combBoxMunicipios.removeAllItems();
        NodoMunicipio q = listaMunicipios.getM();
        while (q != null) {
            Municipio m = q.getMunicipio();
            combBoxMunicipios.addItem(m.getCod());
            q = q.getSig();
        }
    }
    
    public void datosTabla() {
        Object selectedItem = combBoxMunicipios.getSelectedItem();
        String codX = combBoxMunicipios.getSelectedItem().toString();
        ListaEncargados listaEncargados = getListaEncargados(codX);
        tableEncargados.clearTable();
        NodoEncargado q = listaEncargados.getE();
        while (q != null) {
            Encargado e = q.getEncargado();
            objetoFila(e);
            q = q.getSig();
        }
    }
    
    private void objetoFila(Encargado x) {
        Object arr[] = new Object[]{x.getNombre(), x.getEdad(), x.getCi(), x.getGenero(), x.getCargo(), x.getSueldo()};
        tableEncargados.addRow(arr);
    }
    
    private ListaEncargados getListaEncargados(String codX) {
        NodoMunicipio q = listaMunicipios.getM();
        while (q != null) {
            Municipio v = q.getMunicipio();
            if (v.getCod().equals(codX)) {
                return v.getLE();
            }
            q = q.getSig();
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new com.swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEliminarEncargado = new com.swing.Button();
        btnAgregarEncargado = new com.swing.Button();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEncargados = new com.swing.Table();
        combBoxMunicipios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        roundPanel2.setBackground(new java.awt.Color(35, 42, 48));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Encargados");

        btnEliminarEncargado.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarEncargado.setText("Eliminar");
        btnEliminarEncargado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminarEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEncargadoActionPerformed(evt);
            }
        });

        btnAgregarEncargado.setForeground(new java.awt.Color(51, 255, 0));
        btnAgregarEncargado.setText("Agregar");
        btnAgregarEncargado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgregarEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEncargadoActionPerformed(evt);
            }
        });

        panelTable.setBackground(new java.awt.Color(35, 42, 48));

        tableEncargados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Edad", "CI", "Genero", "Cargo", "Sueldo"
            }
        ));
        jScrollPane1.setViewportView(tableEncargados);

        combBoxMunicipios.setBackground(new java.awt.Color(51, 51, 51));
        combBoxMunicipios.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        combBoxMunicipios.setForeground(new java.awt.Color(204, 204, 204));
        combBoxMunicipios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combBoxMunicipios.setFocusable(false);
        combBoxMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combBoxMunicipiosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Información de los encargados por provincias");

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(combBoxMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addGroup(panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(combBoxMunicipios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
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
                        .addComponent(btnAgregarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(0, 459, Short.MAX_VALUE)))
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
                    .addComponent(btnEliminarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAgregarEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEncargadoActionPerformed
        ListaEncargados listaEncargados = getListaEncargados(combBoxMunicipios.getSelectedItem().toString());
        WinNewEncargado newEncargado = new WinNewEncargado(this, listaEncargados);
        newEncargado.setVisible(true);
    }//GEN-LAST:event_btnAgregarEncargadoActionPerformed

    private void btnEliminarEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEncargadoActionPerformed
        ListaEncargados listaEncargados = getListaEncargados(combBoxMunicipios.getSelectedItem().toString());
        listaEncargados.eliFinal();
        datosTabla();
    }//GEN-LAST:event_btnEliminarEncargadoActionPerformed

    private void combBoxMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combBoxMunicipiosActionPerformed
        if (combBoxMunicipios.getSelectedIndex() > -1)
            datosTabla();
    }//GEN-LAST:event_combBoxMunicipiosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.swing.Button btnAgregarEncargado;
    private com.swing.Button btnEliminarEncargado;
    private javax.swing.JComboBox<String> combBoxMunicipios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTable;
    private com.swing.RoundPanel roundPanel2;
    private com.swing.Table tableEncargados;
    // End of variables declaration//GEN-END:variables
}

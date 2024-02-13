package form.afectados;

import form.main.Principal;
import javax.swing.table.DefaultTableModel;
import modelo.municipio.ListaMunicipios;
import modelo.municipio.Municipio;
import modelo.municipio.NodoMunicipio;
import modelo.personas.Afectado;
import modelo.personas.ListaAfectados;
import modelo.personas.NodoAfectado;

public class PanelAfectados extends javax.swing.JPanel {

    private Principal main;
    private ListaMunicipios listaMunicipios;
    
    public PanelAfectados() {
        initComponents();
    }
    
    public PanelAfectados(Principal main) {
        initComponents();
        DefaultTableModel model = (DefaultTableModel)tableAfectados.getModel();
        tableAfectados.fixTable(jScrollPane1);
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
        String codX = combBoxMunicipios.getSelectedItem().toString();
        ListaAfectados listaAfectados = getListaAfectados(codX);
        tableAfectados.clearTable();
        NodoAfectado q = listaAfectados.getA();
        while (q != null) {
            Afectado a = q.getAfectado();
            objetoFila(a);
            q = q.getSig();
        }
    }
    
    private void objetoFila(Afectado x) {
        Object arr[] = new Object[]{x.getNombre(), x.getEdad(), x.getCi(), x.getGenero(), x.getObs()};
        tableAfectados.addRow(arr);
    }
    
    private ListaAfectados getListaAfectados(String codX) {
        NodoMunicipio q = listaMunicipios.getM();
        while (q != null) {
            Municipio v = q.getMunicipio();
            if (v.getCod().equals(codX)) {
                return v.getLA();
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
        btnEliminarAfectado = new com.swing.Button();
        btnAgregarAfectado = new com.swing.Button();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAfectados = new com.swing.Table();
        combBoxMunicipios = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        roundPanel2.setBackground(new java.awt.Color(35, 42, 48));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista de Afectados");

        btnEliminarAfectado.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminarAfectado.setText("Eliminar");
        btnEliminarAfectado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEliminarAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAfectadoActionPerformed(evt);
            }
        });

        btnAgregarAfectado.setForeground(new java.awt.Color(51, 255, 0));
        btnAgregarAfectado.setText("Agregar");
        btnAgregarAfectado.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnAgregarAfectado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAfectadoActionPerformed(evt);
            }
        });

        panelTable.setBackground(new java.awt.Color(35, 42, 48));

        tableAfectados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Edad", "CI", "Genero", "Obs."
            }
        ));
        jScrollPane1.setViewportView(tableAfectados);

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
        jLabel2.setText("Información de los afectados por provincias");

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
                        .addComponent(btnAgregarAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(0, 478, Short.MAX_VALUE)))
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
                    .addComponent(btnEliminarAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarAfectado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnAgregarAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAfectadoActionPerformed
        ListaAfectados listaAfectados = getListaAfectados(combBoxMunicipios.getSelectedItem().toString());
        WinNewAfectado newAfectado = new WinNewAfectado(this, listaAfectados);
        newAfectado.setVisible(true);
    }//GEN-LAST:event_btnAgregarAfectadoActionPerformed

    private void btnEliminarAfectadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAfectadoActionPerformed
        ListaAfectados listaAfectados = getListaAfectados(combBoxMunicipios.getSelectedItem().toString());
        listaAfectados.eliFinal();
        datosTabla();
    }//GEN-LAST:event_btnEliminarAfectadoActionPerformed

    private void combBoxMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combBoxMunicipiosActionPerformed
        if (combBoxMunicipios.getSelectedIndex() > -1)
            datosTabla();
    }//GEN-LAST:event_combBoxMunicipiosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.swing.Button btnAgregarAfectado;
    private com.swing.Button btnEliminarAfectado;
    private javax.swing.JComboBox<String> combBoxMunicipios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelTable;
    private com.swing.RoundPanel roundPanel2;
    private com.swing.Table tableAfectados;
    // End of variables declaration//GEN-END:variables
}

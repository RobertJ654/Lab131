package form.main;

import archivo.Archivo;
import form.afectados.PanelAfectados;
import form.encargados.PanelEncargados;
import form.municipios.PanelMunicipios;
import form.provincias.PanelProvincias;
import java.awt.Component;
import java.awt.Dimension;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.municipio.ListaMunicipios;
import modelo.municipio.Municipio;
import modelo.personas.Afectado;
import modelo.personas.Encargado;
import modelo.personas.ListaAfectados;
import modelo.personas.ListaEncargados;
import modelo.provincia.ListaProvincias;
import modelo.provincia.Provincia;

public class Principal extends javax.swing.JFrame {

    // Estructuras
    private ListaProvincias LP;
    private ListaMunicipios LM;
    private ListaEncargados LE;
    private ListaAfectados LA;
    // Getters y setters
    public ListaProvincias getLP() { return LP; }
    public void setLP(ListaProvincias LP) { this.LP = LP; }
    public ListaMunicipios getLM() { return LM; }
    public void setLM(ListaMunicipios LM) { this.LM = LM; }
    public ListaEncargados getLE() { return LE; }
    public void setLE(ListaEncargados LE) { this.LE = LE; }
    public ListaAfectados getLA() { return LA; }
    public void setLA(ListaAfectados LA) { this.LA = LA; }
    // Paneles
    private PanelProvincias pnlProvincias;
    private PanelMunicipios pnlMunicipios;
    private PanelEncargados pnlEncargados;
    private PanelAfectados pnlAfectados;
    // Archivo
    Archivo archivo = new Archivo("datos.txt");
    
    public Principal() throws IOException {
        initComponents();
        //cargarDatos();
        
        cargarEstructuras();
        guardarEstructuras();
        
        iniciarPaneles();
        showForm(new Form_Num(0));
    }

    // Cambia el formulario del body
    private void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.revalidate();
        body.repaint();
    }
    

    private void iniciarPaneles() throws IOException {
        
        pnlAfectados = new PanelAfectados(Principal.this);
        pnlEncargados = new PanelEncargados(Principal.this);
        pnlMunicipios = new PanelMunicipios(Principal.this, pnlEncargados, pnlAfectados);
        pnlProvincias = new PanelProvincias(Principal.this);
        EventMenu event = new EventMenu() {
            public void selected(int index) {
                System.out.print(index);
                switch (index) {
                    case 0:
                        showForm(new Form_Num(index));
                        break;
                    case 1:
                        try {
                            showForm(pnlProvincias);
                        break;
                        } catch(Exception e) {
                            
                        }
                        
                    case 2:
                        try {
                            showForm(pnlMunicipios);
                        break;
                        } catch(Exception e) {
                            
                        }
                    case 3:
                        try {
                            showForm(pnlEncargados);
                        break;
                        } catch(Exception e) {
                            
                        }
                    case 4:
                        try {
                            showForm(pnlAfectados);
                        break;
                        } catch(Exception e) {
                            
                        }
                    case 5:
                        System.out.println("Salir");
                        dispose();
                        break;  
                }
            }
        };
        menu.initMenu(event);
    }
    
    public void cargarDatos() {
        Encargado e1 = new Encargado("Lucas", 25, 123456, "M", "Contador", 2100);
        Encargado e2 = new Encargado("Pedro", 25, 123456, "M", "Contador", 2100);
        Afectado a1 = new Afectado("Sofia", 30, 456789, "F", "Sin observaciones");
        Afectado a2 = new Afectado("María", 30, 456789, "F", "Sin observaciones");
        
        LE = new ListaEncargados();
        LE.adiFinal(e1);
        LE.adiFinal(e2);
        LA = new ListaAfectados();
        LA.adiFinal(a1);
        LA.adiFinal(a2);
        
        // Cercado
        Municipio m11 = new Municipio("Trinidad", "M_011", LE, LA);
        Municipio m12 = new Municipio("San Javier", "M_012", LE, LA);
        // Antonio Vaca Díaz
        Municipio m21 = new Municipio("Riberalta", "M_021", LE, LA);
        Municipio m22 = new Municipio("Villa Bella", "M_022", LE, LA);
        Municipio m23 = new Municipio("Guayaramerín", "M_023", LE, LA);
        Municipio m24 = new Municipio("Peña María", "M_024", LE, LA);
        Municipio m25 = new Municipio("Cachuela Esperanza", "M_025", LE, LA);
        Municipio m26 = new Municipio("Tumi Chuqua", "M_026", LE, LA);
        Municipio m27 = new Municipio("El triángulo", "M_027", LE, LA);
        // General José Ballivián
        Municipio m31 = new Municipio("Santos Reyes", "M_031", LE, LA);
        Municipio m32 = new Municipio("San Borja", "M_032", LE, LA);
        Municipio m33 = new Municipio("Santa Rosa de Yacuma", "M_033", LE, LA);
        Municipio m34 = new Municipio("Rurrenabaque", "M_034", LE, LA);
        // Yacuma
        Municipio m41 = new Municipio("Santa Ana de Yacuma", "M_041", LE, LA);
        Municipio m42 = new Municipio("Exaltación", "M_042", LE, LA);
        Municipio m43 = new Municipio("Santa Rosa", "M_043", LE, LA);
        Municipio m44 = new Municipio("Puerto Siles", "M_044", LE, LA);
        // Mojos
        Municipio m51 = new Municipio("San Ignacio de Mojos", "M_051", LE, LA);
        Municipio m52 = new Municipio("San Lorenzo", "M_052", LE, LA);
        // Marban
        Municipio m61 = new Municipio("Loreto", "M_061", LE, LA);
        Municipio m62 = new Municipio("San Andrés", "M_062", LE, LA);
        // Mamoré
        Municipio m71 = new Municipio("Puerto Siles", "M_071", LE, LA);
        Municipio m72 = new Municipio("San Joaquín", "M_072", LE, LA);
        Municipio m73 = new Municipio("San Ramón", "M_073", LE, LA);
        // Itenez
        Municipio m81 = new Municipio("Magdalena", "M_081", LE, LA);
        Municipio m82 = new Municipio("Baures", "M_082", LE, LA);
        Municipio m83 = new Municipio("Huancaraje", "M_083", LE, LA);
        // Agregar a la lista de Municipios
        LM = new ListaMunicipios();
        LM.adiFinal(m11);
        LM.adiFinal(m12);
        LM.adiFinal(m21);
        LM.adiFinal(m22);
        LM.adiFinal(m23);
        LM.adiFinal(m24);
        LM.adiFinal(m25);
        LM.adiFinal(m26);
        LM.adiFinal(m27);
        LM.adiFinal(m31);
        LM.adiFinal(m32);
        LM.adiFinal(m33);
        LM.adiFinal(m34);
        LM.adiFinal(m41);
        LM.adiFinal(m42);
        LM.adiFinal(m43);
        LM.adiFinal(m44);
        LM.adiFinal(m51);
        LM.adiFinal(m52);
        LM.adiFinal(m61);
        LM.adiFinal(m62);
        LM.adiFinal(m71);
        LM.adiFinal(m72);
        LM.adiFinal(m73);
        LM.adiFinal(m81);
        LM.adiFinal(m82);
        LM.adiFinal(m83);
        
        Provincia p1 = new Provincia("Cercado", "P_001");
        Provincia p2 = new Provincia("Antonio Vaca Díaz", "P_002");
        Provincia p3 = new Provincia("General José Ballivián", "P_003");
        Provincia p4 = new Provincia("Yacuma", "P_004");
        Provincia p5 = new Provincia("Mojos", "P_005");
        Provincia p6 = new Provincia("Marban", "P_006");
        Provincia p7 = new Provincia("Mamoré", "P_007");
        Provincia p8 = new Provincia("Itenez", "P_008");
        // Agregar a la lista de Provincias
        LP = new ListaProvincias();
        LP.adiFinal(p1);
        LP.adiFinal(p2);
        LP.adiFinal(p3);
        LP.adiFinal(p4);
        LP.adiFinal(p5);
        LP.adiFinal(p6);
        LP.adiFinal(p7);
        LP.adiFinal(p8);
        
        LP.mostrar();
        LM.mostrar();
        
    }
    
    
    private void cargarEstructuras() throws IOException {
        LinkedList<Object> estructuras = archivo.leerEstructuras();
        ListIterator<Object> it = estructuras.listIterator();
        int c = 0;
        while (it.hasNext()) {
            if (c == 0)
                LP = (ListaProvincias)it.next();
            else
                LM = (ListaMunicipios)it.next();
            c++;
        }
    }
    
    private void guardarEstructuras() throws IOException {
        LinkedList<Object> estructuras = new LinkedList<>();
        estructuras.add(LP);
        estructuras.add(LM);
        archivo.guardarEstructuras(estructuras);
    }
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        menu = new form.main.Menu();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel.setBackground(new java.awt.Color(0, 0, 0));
        jPanel.setMinimumSize(new java.awt.Dimension(1000, 600));

        body.setBackground(new java.awt.Color(0, 0, 0));
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            guardarEstructuras();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal main;
                try {
                    main = new Principal();
                    main.setMinimumSize(new Dimension(1100, 720));
                    main.setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel jPanel;
    private form.main.Menu menu;
    // End of variables declaration//GEN-END:variables
}

package login;

import archivo.Archivo;
import com.login.Button;
import com.login.MyPasswordField;
import com.login.MyTextField;
import form.main.Main;
import form.main.Principal;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.miginfocom.swing.MigLayout;

public class PanelLoginAndRegister extends javax.swing.JLayeredPane {
    
    private Pila users;
    
    public PanelLoginAndRegister(Pila users) throws IOException {
        this.users = users;
        initComponents();
        initRegister(users);
        initLogin(users);
        login.setVisible(false);
        register.setVisible(true);
    }

    private void initRegister(Pila users) {
        register.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Create Account");
        label.setFont(new Font("sansserif", 1, 35));
        label.setForeground(new Color(35,42,48));
        register.add(label);
        // Crear usuario
        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/images/user.png")));
        txtUser.setHint("Nombre");
        register.add(txtUser, "w 60%");
        // Crear contraseña
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/images/pass.png")));
        txtPass.setHint("Contraseña");
        register.add(txtPass, "w 60%");
        // Botón de registrarse
        Button cmd = new Button();
        cmd.setBackground(new Color(35,42,48));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("REGISTRARSE");
        cmd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Usuario uIngresado = new Usuario(txtUser.getText(), txtPass.getText());
                if (!txtUser.getText().isBlank() && !txtPass.getText().isBlank()) {
                    users.adicionar((Object)uIngresado);
                    txtUser.setText("");
                    txtPass.setText("");
                    System.out.println("Registro exitoso");
                    users.mostrar();
                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    //formWindowClosing();
                }
                else {
                    txtUser.setText("");
                    txtPass.setText("");
                    System.out.println("Ingrese dartos válidos");
                    JOptionPane.showMessageDialog(null, "Ingrese datos válidos");
                }
            }
        });
        register.add(cmd, "w 40%, h 40");
    }

    private void initLogin(Pila users) {
        login.setLayout(new MigLayout("wrap", "push[center]push", "push[]25[]10[]10[]25[]push"));
        JLabel label = new JLabel("Sign In");
        label.setFont(new Font("sansserif", 1, 35));
        label.setForeground(new Color(35,42,48));
        login.add(label);
        // Crear usuario
        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/images/user.png")));
        txtUser.setHint("Nombre");
        login.add(txtUser, "w 60%");
        // Ingresar contraseña
        MyPasswordField txtPass = new MyPasswordField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/images/pass.png")));
        txtPass.setHint("Contraseña");
        login.add(txtPass, "w 60%");
        JButton cmdForget = new JButton("¿Olvidaste tu contraseña?");
        cmdForget.setForeground(new Color(100, 100, 100));
        cmdForget.setFont(new Font("sansserif", 1, 12));
        cmdForget.setContentAreaFilled(false);
        cmdForget.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdForget);
        // Botón de Ingresar
        Button cmd = new Button();
        cmd.setBackground(new Color(35,42,48));
        cmd.setForeground(new Color(250, 250, 250));
        cmd.setText("INGRESAR");
        cmd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Usuario uIngresado = new Usuario(txtUser.getText(), txtPass.getText());
                if (verifUsuario(uIngresado)) {
                    try {
                        Principal principal = new Principal();
                        principal.setVisible(true);
                    } catch (IOException ex) {
                        Logger.getLogger(PanelLoginAndRegister.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Ingreso exitoso");
                    txtUser.setText("");
                    txtPass.setText("");
                }
                else {
                    txtUser.setText("");
                    txtPass.setText("");
                    System.out.println("Nombre de usuario o contraseña incorrecta");
                    JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrecta");
                }
            }
        });
        login.add(cmd, "w 40%, h 40");
    }
    
    public boolean verifUsuario(Usuario u) {
        boolean sw = false;
        if (!users.esVacia()) {
            Pila aux = new Pila(100);
            while (!users.esVacia()) {
                Usuario x = (Usuario)users.eliminar();
                if (x.getUser().equals(u.getUser()) && x.getPassword().equals(u.getPassword()))
                    sw = true;
                aux.adicionar((Object)x);
            }
            users.vaciar(aux);
        } 
        return sw;
    }
    

    public void showRegister(boolean show) {
        if (show) {
            register.setVisible(true);
            login.setVisible(false);
        } else {
            register.setVisible(false);
            login.setVisible(true);
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}

package login;

import java.io.Serializable;

public class Usuario implements Serializable {
    
    private String user;
    private String password;
    
    public Usuario() {
    }
    
    public Usuario(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    public void mostrar() {
        System.out.printf(toString());
    }
    public String toString() {
        return String.format("Usuario: %s, Password: %s", user, password);
    }


    // Getters y setters
    public String getUser() { return user; }
    public void setUser(String user) { this.user = user; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    
}

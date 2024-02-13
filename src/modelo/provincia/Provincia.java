package modelo.provincia;

import java.io.Serializable;

public class Provincia implements Serializable {
    
    private String nombre;
    private String cod;
    
    public Provincia() {
    }
    
    public Provincia(String nombre, String cod) {
        this.nombre = nombre;
        this.cod = cod;
    }
    
    public void mostrar() {
        System.out.println(" * * * PROVINCIA * * * ");
        System.out.printf("Nombre: %s, Cod: %s\n", nombre, cod);
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCod() { return cod; }
    public void setCod(String cod) { this.cod = cod; }
    
}

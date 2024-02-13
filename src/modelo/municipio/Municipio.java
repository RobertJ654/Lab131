package modelo.municipio;

import java.io.Serializable;
import modelo.personas.ListaAfectados;
import modelo.personas.ListaEncargados;

public class Municipio implements Serializable {
    
    private String nombre;
    private String cod;
    private ListaEncargados LE;
    private ListaAfectados LA;
    
    public Municipio() {
    }
    
    public Municipio(String nombre, String cod, ListaEncargados LE, ListaAfectados LA) {
        this.nombre = nombre;
        this.cod = cod;
        this.LE = LE;
        this.LA = LA;
    }
    
    public void mostrar() {
        System.out.println(" * * MUNICIPIO * * ");
        System.out.printf("Nombre: %s, Cod: %s\n", nombre, cod);
        LE.mostrar();
        LA.mostrar();
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCod() { return cod; }
    public void setCod(String cod) { this.cod = cod; }
    public ListaEncargados getLE() { return LE; }
    public void setLE(ListaEncargados LE) { this.LE = LE; }
    public ListaAfectados getLA() { return LA; }
    public void setLA(ListaAfectados LA) { this.LA = LA; }
    
}

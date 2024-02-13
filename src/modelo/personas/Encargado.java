package modelo.personas;

import java.io.Serializable;

public class Encargado extends Persona implements Serializable{
    
    private String cargo;
    private int sueldo;
    
    public Encargado() {
        super();
    }
    
    public Encargado(String nombre, int edad, int ci, String genero, String cargo, int sueldo) {
        super(nombre, edad, ci, genero);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    
    public void mostrar() {
        System.out.println("ENCARGADO");
        super.mostrar();
        System.out.printf("Cargo: %s,Sueldo: %d\n", cargo, sueldo);
    }

    // Getters y setters
    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }
    public int getSueldo() { return sueldo; }
    public void setSueldo(int sueldo) { this.sueldo = sueldo; }
    
}

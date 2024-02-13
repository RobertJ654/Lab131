package modelo.personas;

import java.io.Serializable;

public class Afectado extends Persona implements Serializable{
    
    private String obs;
    
    public Afectado() {
        super();
    }
    
    public Afectado(String nombre, int edad, int ci, String genero, String obs) {
        super(nombre, edad, ci, genero);
        this.obs = obs;
    }
    
    public void mostrar() {
        System.out.println("AFECTADO");
        super.mostrar();
        System.out.printf("Obs.: %s\n", obs);
    }

    // Getters y setters
    public String getObs() { return obs; }
    public void setObs(String obs) { this.obs = obs; }    
    
}

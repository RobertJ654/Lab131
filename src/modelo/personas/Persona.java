package modelo.personas;

import java.io.Serializable;

public class Persona implements Serializable {
    
    private String nombre;
    private int edad;
    private int ci;
    private String genero;

    public Persona() {
    }
    
    public Persona(String nombre, int edad, int ci, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.ci = ci;
        this.genero = genero;
    }

    public void mostrar() {
        System.out.printf("Nombre: %s, Edad: %d, CI: %d, Genero: %s", nombre, edad, ci, genero);
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public int getCi() { return ci; }
    public void setCi(int ci) { this.ci = ci; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

}

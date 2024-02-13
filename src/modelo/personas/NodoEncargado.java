package modelo.personas;

import java.io.Serializable;

public class NodoEncargado implements Serializable{
    
    private Encargado encargado;
    private NodoEncargado ant, sig;
    
    public NodoEncargado() {
        ant = sig = null;
    }

    // Getters y setters
    public Encargado getEncargado() { return encargado; }
    public void setEncargado(Encargado encargado) { this.encargado = encargado; }
    public NodoEncargado getAnt() { return ant; }
    public void setAnt(NodoEncargado ant) { this.ant = ant; }
    public NodoEncargado getSig() { return sig; }
    public void setSig(NodoEncargado sig) { this.sig = sig; }
    
}

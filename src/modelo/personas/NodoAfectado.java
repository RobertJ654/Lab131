package modelo.personas;

import java.io.Serializable;

public class NodoAfectado implements Serializable{
    
    private Afectado afectado;
    private NodoAfectado ant, sig;
    
    public NodoAfectado() {
        ant = sig = null;
    }

    // Getters y setters
    public Afectado getAfectado() { return afectado; }
    public void setAfectado(Afectado afectado) { this.afectado = afectado; }
    public NodoAfectado getAnt() { return ant; }
    public void setAnt(NodoAfectado ant) { this.ant = ant; }
    public NodoAfectado getSig() { return sig; }
    public void setSig(NodoAfectado sig) { this.sig = sig; }

}

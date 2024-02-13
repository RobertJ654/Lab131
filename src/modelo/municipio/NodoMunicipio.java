package modelo.municipio;

import java.io.Serializable;

public class NodoMunicipio implements Serializable {
    
    private Municipio municipio;
    private NodoMunicipio ant, sig;
    
    public NodoMunicipio() {
        ant = sig = null;
    }

    // Getters y setters
    public Municipio getMunicipio() { return municipio; }
    public void setMunicipio(Municipio municipio) { this.municipio = municipio; }
    public NodoMunicipio getAnt() { return ant; }
    public void setAnt(NodoMunicipio ant) { this.ant = ant; }
    public NodoMunicipio getSig() { return sig; }
    public void setSig(NodoMunicipio sig) { this.sig = sig; }
    
}

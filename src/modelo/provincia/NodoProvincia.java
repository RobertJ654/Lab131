package modelo.provincia;

import java.io.Serializable;

public class NodoProvincia implements Serializable {
    
    private Provincia provincia;
    private NodoProvincia ant, sig;
    
    public NodoProvincia() {
        ant = sig = null;
    }

    // Getters y setters
    public Provincia getProvincia() { return provincia; }
    public void setProvincia(Provincia provincia) { this.provincia = provincia; }
    public NodoProvincia getAnt() { return ant; }
    public void setAnt(NodoProvincia ant) { this.ant = ant; }
    public NodoProvincia getSig() { return sig; }
    public void setSig(NodoProvincia sig) { this.sig = sig; }
    
}

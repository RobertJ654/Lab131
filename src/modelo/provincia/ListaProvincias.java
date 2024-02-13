package modelo.provincia;

import java.io.Serializable;

public class ListaProvincias implements Serializable {
    
    private NodoProvincia p;
    
    public ListaProvincias() {
        p = null;
    }
    
    
    public void adiFinal(Provincia provincia) {
        NodoProvincia nuevo = new NodoProvincia();
        nuevo.setProvincia(provincia);
        if (getP()== null) {
            setP(nuevo);
        } else {
            NodoProvincia x = getP();
            while (x.getSig() != null) {
                x = x.getSig();
            }
            x.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoProvincia x = getP();
        System.out.println(" * * * LISTA DE PROVINCIAS * * * ");
        if (x != null) {
            while (x != null) {
                x.getProvincia().mostrar();
                x = x.getSig();
            }
        } else {
            System.out.println("Lista vacia");
        }
    }

    public NodoProvincia eliFinal() {
        NodoProvincia x = getP();
        if (x != null) {
            if (x.getSig() == null) {
                setP(null);
            } else {
                NodoProvincia y = getP();
                while (x.getSig() != null) {
                    y = x;
                    x = x.getSig();
                }
                y.setSig(null);
            }
        }
        return x;
    }

    // Getters y setters
    public NodoProvincia getP() { return p; }
    public void setP(NodoProvincia p) { this.p = p; }
    
}

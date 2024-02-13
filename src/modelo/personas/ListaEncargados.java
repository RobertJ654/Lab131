package modelo.personas;

import java.io.Serializable;

public class ListaEncargados implements Serializable {
    
    private NodoEncargado e;
    
    public ListaEncargados() {
        e = null;
    }
    
    public void adiFinal(Encargado encargado) {
        NodoEncargado nuevo = new NodoEncargado();
        nuevo.setEncargado(encargado);
        if (getE()== null) {
            setE(nuevo);
        } else {
            NodoEncargado x = getE();
            while (x.getSig() != null) {
                x = x.getSig();
            }
            x.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoEncargado x = getE();
        System.out.println(" * LISTA DE ENCARGADOS * ");
        if (x != null) {
            while (x != null) {
                x.getEncargado().mostrar();
                x = x.getSig();
            }
        } else {
            System.out.println("Lista vacia");
        }
    }

    public NodoEncargado eliFinal() {
        NodoEncargado x = getE();
        if (x != null) {
            if (x.getSig() == null) {
                setE(null);
            } else {
                NodoEncargado y = getE();
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
    public NodoEncargado getE() { return e; }
    public void setE(NodoEncargado e) { this.e = e; }
    
}

package modelo.personas;

import java.io.Serializable;

public class ListaAfectados implements Serializable {
    
    private NodoAfectado a;
    
    public ListaAfectados() {
        a = null;
    }
    
    public void adiFinal(Afectado afectado) {
        NodoAfectado nuevo = new NodoAfectado();
        nuevo.setAfectado(afectado);
        if (getA() == null) {
            setA(nuevo);
        } else {
            NodoAfectado x = getA();
            while (x.getSig() != null) {
                x = x.getSig();
            }
            x.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoAfectado x = getA();
        System.out.println(" * LISTA DE AFECTADOS * ");
        if (x != null) {
            while (x != null) {
                x.getAfectado().mostrar();
                x = x.getSig();
            }
        } else {
            System.out.println("Lista vacia");
        }
    }

    public NodoAfectado eliFinal() {
        NodoAfectado x = getA();
        if (x != null) {
            if (x.getSig() == null) {
                setA(null);
            } else {
                NodoAfectado y = getA();
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
    public NodoAfectado getA() { return a; }
    public void setA(NodoAfectado a) { this.a = a; }
    
}

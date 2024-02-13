package modelo.municipio;

import java.io.Serializable;

public class ListaMunicipios implements Serializable {
    
    private NodoMunicipio m;
    
    public ListaMunicipios() {
        m = null;
    }
    
    public void adiFinal(Municipio municipio) {
        NodoMunicipio nuevo = new NodoMunicipio();
        nuevo.setMunicipio(municipio);
        if (getM()== null) {
            setM(nuevo);
        } else {
            NodoMunicipio x = getM();
            while (x.getSig() != null) {
                x = x.getSig();
            }
            x.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoMunicipio x = getM();
        System.out.println(" * * LISTA DE MUNICIPIOS * * ");
        if (x != null) {
            while (x != null) {
                x.getMunicipio().mostrar();
                x = x.getSig();
            }
        } else {
            System.out.println("Lista vacia");
        }
    }

    public NodoMunicipio eliFinal() {
        NodoMunicipio x = getM();
        if (x != null) {
            if (x.getSig() == null) {
                setM(null);
            } else {
                NodoMunicipio y = getM();
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
    public NodoMunicipio getM() { return m; }
    public void setM(NodoMunicipio m) { this.m = m; }
    
}

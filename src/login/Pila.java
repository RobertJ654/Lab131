package login;

import java.io.Serializable;

public class Pila implements Serializable {

	private int tope, max;
	private Object v [] = new Object [100];
	
	public Pila() { }
	public Pila(int cap) {
		max = cap;
		tope = 0;
	}
	
	public boolean esVacia() {
		return tope == 0;
	}
	public boolean esLlena() {
		return max == tope;
	}
	public void adicionar(Object x) {
		if (!esLlena()) {
			tope++;
			v[tope] = x;
		} else
			System.out.println("Pila llena");
	}
	public Object eliminar() {
		Object x = null;
		if (!esVacia()) {
			x = v[tope];
			tope--;
		}
		return x;
	}
	public void mostrar() {
		Pila aux = new Pila(max);
		Object x = null;
		while (!esVacia())
			aux.adicionar(eliminar());
		while (!aux.esVacia()) {
			x = aux.eliminar();
			System.out.println(x);
			adicionar(x);
		}
	}
	public int nroElem() {
		return tope;
	}
	public void vaciar(Pila x) {
		while (!x.esVacia())
			adicionar(x.eliminar());
	}
	public boolean buscar(Object x) {
		for (int i = 1; i <= tope; i++) {
			if (v[i].equals(x))
				return true;
		}
		return false;
	}
	
	// Getters y setters
	public int getTope() { return tope; }
	public void setTope(int tope) { this.tope = tope; }
	public int getMax() { return max; }
	public void setMax(int max) { this.max = max; }
	public Object[] getV() { return v; }
	public void setV(Object[] v) { this.v = v; }

}




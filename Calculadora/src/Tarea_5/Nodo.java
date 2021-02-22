package Tarea_5;

public class Nodo {

	int elemento1;
	int elemento2;
	Nodo siguiente;
	public Nodo anterior;
	
	
	
	public Nodo(int elemento1, int elemento2, Nodo siguiente, Nodo anterior) {
		this.elemento1 = elemento1;
		this.elemento2 = elemento2;
		this.siguiente = siguiente;
		this.anterior = anterior;
	}
	
	public int getElemento1() {
		return elemento1;
	}
	public void setElemento1(int elemento1) {
		this.elemento1 = elemento1;
	}
	public int getElemento2() {
		return elemento2;
	}
	public void setElemento2(int elemento2) {
		this.elemento2 = elemento2;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public Nodo getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	
	
	
}

package Tarea_4;

import java.util.ArrayList;


class Estudiante{
	private String nombreCompleto;

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	protected static void imprimirNombre(ArrayList<String> estudiante) {
		for (String i : estudiante) {
			System.out.println(i);
		}
		
	}
	
	protected static void bubleSort(ArrayList<String> estudiante) {
		for (int i = 0; i < estudiante.size(); i++) {
			Object temp = null;
			if ((estudiante.get(i).compareTo(estudiante.get(i + 1))) > 0) {
				temp = estudiante.get(i + 1);
				estudiante.set(i, estudiante.get(i+1));
				estudiante.set(i + 1, (String) temp);
			}
		}
		imprimirNombre(estudiante);
	}

	protected static void insertionSort(ArrayList<String> estudiante) {

			for (int j = 1; j < estudiante.size(); j++) {
				String temporal = estudiante.get(j);
				int i = j - 1;
				while ((estudiante.get(i).charAt(0) > estudiante.get(j).charAt(0))) {
					estudiante.set(i + 1, estudiante.get(i));
					i--;
				}
				temporal = estudiante.get(i + 1);
		}
		imprimirNombre(estudiante);
	}

	protected static void selectionSort(ArrayList<String> estudiante) {
		
		
		for (int i = 0; i < estudiante.size() ; i++) {
			String ultimo = estudiante.get(i);
			int indiceMenor = i;
			for (int j = i; j < estudiante.size(); j++) {
				String valor = estudiante.get(j);
				if (valor.compareTo(ultimo) < 0) {
					ultimo = valor;
					indiceMenor = j;
				}
			}
			
			if (indiceMenor != i) {
				String primero = estudiante.get(i);
				estudiante.set(i, ultimo);
				estudiante.set(indiceMenor,primero);
			}
		}
		
		imprimirNombre(estudiante);
		
	}
		
}


public class Estudiantes extends Estudiante {
	
	
	
	public static void main (String args []) {
		
		ArrayList<String> estudiante = new ArrayList<String>();
		estudiante.add("Gabriel Armando Bermudez");
		estudiante.add("Ralph Testarossa Lilaboi");
		estudiante.add("Scarlett Joestar Brando");
		estudiante.add("Lucy Liu Chang");
		estudiante.add("Ivan Tactuk Mercado");
		estudiante.add("Andrea Fox Strauss");
		
		System.out.println("SelectionSort: ");
		selectionSort(estudiante);
		System.out.println("\nInsertionSort: ");
		insertionSort(estudiante);
		System.out.println("\nBubleSort: ");
		bubleSort(estudiante);
	}

	

	
	
}




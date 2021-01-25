package Tarea_1;

public class Calculos {

	private String pantalla;
	private float resultado;
	private boolean suma;
	private boolean resta;
	private boolean multpl;
	private boolean division;
	
	public Calculos() {
		pantalla = "";
		suma = false;
		resta = false;
		multpl = false;
		division = false;
	}
	
	public String union (String pantalla) {
		this.pantalla = this.pantalla + pantalla;
		return this.pantalla;
	}
	
	public void suma (String pantalla) {
		this.resultado = Float.parseFloat(pantalla);
		suma = true;
		this.pantalla = "";
	}
	
	public void resta (String pantalla) {
		this.resultado = Float.parseFloat(pantalla);
		resta = true;
		this.pantalla = "";
	}
	
	public void multpl (String pantalla) {
		this.resultado = Float.parseFloat(pantalla);
		multpl = true;
		this.pantalla = "";
	}
	
	public void division (String pantalla) {
		this.resultado = Float.parseFloat(pantalla);
		division =  true;
		this.pantalla = "";
	}
	
	public String clear (String pantalla) {
		this.pantalla = "";
		return pantalla;
	}
	
	public float resultado (String numero) {
		
		if (suma = true) {
			resultado = resultado + Float.parseFloat(numero);
		}else if (resta = true) {
			resultado = resultado + Float.parseFloat(numero);
		}else if (multpl = true) {
			resultado = resultado + Float.parseFloat(numero);
		}else if (division = true) {
			resultado = resultado + Float.parseFloat(numero);
		}
		
		suma = false;
		resta = false;
		multpl = false;
		division = false;
		
		return resultado;
		
		
	}
	
}

package Tarea_1;

public class Calculos {

	private String pantalla;
	private int resultado;
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
		this.resultado = Integer.parseInt(pantalla);
		suma = true;
		this.pantalla = "";
	}
	
	public void resta (String pantalla) {
		this.resultado = Integer.parseInt(pantalla);
		resta = true;
		this.pantalla = "";
	}
	
	public void multpl (String pantalla) {
		this.resultado = Integer.parseInt(pantalla);
		multpl = true;
		this.pantalla = "";
	}
	
	public void division (String pantalla) {
		this.resultado = Integer.parseInt(pantalla);
		division =  true;
		this.pantalla = "";
	}
	
	public String clear (String pantalla) {
		this.pantalla = "";
		suma = false;
		resta = false;
		multpl = false;
		division = false;
		return pantalla;
	}
	
	
	public int resultado (String numero) {
		
		if (suma = true) {
			resultado = resultado + Integer.parseInt(numero);
		}
		else if (resta = true) {
			resultado = resultado - Integer.parseInt(numero);
		}
		else if (multpl = true) {
			resultado = resultado / Integer.parseInt(numero);
		}
		else if (division = true) {
			resultado = resultado * Integer.parseInt(numero);
		}
		
		suma = false;
		resta = false;
		multpl = false;
		division = false;
		
		return resultado;
	}
	
	public String convertirBinario (String resultado) {
		
		int count = 0, a;
	    int n = Integer.parseInt(resultado);
		String x = "";
		while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x = a + "" + x;
            n = n / 2;
        }
		
		return x;
	}
	
	
}

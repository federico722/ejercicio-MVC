package modelo;

import controlador.Coordinador;

public class Logica {

	private Coordinador miCoordinador;

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
		
	}

	public String sumar(String num1, String num2) {
		String retorno="";
		try {
			int x=Integer.parseInt(num1);
			int y=Integer.parseInt(num2);
			int suma=x+y;
			retorno=suma+"";
		} catch (Exception e) {
			retorno="error";
		}
	
		
		
		return retorno;
	}

	public void restar(String num1, String num2) {
		try {
			int x=Integer.parseInt(num1);
			int y=Integer.parseInt(num2);
			int resta=x-y;
			miCoordinador.asignarResta(resta+"");
		} catch (Exception e) {
			miCoordinador.asignarResta("error");
		}
	     
		
	}

}

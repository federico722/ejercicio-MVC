package controlador;

import modelo.Logica;
import vista.VentanaOtra;
import vista.VentanaPrincipal;

public class Coordinador {

	private VentanaPrincipal miVentana;
	private Logica miLogica;
	private VentanaOtra miVentanaOtra;

	public void setVentanaPrincipal(VentanaPrincipal miVentana) {
		this.miVentana=miVentana;
		
	}



	public void setLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}
	
	public void setVentanaOtra(VentanaOtra miVentanaOtra) {
		this.miVentanaOtra=miVentanaOtra;
	}



	public String sumar(String num1, String num2) {
		String result=miLogica.sumar(num1,num2);
		return result;
	}



	public void restar(String num1, String num2) {
		  miLogica.restar(num1,num2);
		
	}



	public void asignarResta(String resta) {
		miVentana.asignarResta(resta);
	}



	public void mostrarVentanaOtra() {
		miVentanaOtra.frame.setVisible(true);
	}



	public void salirDeLaVentanaOtra() {
		miVentanaOtra.frame.dispose();
	}



	

}

package controlador;

import modelo.Logica;
import vista.VentanaOtra;
import vista.VentanaPrincipal;

public class Principal {

	
	public static void main(String []args) {
		//declaracion de las clases 
		VentanaPrincipal miVentana;
		Logica miLogica;
		Coordinador miCoordinador;
		VentanaOtra miVentanaOtra;
		
		//Instanciamos las clases(crear los objetos de las clases)
		miVentana=new VentanaPrincipal();
		miLogica=new Logica();
		miCoordinador=new Coordinador();
		miVentanaOtra=new VentanaOtra();
		
		//establecemos las relaciones entre las clases
		miVentana.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);
		miVentanaOtra.setCoordinador(miCoordinador);
		
		//enviarle una instancia de cada clase al coordinador
		miCoordinador.setVentanaPrincipal(miVentana);
		miCoordinador.setLogica(miLogica);
		miCoordinador.setVentanaOtra(miVentanaOtra);
		
		miVentana.frame.setVisible(true);
	}
}

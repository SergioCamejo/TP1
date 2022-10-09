package aseguradora.clases;

import aseguradora.interfaces.Calculable;
import aseguradora.interfaces.Mostrable;

public abstract class Seguro implements Mostrable, Calculable{

	private static final String MOSTRAR_PATTERN = "Seguro de %s, cuya descripci�n es %s - detalle: %s, pagar� mensualmente $ %.2f.\n";
	
	
	private Asegurado tomador;

	public void agregarAsegurado(Asegurado asegurado) {
		this.tomador = asegurado;		
	}

	public Asegurado dameTomador() {
		return this.tomador;
	}
	
	public boolean laTomadoraEsFemenina() {
		return tomador.esFemenina();
	}	
	
}

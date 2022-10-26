package ejercicio_03.main;

import ejercicio_03.clases.Documento;
import ejercicio_03.clases.Impresora;

public class Test {

	public static void main(String[] args) {
		
		Impresora i = new Impresora(33);
		
		i.encenderOApagar();
		
		i.agregarDocumento(new Documento("fecha de hoy", 14, false));
		i.agregarDocumento(new Documento("fecha de ayer", 10, true));
		i.agregarDocumento(new Documento("fecha de mañana", 25, true));
		
		System.out.println(i.imprimir());

	}

}

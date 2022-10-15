package ejercicio_04.main;

import ejercicio_04.clases.Empresa;
import ejercicio_04.clases.Estacion;
import ejercicio_04.clases.Recorrido;
import ejercicio_04.clases.Reserva;

public class Test {
	
	public static void main(String[] args) {
		
		Empresa e = new Empresa();
		
		e.agregarReserva(new Reserva("R1", new Recorrido(Estacion.BUENOS_AIRES, Estacion.BRAGADO), 2));
		e.agregarReserva(new Reserva("R2", new Recorrido(Estacion.LUJAN, Estacion.CHIVILCOY), 3));
		
		System.out.println(e.recaudacionTotal());
		
		System.out.println(e.cantVecesRecorrida(Estacion.ALBERTI));
		
	}
}

package ejercicio_05.main;

import ejercicio_05.clases.Prioridad;
import ejercicio_05.clases.Prototipo;
import ejercicio_05.clases.Sector;
import ejercicio_05.clases.Ticket;

public class Test {
	
	public static void main(String[] args) {
		
		Prototipo p = new Prototipo();
		
		p.agregarTicket(new Ticket(1, "4/5/20", Sector.ESCUELA, Prioridad.ALTA));
		p.agregarTicket(new Ticket(2, "5/9/21", Sector.DIRECCIÓN, Prioridad.BAJA));
		p.agregarTicket(new Ticket(3, "24/3/22", Sector.INSTITUTO, Prioridad.BAJA));
		p.agregarTicket(new Ticket(4, "13/6/22", Sector.ESCUELA, Prioridad.MEDIA));
		p.agregarTicket(new Ticket(5, "17/12/20", Sector.DIRECCIÓN, Prioridad.ALTA));
		p.agregarTicket(new Ticket(3, "25/3/22", Sector.INSTITUTO, Prioridad.BAJA));
		p.agregarTicket(new Ticket(6, "28/11/21", Sector.RRHH, Prioridad.MEDIA));
		
		//p.listarTicket();
		//System.out.println();
		//System.out.println(p.eliminarTicket(4));
		//System.out.println();
		//p.listarTicket();
		//System.out.println();
		p.mostrarMatriz();
		
	}
	
}

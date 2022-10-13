package ejercicio_03.main;

import ejercicio_03.clases.Jugador;
import ejercicio_03.clases.Plantel;
import ejercicio_03.clases.Posicion;

public class Test {
	
	public static void main(String[] args) {
		
		Plantel p = new Plantel();
		
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j1", 1));
		p.agregarJugador(new Jugador(Posicion.DEFENSOR, "j2", 2));
		p.agregarJugador(new Jugador(Posicion.DEFENSOR, "j3", 3));
		p.agregarJugador(new Jugador(Posicion.DEFENSOR, "j4", 4));
		p.agregarJugador(new Jugador(Posicion.DEFENSOR, "j5", 5));
		p.agregarJugador(new Jugador(Posicion.MEDIOCAMPISTA, "j6", 6));
		p.agregarJugador(new Jugador(Posicion.MEDIOCAMPISTA, "j7", 7));
		p.agregarJugador(new Jugador(Posicion.MEDIOCAMPISTA, "j8", 8));
		p.agregarJugador(new Jugador(Posicion.DELANTERO, "j9", 9));
		p.agregarJugador(new Jugador(Posicion.DELANTERO, "j10", 10));
		p.agregarJugador(new Jugador(Posicion.DELANTERO, "j11", 11));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j12", 12));
		p.agregarJugador(new Jugador(Posicion.DELANTERO, "j13", 13));
		p.agregarJugador(new Jugador(Posicion.DEFENSOR, "j14", 14));
		p.agregarJugador(new Jugador(Posicion.DEFENSOR, "j15", 15));
		p.agregarJugador(new Jugador(Posicion.MEDIOCAMPISTA, "j16", 16));
		p.agregarJugador(new Jugador(Posicion.MEDIOCAMPISTA, "j17", 17));
		p.agregarJugador(new Jugador(Posicion.DEFENSOR, "j18", 18));
		p.agregarJugador(new Jugador(Posicion.DEFENSOR, "j19", 19));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j20", 20));
		p.agregarJugador(new Jugador(Posicion.MEDIOCAMPISTA, "j21", 21));
		p.agregarJugador(new Jugador(Posicion.DELANTERO, "j22", 22));
		p.agregarJugador(new Jugador(Posicion.DELANTERO, "j23", 23));
		
		//p.listarJugadores();
		p.cambio(3, 15);
		System.out.println();
		p.listarJugadores();
		p.cambio(12, 20);
		p.cambio(0, 10);
		p.cambio(1, 12);
		p.listarJugadores();
		System.out.println();
		p.cambioPorLesion(6, "j18");
		p.cambioPorLesion(2, "j14");
		p.listarJugadores();
		//System.out.println(p.obtenerReservas());
		p.mostrarJugadoresDeResrva();
		//System.out.println(p.cantJugadoresPorPosicion());
		p.mostrarCantJugadoresPorPosicion();
		
	}	

}

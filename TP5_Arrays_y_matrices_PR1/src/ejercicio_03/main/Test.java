package ejercicio_03.main;

import ejercicio_03.clases.Jugador;
import ejercicio_03.clases.Plantel;
import ejercicio_03.clases.Posicion;

public class Test {
	
	public static void main(String[] args) {
		
		Plantel p = new Plantel();
		
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j1", 1));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j2", 2));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j3", 3));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j4", 4));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j5", 5));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j6", 6));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j7", 7));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j8", 8));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j9", 9));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j10", 10));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j11", 11));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j12", 12));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j13", 13));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j14", 14));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j15", 15));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j16", 16));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j17", 17));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j18", 18));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j19", 19));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j20", 20));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j21", 21));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j22", 22));
		p.agregarJugador(new Jugador(Posicion.ARQUERO, "j23", 23));
		
		//p.listarJugadores();
		p.cambio(3, 15);
		System.out.println();
		p.listarJugadores();
		
		
	}	

}

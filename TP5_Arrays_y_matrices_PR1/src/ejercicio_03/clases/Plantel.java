package ejercicio_03.clases;

public class Plantel {

	private final static int TITULARES = 11;
	private final static int SUPLENTES = 7;

	private Jugador[] jugadores;
	private int posEnPlantel = 0;

	public Plantel() {
		this.jugadores = new Jugador[23];
	}

	public void cambio(int jug1, int jug2) {
		Jugador titular = this.buscarJugador(jug1);
		Jugador suplente = this.buscarJugador(jug2);
		if (titular != null && suplente != null) {
			if (titular != suplente) {
				if (this.esTitular(titular) && this.esSuplente(suplente)) {
					realizarCambio(titular, suplente);
					System.out.println("Cambio realizado con éxito!");
				} else {
					System.out.println("Los jugadores no se encuentran en la posicion indicada para realizar un cambio");
				}
			} else {
				System.out.println("Son el mismo jugador");
			}
		} else {
			System.out.println("Por lo menos uno de los jugadores no existe");
		}
	}

	private void realizarCambio(Jugador titular, Jugador suplente) {
		Jugador aux = titular;
		titular = suplente;
		suplente = aux;
		this.jugadores[this.damePosicion(titular.dameNumero())] = suplente;
		this.jugadores[this.damePosicion(suplente.dameNumero())] = titular;
	}

	private Jugador buscarJugador(int numeroCamiseta) {
		Jugador j = null;
		int i = 0;
		while (i < this.jugadores.length && j == null) {
			if (this.jugadores[i].esEsteJugador(numeroCamiseta)) {
				j = this.jugadores[i];
			} else {
				i++;
			}
		}
		return j;
	}

	private int damePosicion(int numneroCamiseta) {
		int pos = 0;
		int i = 0;
		while (i < this.jugadores.length && pos == 0) {
			if (this.jugadores[i].esEsteJugador(numneroCamiseta)) {
				pos = i + 1;
			} else {
				i++;
			}
		}

		return pos;
	}

	private boolean esSuplente(Jugador j) {		
		return this.damePosicion(j.dameNumero()) > TITULARES && this.damePosicion(j.dameNumero()) < TITULARES + SUPLENTES;
	}

	private boolean esTitular(Jugador j) {
		return this.damePosicion(j.dameNumero()) <= TITULARES;
	}
	
	public void agregarJugador(Jugador j) {
		this.jugadores[this.posEnPlantel] = j;
		this.posEnPlantel++;
	}
	
	public void listarJugadores() {
		for (Jugador j : this.jugadores) {
			System.out.println(j.dameDatos());
		}
	}

}

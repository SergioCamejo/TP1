package ejercicio_03.clases;

public class Plantel {

	private final static int TITULARES = 11;
	private final static int SUPLENTES = 7;
	private final static int RESERVAS = 5;

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

	public void cambioPorLesion(int jugLesionado, String reemplazante) {
		Jugador lesionado = this.buscarJugador(jugLesionado);
		Jugador reemplazo = this.buscarJugador(reemplazante);		
		if (lesionado.getPosicion().equals(reemplazo.getPosicion())) {
			this.cambio(jugLesionado, reemplazo.getNumeroCamiseta());
			System.out.println("Cambio por lesion realizado con exito.");
		} else {
			System.out.println("No puede reemplazarse un jugador por otro que no sea de su posicion.");
		}
	}

	public Jugador[] obtenerReservas() {
		Jugador[] jugadoresDeReserva = new Jugador[RESERVAS];
		for (int i = 0; i < jugadoresDeReserva.length; i++) {
			jugadoresDeReserva[i] = this.jugadores[i + SUPLENTES + TITULARES];
		}
		return jugadoresDeReserva;
	}

	public void mostrarJugadoresDeResrva() {
		System.out.println("Los jugadores de reserva son los siguientes:");
		for (Jugador j : this.obtenerReservas()) {
			System.out.println(j.dameDatos());
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

	private Jugador buscarJugador(String apellido) {
		Jugador j = null;
		int i = 0;
		while (i < this.jugadores.length && j == null) {
			if (this.jugadores[i].esEsteJugador(apellido)) {
				j = this.jugadores[i];
			} else {
				i++;
			}
		}
		return j;
	}

	private int damePosicion(int numneroCamiseta) {
		int pos = -1;
		int i = 0;
		while (i < this.jugadores.length && pos == -1) {
			if (this.jugadores[i].esEsteJugador(numneroCamiseta)) {
				pos = i;
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

	public int[] cantJugadoresPorPosicion() {
		int[] jugadoresPorPosicion = new int[Posicion.values().length];
		for (int i = 0; i < jugadores.length; i++) {
			jugadoresPorPosicion[this.jugadores[i].damePosicion()]++;
		}
		return jugadoresPorPosicion;
	}

	public void mostrarCantJugadoresPorPosicion() {
		for (int i = 0; i < cantJugadoresPorPosicion().length; i++) {
			System.out.println("Cantidad de " + Posicion.values()[i].posicion() + ": " + this.cantJugadoresPorPosicion()[i]);
		}
	}

}

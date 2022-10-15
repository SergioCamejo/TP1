package ejercicio_04.clases;

public class Recorrido {

	private Estacion estacionPartida;
	private Estacion estacionDestino;

	public Recorrido(Estacion estacionPartida, Estacion estacionDestino) {
		this.estacionPartida = estacionPartida;
		this.estacionDestino = estacionDestino;
	}

	public int cantEstacionesRecorridas() {
		return Math.abs((this.estacionPartida.ordinal()) - this.estacionDestino.ordinal());
	}

	public boolean verificarEstacion(Estacion e) {	
		return e.ordinal() >= this.estacionPartida.ordinal() && e.ordinal() <= this.estacionDestino.ordinal();
	}
	
}

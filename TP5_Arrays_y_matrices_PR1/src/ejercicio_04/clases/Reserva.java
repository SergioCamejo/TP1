package ejercicio_04.clases;

public class Reserva {
	
	private static final int PRECIO_VIAJE = 50;
	private static final double DESCUENTO_VIAJE_COMPLETO = 0.8;
	
	private String codigo;
	private Recorrido recorrido;
	private int cantPersonasViaje;
	
	public Reserva(String codigo, Recorrido recorrido, int cantPersonasViaje) {
		this.codigo = codigo;
		this.recorrido = recorrido;
		this.cantPersonasViaje = cantPersonasViaje;
	}
	
	public String getCodigo() {
		return this.codigo;
	}

	public double dameValor() {
		return this.esViajeCompleto() ? valorRecorrido() * DESCUENTO_VIAJE_COMPLETO : valorRecorrido();
	}

	private boolean esViajeCompleto() {
		return Estacion.values().length - 1 == this.recorrido.cantEstacionesRecorridas();
	}

	private double valorRecorrido() {
		return this.recorrido.cantEstacionesRecorridas() * this.cantPersonasViaje * PRECIO_VIAJE;
	}

	public boolean pasaPorEstaEstacion(Estacion e) {
		return this.recorrido.verificarEstacion(e);
	}

	public int dameCantidadDePersonas() {
		return this.cantPersonasViaje;
	}	
	

}

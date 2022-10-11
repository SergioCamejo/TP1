package ejercicio_03.clases;

public class Jugador {
	
	private Posicion posicion;
	private String apellido;
	private int numeroCamiseta;
	
	public Jugador(Posicion posicion, String apellido, int numeroCamiseta) {
		this.posicion = posicion;
		this.apellido = apellido;
		this.numeroCamiseta = numeroCamiseta;
	}

	public boolean esEsteJugador(int numeroCamiseta) {
		return this.numeroCamiseta == numeroCamiseta;
	}

	public int dameNumero() {
		return this.numeroCamiseta;
	}

	public String dameDatos() {
		return "Nombre: " + this.apellido + " - Camiseta N° : " + this.numeroCamiseta + " - Juega de: " + this.posicion.posicion();
	}
	

}

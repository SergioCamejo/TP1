package ejercicio_03.clases;

public abstract class Producto {
	
	private String marca;
	private String modelo;
	private int numSerie;
	private int voltaje;
	private boolean estaEncendido;
	private double precio;
	
	public Producto(String marca, String modelo, int numSerie, int voltaje, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numSerie = numSerie;
		this.voltaje = voltaje;
		this.precio = precio;
		this.estaEncendido = false;
	}
	
	public double getPrecio() {
		return this.precio;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return "modelo " + modelo;
	}

	public boolean isEstaEncendido() {
		return estaEncendido;
	}
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + this.marca + ", modelo " + this.modelo;
	}

	public abstract String mostarParaTiket();

}



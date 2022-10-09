package ejercicio_03.clases;

public class Heladera extends Producto {
	
	private int capacidad;
	private boolean esFrost;
	
	public Heladera(String marca, String modelo, int numSerie, int voltaje, double precio, int capacidad,
			boolean esFrost) {
		super(marca, modelo, numSerie, voltaje, precio);
		this.capacidad = capacidad;
		this.esFrost = esFrost;
	}

	@Override
	public String mostarParaTiket() {
		return getClass().getSimpleName() + " " + super.getMarca() + ", modelo " + super.getModelo() + (this.esFrost ? " frost, " : " no frost, ") + "capacidad " 
				+ this.capacidad + " litros";
	}
	
	

}

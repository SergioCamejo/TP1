package ejercicio_03.clases;

public class Licuadora extends Producto {
	
	private int potencia;
	private int cantVelocidades;
	
	public Licuadora(String marca, String modelo, int numSerie, int voltaje, double precio, int potencia,
			int cantVelocidades) {
		super(marca, modelo, numSerie, voltaje, precio);
		this.potencia = potencia;
		this.cantVelocidades = cantVelocidades;
	}

	@Override
	public String mostarParaTiket() {
		return toString();
	}
	
	

}

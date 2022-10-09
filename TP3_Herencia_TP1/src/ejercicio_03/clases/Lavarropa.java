package ejercicio_03.clases;

public class Lavarropa extends Producto {
	
	private int kilosCarga;
	private boolean automatico;
	
	public Lavarropa(String marca, String modelo, int numSerie, int voltaje, double precio, int kilosCarga, boolean automatico) {
		super(marca, modelo, numSerie, voltaje, precio);
		this.kilosCarga = kilosCarga;
		this.automatico = automatico;
	}

	@Override
	public String mostarParaTiket() {
		return getClass().getSimpleName() + " "  + super.getMarca() + (this.automatico ? " automático, " : " semi automático, ") + "carga máxima " + this.kilosCarga
				 + "kg, modelo " + super.getModelo();
	}
	
	
	
	

}

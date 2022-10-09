package ejercicio_03.clases;

public class Televisor extends Producto {
	
	private int dimencion;
	private boolean esSmart;
	
	public Televisor(String marca, String modelo, int numSerie, int voltaje, double precio, int dimencion,
			boolean esSmart) {
		super(marca, modelo, numSerie, voltaje, precio);
		this.dimencion = dimencion;
		this.esSmart = esSmart;
	}
	
	@Override
	public String mostarParaTiket() {
		return getClass().getSimpleName() + " "  + (this.esSmart ? " smart " : " ") +  super.getMarca() + this.dimencion + " pulgadas, " + getModelo();
	}
	
	

}

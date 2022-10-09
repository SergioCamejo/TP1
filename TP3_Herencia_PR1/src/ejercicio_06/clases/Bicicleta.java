package ejercicio_06.clases;

public class Bicicleta {
	
	private static final int KM_MAX = 2000;
	
	private String marca;
	private String modelo;
	private double cantKilometros;
	
	public Bicicleta(String marca, String modelo, double cantKilometros) {
		this.marca = marca;
		this.modelo = modelo;
		this.cantKilometros = cantKilometros;
	}
	
	public boolean cumpleLasCondiciones() {
		return this.cantKilometros < KM_MAX;
	}
	
	

}

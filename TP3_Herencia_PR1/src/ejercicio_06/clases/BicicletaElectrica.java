package ejercicio_06.clases;

public class BicicletaElectrica extends Bicicleta {
	
	public static final int POTENCIA_MAX = 250;
	
	private int potencia;

	public BicicletaElectrica(String marca, String modelo, double cantKilometros, int potencia) {
		super(marca, modelo, cantKilometros);
		this.potencia = potencia;
	}
	
	@Override
	public boolean cumpleLasCondiciones() {
		return this.potencia <= POTENCIA_MAX;
	}
	
	/*“Solo se tomarán aquellas de 250w de potencia o menos y que tengan menos de 2000 kms, 
	 al igual que el resto de las bicicletas que no son eléctricas”.*/	
	public boolean cumpleLasCondicionesVersion2() {
		return this.cumpleLasCondiciones() && super.cumpleLasCondiciones();
	}
	
	

}

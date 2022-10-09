package menu.clases;

public class OpcionDeSalida extends OpcionDeMenu {
	
	private static final String SALIR = "SALIR";
	private static final char X = 'X';
	
	public OpcionDeSalida() {
		super(SALIR, X);		
	}

	@Override
	public void ejecutar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Salida del menú";
	}

}

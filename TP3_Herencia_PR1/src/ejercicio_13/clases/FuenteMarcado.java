package ejercicio_13.clases;

public class FuenteMarcado extends Fuente implements Calificable{
	
	final static int CONSTANTE_DE_CALIDAD = 450;
	
	private double tamanio;

	public FuenteMarcado(String nombre, String ubicacion, double tamanio) {
		super(nombre, ubicacion);
		this.tamanio = tamanio;
	}

	@Override
	public double indiceCalidad() {
		return CONSTANTE_DE_CALIDAD * this.tamanio;
	}
	
	
	
	

}

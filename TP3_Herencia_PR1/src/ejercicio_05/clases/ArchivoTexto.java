package ejercicio_05.clases;

public class ArchivoTexto extends Archivo {

	private String codificacion;

	public ArchivoTexto(String nombre, double peso, String localizacion, String codificacion) {
		super(nombre, peso, localizacion);
		this.codificacion = codificacion;
	}
	
	public void cifrarContenido() {
		// esto deberia de cifrar...
	}
	
	public boolean sosUTF8() {
		return this.codificacion.equals("UTF-8");
	}
	
}

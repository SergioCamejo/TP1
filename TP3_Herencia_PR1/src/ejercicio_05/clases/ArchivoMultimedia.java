package ejercicio_05.clases;

public abstract class ArchivoMultimedia extends Archivo{

	private int duracion;
	private boolean enReproduccion;

	public ArchivoMultimedia(String nombre, double peso, String localizacion, int duracion) {
		super(nombre, peso, localizacion);
		this.duracion = duracion;
		this.enReproduccion = false;
	}

	public void reproducir() {
		this.enReproduccion = true;
	}

	public void parar() {
		this.enReproduccion = false;
	}
	
	public int dameDuracion() {
		return this.duracion;
	}


}

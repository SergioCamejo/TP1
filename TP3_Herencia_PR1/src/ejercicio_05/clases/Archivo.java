package ejercicio_05.clases;

public abstract class Archivo {

	private String nombre;
	private double peso;
	private String localizacion;
	private boolean estaAbirto;

	public Archivo(String nombre, double peso, String localizacion) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.localizacion = localizacion;
		this.estaAbirto = false;
	}

	public void abrir() {
		this.estaAbirto = true;

	}

	public void cerrar() {
		this.estaAbirto = false;
	}

	public void moverDeUbicacion() {

	}

	@Override
	public String toString() {
		return "Archivo [nombre=" + nombre + ", peso=" + peso + ", localizacion=" + localizacion + ", estaAbirto="
				+ estaAbirto + "]";
	}


}

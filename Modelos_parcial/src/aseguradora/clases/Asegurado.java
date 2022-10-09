package aseguradora.clases;

public class Asegurado {
	
	private String nombre;
	private String apellido;
	private int edad;
	private Genero genero;
	private String dni;
	
	public Asegurado(String nombre, String apellido, int edad, Genero genero, String dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.dni = dni;
	}

	public String dameDni() {
		return this.dni;
	}

	public boolean mismoDni(String dni) {
		return this.dni.equals(dni);
	}

	@Override
	public String toString() {
		return "Asegurado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", dni=" + dni + "]";
	}

	public boolean esFemenina() {
		return this.genero.equals(Genero.FEMENINO);
	}

	public int dameEdad() {
		return this.edad;
	}

}
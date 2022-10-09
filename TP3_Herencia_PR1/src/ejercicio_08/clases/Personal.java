package ejercicio_08.clases;

public abstract class Personal {
	
	private String dni;
	private String nombre;
	private String apellido;
	private int anioIngreso;
	
	public Personal(String dni, String nombre, String apellido, int anioIngreso) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioIngreso = anioIngreso;
	}

	protected abstract double mostrarSalario();
	
	public int getAnioIngreso() {
		return this.anioIngreso;
	}

}

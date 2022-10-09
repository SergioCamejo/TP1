package ejercicio_01.clases;

public abstract class Empleado {
	
	private String nombre;
	private int edad;
	
	public Empleado(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public abstract float calcularPago();

	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + this.nombre + " gana " + this.calcularPago();
	}
	
	

	
}

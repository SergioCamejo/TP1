package ejercicio_01.clases;

public class Asalariado extends Empleado {
	
	private float sueldo;

	public Asalariado(String nombre, int edad, float sueldo) {
		super(nombre, edad);
		this.sueldo = sueldo;
	}

	@Override
	public float calcularPago() {
		return this.sueldo;
	}
	
	

}

package ejercicio_01.clases;

public class Subcontratado extends Empleado {
	
	private float cantHorasTrabajadas;
	private float precioHora;

	public Subcontratado(String nombre, int edad, float cantHorasTrabajadas, float precioHora) {
		super(nombre, edad);
		this.cantHorasTrabajadas = cantHorasTrabajadas;
		this.precioHora = precioHora;
	}

	public float getCantHorasTrabajadas() {
		return cantHorasTrabajadas;
	}

	public float getPrecioHora() {
		return precioHora;
	}

	@Override
	public float calcularPago() {
		return this.precioHora * this.cantHorasTrabajadas;
	}

}

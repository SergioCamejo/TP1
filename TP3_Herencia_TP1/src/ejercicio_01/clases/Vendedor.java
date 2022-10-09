package ejercicio_01.clases;

public class Vendedor extends Subcontratado {
	
	private float porcentaje;

	public Vendedor(String nombre, int edad, float cantHorasTrabajadas, float precioHora, float porcentaje) {
		super(nombre, edad, cantHorasTrabajadas, precioHora);
		this.porcentaje = porcentaje;
	}
	
	@Override
	public float calcularPago() {
		return super.calcularPago() + (super.calcularPago() * this.porcentaje) / 100;
	}

}

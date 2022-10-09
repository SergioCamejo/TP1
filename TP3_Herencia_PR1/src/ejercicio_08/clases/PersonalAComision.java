package ejercicio_08.clases;

public class PersonalAComision extends Personal {
	
	private final double SALARIO_MINIMO = 20000;
	
	private int numneroClientes;
	private double montoACobrarPorCliente;
	
	public PersonalAComision(String dni, String nombre, String apellido, int anioIngreso, int numneroClientes,
			double montoACobrarPorCliente) {
		super(dni, nombre, apellido, anioIngreso);
		this.numneroClientes = numneroClientes;
		this.montoACobrarPorCliente = montoACobrarPorCliente;
	}

	@Override
	protected double mostrarSalario() {
		double salario = this.numneroClientes * this.montoACobrarPorCliente;		
		return salario > this.SALARIO_MINIMO ? salario : this.SALARIO_MINIMO; 
	}

}

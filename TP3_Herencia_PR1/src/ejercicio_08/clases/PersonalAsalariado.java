package ejercicio_08.clases;

public class PersonalAsalariado extends Personal {
	
	private final int ANIO_ACTUAL = 2022;
	private final int PRIMER_SEGMENTO_ANIOS = 2;
	private final int SEGUNDO_SEGMENTO_ANIOS = 5;
	private final int TERCER_SEGMENTO_ANIOS = 10;
	private final double PORCENTAJE_1 = 0.05;
	private final double PORCENTAJE_2 = 0.1;
	private final double PORCENTAJE_3 = 0.15;
	
	private double sueldoFijo;
	
	public PersonalAsalariado(String dni, String nombre, String apellido, int anioIngreso, double sueldoFijo) {
		super(dni, nombre, apellido, anioIngreso);
		this.sueldoFijo = sueldoFijo;
	}

	@Override
	protected double mostrarSalario() {
		double salario = this.sueldoFijo;
		int cantAniosEnLaEmpresa = this.ANIO_ACTUAL - super.getAnioIngreso();
		if ( cantAniosEnLaEmpresa >= PRIMER_SEGMENTO_ANIOS && cantAniosEnLaEmpresa <= SEGUNDO_SEGMENTO_ANIOS ) {
			salario = this.sueldoFijo +  this.sueldoFijo * PORCENTAJE_1; 
		} else if (cantAniosEnLaEmpresa > SEGUNDO_SEGMENTO_ANIOS && cantAniosEnLaEmpresa <= TERCER_SEGMENTO_ANIOS) {
			salario = this.sueldoFijo +  this.sueldoFijo * PORCENTAJE_2;
		} else if (cantAniosEnLaEmpresa > TERCER_SEGMENTO_ANIOS) {
			salario = this.sueldoFijo +  this.sueldoFijo * PORCENTAJE_3;
		}
		return salario;
	}	

}

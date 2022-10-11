package ejercicio_01.clases;

public class Pedido {
	
	private Estado estado;
	private String nombreCliente;
	private int idCajero;
	private String codigoRobot;
	private double montoAAbonar;
	
	public Pedido(String nombreCliente, int idCajero, String codigoRobot, double montoAAbonar) {
		this.estado = Estado.EN_ESPERA;
		this.nombreCliente = nombreCliente;
		this.idCajero = idCajero;
		this.codigoRobot = codigoRobot;
		this.montoAAbonar = montoAAbonar;
	}

	public int getIdCajero() {
		return this.idCajero;		
	}
	
	public double getMonto() {
		return this.montoAAbonar;		
	}
	
	public String getCodigoRobot() {
		return this.codigoRobot;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " " + estado.getDescripcion() + ", a nombre de: " + nombreCliente + ", Lo atendió: " + idCajero
				+ ", " + codigoRobot + ". Total a abonar: $" + montoAAbonar;
	}
	
	
}

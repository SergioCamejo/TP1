package boxes.clases;

import boxes.interfaces.CotizablePorManoObra;

public class Alineacion extends Servicio implements CotizablePorManoObra {

	static final double EXTRABALANCEO = 500;
	
	private int cantHoras;
	private boolean conBalanceo;
	
/*	todo completar */
	public Alineacion(String descripcion, double porcentajeGanancia, String patente, int horas, boolean conBalanceo) {
		super(descripcion, porcentajeGanancia, patente);
		this.cantHoras = horas;
		this.conBalanceo = conBalanceo;
	}

	@Override
	public double calcularCostoHoras() {
		return this.cantHoras * CotizablePorManoObra.COSTOHORA;
	}

	@Override
	public double calcularPrecioCosto() {
		return conBalanceo ? this.calcularCostoHoras() + EXTRABALANCEO : this.calcularCostoHoras();
	}
	

}

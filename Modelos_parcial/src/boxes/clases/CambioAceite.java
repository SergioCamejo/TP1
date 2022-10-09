package boxes.clases;

import boxes.interfaces.CotizablePorManoObra;
import boxes.interfaces.CotizablePorMateriales;

public class CambioAceite extends Servicio implements CotizablePorManoObra, CotizablePorMateriales {
	
	private int cantHoras;
	
	public CambioAceite(String descripcion, double porcentajeGanancia, String patente, int horas) {
		super(descripcion, porcentajeGanancia, patente);
		this.cantHoras = horas;

	}

	@Override
	public double calcularCostoMateriales() {
		return CotizablePorMateriales.COSTOMATERIAL1 + CotizablePorMateriales.COSTOMATERIAL2;
	}

	@Override
	public double calcularCostoHoras() {
		return this.cantHoras * CotizablePorManoObra.COSTOHORA;
	}

	@Override
	public double calcularPrecioCosto() {
		return this.calcularCostoMateriales() + this.calcularCostoMateriales();
	}

	

}


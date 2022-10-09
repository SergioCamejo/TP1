package aseguradora.clases;

import aseguradora.interfaces.Calculable;

public class SeguroHogar extends Seguro implements Calculable {
	
	private final static int VALOR_M_2= 725;
	private final static String DESCRIPCION = "Seguro combinado familiar";
	
	private int metrosCuadrados;
	private Provincia provincia;

	public SeguroHogar(int metrosCuadrados, Provincia provincia) {
		this.metrosCuadrados = metrosCuadrados;
		this.provincia = provincia;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub

	}

	@Override
	public String texto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float calcular() {
		return this.metrosCuadrados * VALOR_M_2 * this.provincia.getMultiplicadorRiesgo();
	}

}

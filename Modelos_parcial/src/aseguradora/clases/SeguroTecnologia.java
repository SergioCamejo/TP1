package aseguradora.clases;

import aseguradora.interfaces.Calculable;

public class SeguroTecnologia extends Seguro implements Calculable{
	
	private final static double INDICE= 0.0025;
	private final static String DESCRIPCION = "Seguro de robo de tecnología no celular";
	
	private String marca;
	private String modelo;
	private float valorRepocicion;

	public SeguroTecnologia(String marca, String modelo, float valorRepocicion) {
		this.marca = marca;
		this.modelo = modelo;
		this.valorRepocicion = valorRepocicion;
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
		return (float) (this.valorRepocicion * INDICE);
	}

}


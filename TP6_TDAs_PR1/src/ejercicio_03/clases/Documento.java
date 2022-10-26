package ejercicio_03.clases;

public class Documento {
	
	private String fecha;
	private int cantCarillas;
	private boolean esDobleFaz;
	
	public Documento(String fecha, int cantCarillas, boolean esDobleFaz) {
		this.fecha = fecha;
		this.cantCarillas = cantCarillas;
		this.esDobleFaz = esDobleFaz;
	}

	public int dameHojasRequeridas() {
		return esDobleFaz ? (this.cantCarillas / 2) + (this.cantCarillas % 2) : this.cantCarillas;
	}
	
	public String getFecha() {
		return this.fecha;
	}

	@Override
	public String toString() {
		return "Fecha: " + fecha + ", cantidad de carillas: " + cantCarillas + (esDobleFaz ? " es doble faz" : " es Simple faz");
	}
	
	
	
	

}

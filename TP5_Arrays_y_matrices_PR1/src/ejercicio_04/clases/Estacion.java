package ejercicio_04.clases;

public enum Estacion {
	
	BUENOS_AIRES("Buenos Aires"),
	LUJAN("Luján"),
	MERCEDES("Mercedes"),
	SUIPACHA("Suipacha"),
	CHIVILCOY("Chivilcoy"),
	ALBERTI("Alberti"),
	BRAGADO("Bragado");
	
	private String nombreEstacion;
	
	private Estacion(String nombreEstacion) {
		this.nombreEstacion = nombreEstacion;		
	}
	
	public String NombreEstacion() {
		return this.nombreEstacion;
	}

}

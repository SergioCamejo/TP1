package ejercicio_04.clases;

public enum TipoPelota {
	
	FUTBOL("Futbol"), BASQUET("Basquet"), VOLEY("Voley");
	
	private String dato;
	
	private TipoPelota(String dato) {
		this.dato = dato;
	}
	
	public String getDato() {
		return this.dato;
	}

}

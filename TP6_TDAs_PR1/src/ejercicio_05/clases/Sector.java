package ejercicio_05.clases;

public enum Sector {
	
	RRHH("RRHH"),
	INSTITUTO("Instituto"),
	ESCUELA("Escuela"),
	DIRECCIÓN("Direccion");
	
	private String dato;
	
	private Sector(String dato) {
		this.dato = dato;
	}
	
	public String getDato() {
		return this.dato;
	}

}

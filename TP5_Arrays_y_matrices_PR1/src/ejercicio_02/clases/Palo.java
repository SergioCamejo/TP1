package ejercicio_02.clases;

public enum Palo {
	
	ORO("Oro"), BASTO("Basto"), ESPADA("Espada"), COPA("Copa");
	
	private String nombre;
	
	private Palo(String nombre) {
		this.nombre = nombre;
	}
	
	public String nombrePalo() {
		return this.nombre;
	}

}

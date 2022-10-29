package ejercicio_05.clases;

public enum Prioridad {

	ALTA("Alta"),
	MEDIA("Alta"),
	BAJA("Alta");

	private String dato;

	private Prioridad(String dato) {
		this.dato = dato;
	}

	public String getDato() {
		return this.dato;
	}

}

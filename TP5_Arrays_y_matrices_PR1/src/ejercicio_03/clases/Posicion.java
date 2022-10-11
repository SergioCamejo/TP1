package ejercicio_03.clases;

public enum Posicion {
	
	ARQUERO("arquero"), DEFENSOR("defensor"), MEDIOCAMPISTA("mediocampista"), DELANTERO("delantero");
	
	private String posicion;
	
	private Posicion(String posicion){
		this.posicion = posicion;
	}
	
	public String posicion() {
		return this.posicion;
	}

}

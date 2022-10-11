package ejercicio_01.clases;

public enum Estado {
	
	EN_ESPERA("en espera"), DESPACHADO("despachado");
	
	private String descripcion;
	
	private Estado(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}

}

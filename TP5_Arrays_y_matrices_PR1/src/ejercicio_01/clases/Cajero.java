package ejercicio_01.clases;

public class Cajero {
	
	private int id;
	private String apellido;
	private int antiguedad;	
	
	public Cajero(int id, String apellido, int antiguedad) {
		this.id = id;
		this.apellido = apellido;
		this.antiguedad = antiguedad;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getApellido() {
		return this.apellido;
	}

	public boolean tieneEsteId(int idCajero) {
		return this.id == idCajero;
	}

	@Override
	public String toString() {
		return "Cajero [id=" + id + ", apellido=" + apellido + ", antiguedad=" + antiguedad + "]";
	}
	
}

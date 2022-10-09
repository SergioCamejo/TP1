package ejercicio_12.clases;

public class PersonaConOS extends Persona {
	
	private String nombrePrestador;
	private int numeroAfiliado;
	
	public PersonaConOS(String dni, String nombre, String apellido, int edad, Motivo motivo, String nombrePrestador,
			int numeroAfiliado) {
		super(dni, nombre, apellido, edad, motivo);
		this.nombrePrestador = nombrePrestador;
		this.numeroAfiliado = numeroAfiliado;
	}
	
	

}

package ejercicio_12.clases;

public class Persona implements Priorizable, Notificable {
	
	private String dni;
	private String nombre;
	private String apellido;
	private int edad;
	private Motivo motivo;
	
	public Persona(String dni, String nombre, String apellido, int edad, Motivo motivo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.motivo = motivo;
	}

	@Override
	public void notificar(String mensaje) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int asignarPrioridad() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}

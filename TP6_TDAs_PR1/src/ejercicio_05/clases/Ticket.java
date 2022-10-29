package ejercicio_05.clases;

public class Ticket {
	
	private int id;
	private String fecha;
	private Sector sector;
	private Prioridad prioridad;
	
	public Ticket(int id, String fecha, Sector sector, Prioridad prioridad) {
		this.id = id;
		this.fecha = fecha;
		this.sector = sector;
		this.prioridad = prioridad;
	}
	
	public Sector getSector() {
		return this.sector;
	}

	public Prioridad getPrioridad() {
		return this.prioridad;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", fecha=" + fecha + ", sector=" + sector + ", prioridad=" + prioridad + "]";
	}

	public int esTuId() {
		return this.id;
	}
	

}

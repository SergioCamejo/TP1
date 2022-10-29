package ejercicio_05.clases;

public class Prototipo {
	
	private ColaTicket colaTickets;
	
	public Prototipo() {
		this.colaTickets = new ColaTicket();
	}
	
	public void agregarTicket(Ticket t) {
		if (t != null) {
			this.colaTickets.add(t);
		}
	}
	
	public void listarTicket() {
		int valorCentinela = -1;
		Ticket t = new Ticket(valorCentinela, null, null, null);
		this.colaTickets.add(t);
		t = this.colaTickets.remove();
		while (t.esTuId() != valorCentinela) {
			System.out.println(t);
			this.colaTickets.add(t);
			t = colaTickets.remove();
		}
	}
	
	public Ticket eliminarTicket(int id) {
		int idCentinela = -1;
		Ticket t = new Ticket(idCentinela, null, null, null);
		Ticket buscado = null;
		this.colaTickets.add(t);
		t = this.colaTickets.remove();
		while (t.esTuId() != idCentinela) {
			if (t.esTuId() == id) {
				buscado = t;
			} else {
				colaTickets.add(t);
			}
			t = this.colaTickets.remove();
		}
		return buscado;
	}
	
	public int[][] cantTicketsXSectorPrioridad(){
		int[][] cantTickets= new int[Sector.values().length][Prioridad.values().length];
		int idCentinela = -1;
		Ticket t = new Ticket(idCentinela, null, null, null);
		this.colaTickets.add(t);
		t = this.colaTickets.remove();
		while (t.esTuId() != idCentinela) {
			cantTickets[t.getSector().ordinal()][t.getPrioridad().ordinal()]++;
			this.colaTickets.add(t);
			t = colaTickets.remove();
		}		
		return cantTickets;
	}
	
	public void mostrarMatriz() {
		System.out.printf("%-12s", " ");
		for (int i = 0; i < Prioridad.values().length; i++) {
			System.out.printf("%-10s ", Prioridad.values()[i]);
		}
		System.out.println();
		for (int idxFila = 0; idxFila < cantTicketsXSectorPrioridad().length; idxFila++) {
			System.out.printf("%-12s", Sector.values()[idxFila]);
			for (int idxCol = 0; idxCol < cantTicketsXSectorPrioridad()[idxFila].length; idxCol++) {
				System.out.printf("%- 12d", cantTicketsXSectorPrioridad()[idxFila][idxCol]);
			}
			System.out.println();
		}
	}

	

}

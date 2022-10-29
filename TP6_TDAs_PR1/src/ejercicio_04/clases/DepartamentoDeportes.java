package ejercicio_04.clases;

public class DepartamentoDeportes {
	
	private static final int CANT_PILAS = 3;
	private static final int CANT_PELOTAS_POR_PILA = 5;
	
	private PilaDePelotas[] pilasDePelotas;
	
	public DepartamentoDeportes() {
		this.pilasDePelotas = new PilaDePelotas[CANT_PILAS];
		this.instanciarPilas();
	}

	private void instanciarPilas() {
		for (int i = 0; i < pilasDePelotas.length; i++) {
			pilasDePelotas[i] = new PilaDePelotas(CANT_PELOTAS_POR_PILA);
		}
		
	}
	
	public void verPelotasEnTopes() {
		for (int i = 0; i < pilasDePelotas.length; i++) {
			if (!this.pilasDePelotas[i].isEmpty()) {
				System.out.println(this.pilasDePelotas[i].peek());				
			}
		}
	}

	public boolean agregarPelota(Pelota pelota) {
		boolean agregada = false;
		int i = 0;
		while (i < this.pilasDePelotas.length && !agregada) {
			if (!this.pilasDePelotas[i].isFull()) {
				this.pilasDePelotas[i].push(pelota);
				agregada = true;
			} else {
				i++;
			}
		}
		return agregada;		
	}
	
	public Pelota buscarPelota(String codigo){
		Pelota p = null;
		int i = 0;
		while (i < this.pilasDePelotas.length && p == null) {
			p = this.buscarPelotaEnPila(this.pilasDePelotas[i], codigo);
			i++;
		}
		return p;
	}

	private Pelota buscarPelotaEnPila(PilaDePelotas pilaDePelotas, String codigo) {
		Pelota aDevolver = null;
		PilaDePelotas pilaAux = new PilaDePelotas();
		while(!pilaDePelotas.isEmpty() && aDevolver == null) {
			Pelota p = pilaDePelotas.pop();
			if (p.EsTuCodigo(codigo)) {
				aDevolver = p;
			}
			pilaAux.push(p);
		}
		pasarPila(pilaDePelotas, pilaAux);
		return aDevolver;
	}

	private void pasarPila(PilaDePelotas pilaDePelotas, PilaDePelotas pilaAux) {
		while (!pilaAux.isEmpty()) {
			pilaDePelotas.push(pilaAux.pop());
		}
	}

	public int[][] pelotasPorTipo(){
		int[][] pelotasPorTipo = new int[TipoPelota.values().length][CANT_PILAS];
		for (int i = 0; i < this.pilasDePelotas.length; i++) {
			totalEnPila(pelotasPorTipo, i);
		}
		return pelotasPorTipo;
	}

	private void totalEnPila(int[][] pelotasPorTipo, int i) {
		PilaDePelotas pilaEvaluada = this.pilasDePelotas[i];
		PilaDePelotas pilaAux = new PilaDePelotas();
		Pelota evaluada = null;
		while (!pilaEvaluada.isEmpty() && evaluada == null) {
			Pelota p = pilaEvaluada.pop();
			pelotasPorTipo[p.getTipo().ordinal()][i]++;
			pilaAux.push(p);
		}
		this.pasarPila(pilaEvaluada, pilaAux);		
	}
	
	public void mostrarPelotasPorTipo() {
		for (int i = 0; i < pelotasPorTipo().length; i++) {
			System.out.printf("%-8s ", TipoPelota.values()[i].getDato());
			for (int j = 0; j < pelotasPorTipo()[i].length; j++) {
				System.out.printf("%d ", pelotasPorTipo()[i][j]);
			}
			System.out.println();
		}
	}

}

package ejercicio_02.clases;

public class Baraja {
	
	private static final int CANTIDAD_CARTAS = 48;
	private static final int NUM_CARTA_MIN = 1;
	private static final int NUM_CARTA_MAX = 12;
	
	private Carta[] cartas;
	
	public Baraja() {
		this.cartas = new Carta[CANTIDAD_CARTAS];
		this.generarCartas();
	}
	
	private void generarCartas() {
		Palo[] palos = Palo.values();
		for (int palo = 0; palo < palos.length; palo++) {
			this.generarCartas(palos[palo]);
		}		
	}

	private void generarCartas(Palo palo) {
		int posicionPartidaDelPalo = palo.ordinal() * NUM_CARTA_MAX;
		for (int numero = NUM_CARTA_MIN; numero <= NUM_CARTA_MAX; numero++) {
			cartas [posicionPartidaDelPalo + numero - 1] = new Carta(numero, palo);			
		}
		
	}

	public boolean estaOrdenado() {
		boolean estaOrdenado = true;
		int i = 0;
		while (i < this.cartas.length && estaOrdenado) {
			
		}
		return estaOrdenado;
	}
	
	public void mostrarBaraja() {
		for (int i = 0; i < cartas.length; i++) {
			System.out.println(cartas[i]);
		}
	}

}

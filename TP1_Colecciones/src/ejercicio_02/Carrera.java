package ejercicio_02;

import java.util.ArrayList;

public class Carrera {

	private ArrayList<Atleta> atletas;

	public Carrera() {
		this.atletas = new ArrayList<Atleta>();
	}

	public boolean agregarAtleta(Atleta a) {
		boolean pudoAgregar = false;
		Atleta atletaAAgregar = this.buscarAtleta(a);
		if (atletaAAgregar == null) {
			pudoAgregar = this.atletas.add(a);
		}
		return pudoAgregar;
	}

	private Atleta buscarAtleta(Atleta a) {
		Atleta atletaBuscado = null;
		int i = 0;
		while (i < this.atletas.size() && atletaBuscado == null) {
			if(this.atletas.get(i).equals(a)) {
				atletaBuscado = this.atletas.get(i);
			}
			else {
				i++;
			}
		}
		return atletaBuscado;
	}

	public ArrayList<Atleta> obtenerGanador() {
		// recorro la lista de atletas en busca del menor tiempo
		// devuelvo una lista con los atletas cuyos menores tiempos coincidan.
		double tMin = Double.MAX_VALUE;
		ArrayList<Atleta> ganadores = new ArrayList<>();
		for (Atleta a : this.atletas) {
			if (a.getTiempo() < tMin) {
				ganadores.clear();
				tMin = a.getTiempo();
				ganadores.add(a);
			} else if (a.getTiempo() == tMin) {
				ganadores.add(a);
			}
		}		
		return ganadores;
	}

}


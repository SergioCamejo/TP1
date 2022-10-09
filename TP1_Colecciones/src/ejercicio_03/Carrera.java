package ejercicio_03;

import java.util.ArrayList;

public class Carrera {

	//private ArrayList<Atleta> atletas;

	public Carrera() {
		//this.atletas = new ArrayList<>();
	}

	/*public boolean agregarAtleta(Atleta a) {
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
	}*/

	public Podio obtenerGanadores(ArrayList<Atleta> atletas) {
		ArrayList<Atleta> primerLugar = new ArrayList<Atleta>();
		double t1 = Double.MAX_VALUE;
		ArrayList<Atleta> segundoLugar = new ArrayList<Atleta>();
		double t2 = Double.MAX_VALUE;
		ArrayList<Atleta> tercerLugar = new ArrayList<Atleta>();
		double t3 = Double.MAX_VALUE;

		for (Atleta atleta : atletas) {
			double tiempo = atleta.getTiempo();
			if (tiempo < t1) {
				// baja del segundo al tercer lugar
				bajarEscalon(segundoLugar, tercerLugar);
				t3 = t2;
				bajarEscalon(primerLugar, segundoLugar);
				t2 = t1;
				//limpio 1er escal n asignando el nuevo ganador
				limpiarEscalon(primerLugar, atleta);
				t1 = tiempo;
			} else if (tiempo == t1) {
				//agrego el competidor a la lista del 1er escalon
				primerLugar.add(atleta);
			} else {
				if (tiempo < t2) {
					bajarEscalon(segundoLugar, tercerLugar);
					t3 = t2;
					limpiarEscalon(segundoLugar, atleta);
					t2 = tiempo;
				} else if (tiempo == t2)  {
					segundoLugar.add(atleta);
				} else {
					if (tiempo < t3) {
						limpiarEscalon(tercerLugar, atleta);
						t3 = tiempo;
					} else if (tiempo == t3)  {
						tercerLugar.add(atleta);
					}
				}
			}
		}

		return new Podio(primerLugar, segundoLugar, tercerLugar);
	}


	private void limpiarEscalon(ArrayList<Atleta> e1, Atleta atleta) {
		e1.clear();
		e1.add(atleta);
	}


	private void bajarEscalon(ArrayList<Atleta> e2, ArrayList<Atleta> e3) {
		e3.clear();
		e3.addAll(e2);
	}

}

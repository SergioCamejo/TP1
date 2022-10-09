package ejercicio_13.clases;

import java.util.ArrayList;

public class FuenteProgramacion extends Fuente implements Calificable{
	
	private ArrayList<Metodo> metodos;

	public FuenteProgramacion(String nombre, String ubicacion, ArrayList<Metodo> metodos) {
		super(nombre, ubicacion);
		this.metodos = new ArrayList<>();
	}

	@Override
	public double indiceCalidad() {
		return this.promedioIndiceDeCalidadDeMetodos(); 
	}
	
	private double promedioIndiceDeCalidadDeMetodos() {
		double sumatoriaCalidad = 0;
		for (Metodo m : this.metodos) {
			sumatoriaCalidad += m.indiceCalidad();
		}
		return this.metodos.size() > 0 ?  sumatoriaCalidad / this.metodos.size() : 0;
	}

	

	public Metodo buscarMetodo(String nomnbreMetodo) {
		Metodo m = null;
		int i = 0;
		while (i < this.metodos.size() && m == null) {
			if (this.metodos.get(i).esTuNumbre(nomnbreMetodo)) {
				m = this.metodos.get(i);
			} else {
				i++;
			}
		}
		return null;
	}
	
	
	
	

}

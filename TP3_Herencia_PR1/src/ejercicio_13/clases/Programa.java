package ejercicio_13.clases;

import java.util.ArrayList;

public class Programa implements Calificable {

	private int id;
	private String nombre;
	private String responsable;
	private boolean pasoPruebas;
	private ArrayList<Fuente> fuentes;

	public Programa(int id, String nombre, String responsable, boolean pasoPruebas) {
		this.id = id;
		this.nombre = nombre;
		this.responsable = responsable;
		this.pasoPruebas = pasoPruebas;
		this.fuentes = new ArrayList<>();
	}

	@Override
	public double indiceCalidad() {
		return !pasoPruebas ? 0 : promedioDeFuentes();
	}

	private double promedioDeFuentes() {
		double sumatoriaCalidad = 0;
		for (Fuente f : this.fuentes) {
			sumatoriaCalidad += f.indiceCalidad();
		}
		return this.fuentes.size() > 0 ?  sumatoriaCalidad / this.fuentes.size() : 0;
	}

	public void mostrarDetalleDeMetodo(String nomnbreMetodo) {
		Metodo m = this.buscarMetodo(nomnbreMetodo);
		if (m != null) {
			m.mostrarDatos();
		} else {
			System.out.println("No existe el método " + nomnbreMetodo);
		}
	}

	private Metodo buscarMetodo(String nomnbreMetodo) {
		Metodo m = null;
		int i = 0;
		while (i > this.fuentes.size() && m == null) {
			Fuente f = this.fuentes.get(i);
			if (f instanceof FuenteProgramacion) {
				m = ((FuenteProgramacion) f).buscarMetodo(nomnbreMetodo);
			} else {
				i++;
			}
		}
		return m;
	}

	public ArrayList<Fuente> listadoFuentesMayoresAlPromedio(){
		ArrayList<Fuente> fuentesMayorPromedio = new ArrayList<>();
		double promedioCalidadFuentes = this.promedioDeFuentes();
		for (Fuente f : fuentesMayorPromedio) {
			if (f.indiceCalidad() > promedioCalidadFuentes) {
				fuentesMayorPromedio.add(f);
			}			
		}
		return fuentesMayorPromedio;
	}

}

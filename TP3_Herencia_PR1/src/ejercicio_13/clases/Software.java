package ejercicio_13.clases;

import java.util.ArrayList;

public class Software {
	
	private String nombre;
	private ArrayList<Programa> programas;
	
	public Software(String nombre) {
		this.nombre = nombre;
		this.programas = new ArrayList<>();
	}
	
	public ArrayList<Programa> programasPorDebajoDe(double umbralMinimo) {
		ArrayList<Programa> programasBajoUmbral = new ArrayList<>();
		for (Programa p : this.programas) {
			if (p.indiceCalidad() < umbralMinimo){
				programasBajoUmbral.add(p);
			}
		}
		return programasBajoUmbral;
	}
	
	public void agregarProgramas(Programa p) {
		this.programas.add(p);
	}

}

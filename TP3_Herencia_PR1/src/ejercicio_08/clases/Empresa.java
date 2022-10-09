package ejercicio_08.clases;

import java.util.ArrayList;
import java.util.Collections;

public class Empresa {
	
	private ArrayList<Personal> perosonal;
	
	public Empresa() {
		this.perosonal = new ArrayList<>();
	}
	
	public void agregarEmpleado(Personal p) {
		this.perosonal.add(p);
		Collections.shuffle(perosonal);
	}
	
	public void mostrarSalarios() {
		for (Personal p : this.perosonal) {
			System.out.println(p.mostrarSalario());
		}
	}
	

}

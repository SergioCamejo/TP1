package ejercicio_03;

import java.util.ArrayList;

public class Podio {

	private ArrayList<Atleta> primerLugar;
	private ArrayList<Atleta> segundoLugar;
	private ArrayList<Atleta> tercerLugar;

	public Podio(ArrayList<Atleta> primerLugar, ArrayList<Atleta> segundoLugar, ArrayList<Atleta> tercerLugar) {
		this.primerLugar = primerLugar;
		this.segundoLugar = segundoLugar;
		this.tercerLugar = tercerLugar;
	}

	public void mostrar() {
		mostrarEscalon("Primer puesto:", primerLugar);
		mostrarEscalon("Segundo puesto:", segundoLugar);
		mostrarEscalon("Tercer puesto:", tercerLugar);
	}

	private void mostrarEscalon(String texto, ArrayList<Atleta> lista) {
		System.out.println(texto);
		for (Atleta atleta : lista) {
			System.out.println(atleta);
		}
	}

	@Override
	public String toString() {
		return "Podio [primerLugar=" + primerLugar + ", segundoLugar=" + segundoLugar + ", tercerLugar=" + tercerLugar
				+ "]";
	}
	
}

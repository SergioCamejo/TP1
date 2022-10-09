package aseguradora.clases;

import java.util.ArrayList;

public class Aseguradora {

	private static final String TXT_ASEGURANDO = "Asegurando a %s por con un premio mensual de: $%.2f\n";
	private static final String TXT_ENCABEZADO = "Sistema de estadísticas de la compañia aseguradora ";
	private static final String MSG_ESTADISTICA_CANT_TECNO = "La cantidad de tenedores de Tecnología de género femenino es: ";
	private static final String MSG_ESTADISTICA_PREMIO_MAY_HOGAR = "El premio mayor de los seguros de hogar es: ";
	private static final String MSG_ESTADISTICA_PROMEDIO_EDAD = "La edad promedio de los asegurados es: ";
	
	private String nombre;
	private ArrayList<Asegurado> asegurados;
	private ArrayList<Seguro> seguros;
	private float premioMayor = 0;
	private int tomadorasFemeninasTecnologia = 0;
	private int sumatoriaEdades = 0;
	
	public Aseguradora(String nombre) {
		this.nombre = nombre;
		this.asegurados= new ArrayList<>();
		this.seguros = new ArrayList<>();
	}

	public void agregarCliente(Asegurado asegurado) {
		Asegurado a = this.buscarAsegurado(asegurado.dameDni());
		if (a == null) {
			this.asegurados.add(asegurado);
			this.sumatoriaEdades += asegurado.dameEdad();
		}		
	}

	private Asegurado buscarAsegurado(String dni) {
		Asegurado a = null;
		int i = 0;
		while (i < this.asegurados.size() && a == null) {
			if (this.asegurados.get(i).mismoDni(dni)) {
				a = this.asegurados.get(i);
			} else {
				i++;
			}
		}
		return a;
	}

	public void mostrar() {
		for (Seguro s : this.seguros) {
			System.out.printf(TXT_ASEGURANDO, s.dameTomador(), s.calcular());
			this.discriminarSeguroHogar(s);
			this.discriminarSeguroTecnologia(s);
		}
		System.out.println(TXT_ENCABEZADO + this.nombre);
		System.out.println(MSG_ESTADISTICA_PREMIO_MAY_HOGAR + this.premioMayor);
		System.out.println(MSG_ESTADISTICA_CANT_TECNO + this.tomadorasFemeninasTecnologia);
		System.out.println(MSG_ESTADISTICA_PROMEDIO_EDAD + this.edadesPromedioAsegurados());
		
	}

	private double edadesPromedioAsegurados() {
		return (double) this.sumatoriaEdades / (double) this.asegurados.size();
	}

	private void discriminarSeguroTecnologia(Seguro s) {
		if (s instanceof SeguroTecnologia) {
			if (s.laTomadoraEsFemenina()) {
				tomadorasFemeninasTecnologia++;
			}
		}		
	}

	private void discriminarSeguroHogar(Seguro s) {
		if (s instanceof SeguroHogar) {
			if (s.calcular() > this.premioMayor) {
				this.premioMayor = (float) s.calcular();				
			}
		}		
	}

	/**
	 * Relaciona el asegurado con el tomador del seguto.
	 * @param dni
	 * @param s
	 */
	public void asegurar(String dni, Seguro s) {
		s.agregarAsegurado(this.buscarAsegurado(dni));
		this.seguros.add(s);
		
	}

	public Seguro generarSeguroHogar(int metrosCuadrados, Provincia provincia) {		
		return new SeguroHogar(metrosCuadrados, provincia);
	}

	public Seguro generarSeguroTecnologia(float valorAsegurado, String marca, String modelo) {
		return new SeguroTecnologia(marca, modelo, valorAsegurado);
	}	

}


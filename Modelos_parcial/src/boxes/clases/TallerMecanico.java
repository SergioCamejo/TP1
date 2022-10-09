package boxes.clases;

import java.util.ArrayList;

public class TallerMecanico {
	
	private ArrayList<Servicio> serviciosEfectuados;
	private String nombre;
	private int cantAceite = 0;
	private int cantAlinuecion = 0;
	private int cantEncendido = 0;
	private double totalVentas = 0;
	
	private static final String FORMATO_CANTIDADES = "Se efectuaron: %d cambios de aceite, %d encendido y %d alineacion\n";

	
	public TallerMecanico(String nombre) {
		this.nombre = nombre;
		this.serviciosEfectuados = new ArrayList<>();
	}
	
	public boolean agregarServicio(Servicio nuevoServicio) {
		boolean pudo = false;
		if (nuevoServicio != null) {
			pudo = this.serviciosEfectuados.add(nuevoServicio);
			this.discriminarServicios(nuevoServicio);
			this.totalVentas += nuevoServicio.calcularPrecioVenta();
		}
		return pudo;
	}
	
	private void discriminarServicios(Servicio s) {
		if (s instanceof CambioAceite) {
			cantAceite++;
		} else if (s instanceof Alineacion) {
			cantAlinuecion++;
		} else if (s instanceof Encendido) {
			this.cantEncendido++;
		}
		
	}

	public void listarServicios() {
		System.out.println("Taller" + this.nombre);
		System.out.printf(FORMATO_CANTIDADES, this.cantAceite, this.cantEncendido, this.cantAlinuecion);
		System.out.println("El importe total de ventas es de : $" + this.totalVentas);
	}

}

package ejercicio_04.clases;

import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Reserva> reservas;
	
	public Empresa() {
		this.reservas = new ArrayList<>();
	}
	
	public double recaudacionTotal() {
		double totalRecaudado = 0;
		for (Reserva r : this.reservas) {
			totalRecaudado += r.dameValor();
		}
		return totalRecaudado;
	}
	
	public void agregarReserva(Reserva r) {
		this.reservas.add(r);
	}
	
	public int cantVecesRecorrida(Estacion e) {
		int cantPesonas = 0;
		for (Reserva r : this.reservas) {
			if (r.pasaPorEstaEstacion(e)) {
				cantPesonas += r.dameCantidadDePersonas();
			}
		}
		return cantPesonas;
	}

}

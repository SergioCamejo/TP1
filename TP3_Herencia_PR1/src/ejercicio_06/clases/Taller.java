package ejercicio_06.clases;

import java.util.ArrayList;

public class Taller {
	
	public int cantServiciosPosibles(ArrayList<Bicicleta> bicicletas) {
		int totalServicios = 0;
		for (Bicicleta b : bicicletas) {
			if (b.cumpleLasCondiciones()) {
				totalServicios++;
			}
		}
		return totalServicios;
	}

}

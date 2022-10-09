package menuCompleto.menus;

import java.util.Scanner;

import menuCompleto.opciones.OpcionDeMenu;
import menuCompleto.opciones.OpcionOnOff;

public class MenuDeTareas extends Menu {
	
	private int totaltareas = 0;

	public MenuDeTareas(String titulo, Scanner input) {
		super(titulo, input);
	}
	
	@Override
	public void registrar(OpcionDeMenu opcion) {
		if (opcion != null && opcion instanceof OpcionOnOff) {
			super.copiaLista().add(opcion);		
		}
		if (((OpcionOnOff) opcion).estaActiva()) {
			this.totaltareas++;				
		}
	}
	
	public int getTotalTareasCumplidas() {
		return this.totaltareas;
	}

}

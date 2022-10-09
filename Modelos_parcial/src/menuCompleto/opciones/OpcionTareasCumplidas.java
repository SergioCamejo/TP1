package menuCompleto.opciones;

import menuCompleto.menus.MenuDeTareas;

public class OpcionTareasCumplidas extends OpcionDeMenu {
		

	public OpcionTareasCumplidas(String descripcion, char charSelector, MenuDeTareas menuTareas) {
		super(descripcion, charSelector);
	}

	@Override
	public void ejecutar() {
		//System.out.println("Cantidad de tareas cumplidas: " + ((MenuDeTareas) getMenu()).getTotalTareasCumplidas());
	}

}

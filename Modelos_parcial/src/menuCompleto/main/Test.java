package menuCompleto.main;

import java.util.Scanner;

import menu.clases.OpcionAccesoAMenu;
import menuCompleto.menus.Menu;
import menuCompleto.menus.MenuDeTareas;
import menuCompleto.opciones.OpcionOnOff;
import menuCompleto.opciones.OpcionTareasCumplidas;

public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MenuDeTareas menuSecundario = new MenuDeTareas("Lista De Tareas", input);
		menuSecundario.registrar(new OpcionOnOff("Escribir Interfaz Activable", 'I'));
		menuSecundario.registrar(new OpcionOnOff("Desarrollar Clase OpcionOnOff", 'O'));
		menuSecundario.registrar(new OpcionOnOff("Desarrollar Clase OpcionTareasCumplidas", 'C'));
		menuSecundario.registrar(new OpcionOnOff("Extender MenuDeTareas desde Menu", 'M'));
		menuSecundario.registrar(new OpcionOnOff("Testear Programa", 'T'));
		menuSecundario.registrar(new OpcionOnOff("Exportar Proyecto", 'E'));
		menuSecundario.registrar(new OpcionOnOff("Entregar Proyecto Exportado", 'U'));
		Menu menuPrincipal = new Menu("Menu Principal", input);
		//menuPrincipal.registrar(new OpcionAccesoAMenu("Listar Tareas", 'L', menuSecundario));
		menuPrincipal.registrar(new OpcionTareasCumplidas("Contar Tareas Cumplidas", 'C', menuSecundario));
		menuPrincipal.ejecutar();
		System.out.println("Fin del programa");
		input.close();
	}

}

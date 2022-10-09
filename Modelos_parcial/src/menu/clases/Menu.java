package menu.clases;

import java.util.ArrayList;
import java.util.Scanner;
import menu.interfaces.Ejecutable;
import menu.interfaces.Mostrable;

public class Menu implements Ejecutable, Mostrable{
	
	private String titulo;
	private ArrayList<OpcionDeMenu> opciones;
	private OpcionDeSalida opcionSalida;
	private Scanner input = new Scanner(System.in);

	public Menu(String titulo, Scanner input) {
		this.titulo = titulo;
		this.input = input;
		this.opciones = new ArrayList<>();
		this.opcionSalida = new OpcionDeSalida();
	}

	public void registar(OpcionDeMenu opcion) {
		if (!(opcion instanceof OpcionDeSalida) && opcion != null) {
			this.opciones.add(opcion);
		}
	}	

	@Override
	public void mostrar() {
		System.out.println(" -- " + this.titulo + " -- ");
		for (OpcionDeMenu o : this.opciones) {
			o.mostrar();
		}
		this.opcionSalida.mostrar();
		System.out.print("Ingrese la opcion deseada: ");		
	}

	@Override
	public void ejecutar() {
		OpcionDeMenu opcion = this.elegirOpcion(); // para elegir la opcion deseada
		while (opcion != this.opcionSalida) {
			if (opcion instanceof OpcionAccesoAMenu) {
				System.out.println("La opción elegida es: " + opcion.getDescripcion()); // muestra la opcion elegida
				opcion.ejecutar(); // vuelve a mostrar el menu
			}
			opcion = this.elegirOpcion();
		}
	}

	private OpcionDeMenu elegirOpcion() {
		OpcionDeMenu opcion = null;
		char elegir;
		this.mostrar();
		do {		// entra siempre al do while porque la opcion es null
			elegir = input.nextLine().toUpperCase().charAt(0);
			opcion = this.buscarOpcion(elegir);
			if (opcion == null) {
				System.out.println("La opcion es inválida.");
				System.out.print("Vuelva a elegir una opción: ");
			}
		} while (opcion == null);
		return opcion;				
	}

	private OpcionDeMenu buscarOpcion(char elegir) {
		OpcionDeMenu opcion = null;
		int i = 0;
		if (elegir == this.opcionSalida.getCaracter()) {
			opcion = this.opcionSalida;
			this.opcionSalida.ejecutar();
		} else {
			while (i < this.opciones.size() && this.opciones.get(i).getCaracter() != elegir) {
				i++;
			}
			if (i < this.opciones.size()) {
				opcion = this.opciones.get(i);
			}
		}
		return opcion;
	}

}


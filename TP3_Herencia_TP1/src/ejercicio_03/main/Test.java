package ejercicio_03.main;

import java.util.ArrayList;
import java.util.Scanner;
import ejercicio_03.clases.Heladera;
import ejercicio_03.clases.Lavarropa;
import ejercicio_03.clases.Producto;
import ejercicio_03.clases.Televisor;

public class Test {

	final static Scanner input = new Scanner(System.in);
	static ArrayList<Producto> productos = new ArrayList<>();
	static double total = 0;

	public static void main(String[] args) {

		//Empresa e = new Empresa();		
		//e.agregarProductos(new Heladera("Whirlpool,", "H2745", 25, 220, 14999, 250, false));

		cargarProductos(new Heladera("Whirlpool", "H2745", 25, 220, 14999, 250, false));
		cargarProductos(new Televisor("Philips", "49PGFS", 89, 220, 14370, 49, true));		
		cargarProductos(new Lavarropa("Drean", "CONCEPT 5.05", 12, 220, 6799, 6, false));

		mostrarProductos();

		System.out.println();
		elegirProductos();
	}

	public static void cargarProductos(Producto p) {
		productos.add(p);
		total += p.getPrecio();
	}

	public static void mostrarProductos() {
		int numeroProducto = 1;
		for (Producto p : productos) {
			System.out.println(numeroProducto++ + " " + p.toString());
		}
	}

	public static void elegirProductos() {
		ArrayList<Producto> productosElegidos = new ArrayList<>();
		int opcion;

		System.out.println("Elija una opcion para agregar al carrito o 0 para terminar: ");
		opcion = Integer.parseInt(input.nextLine());				

		while ((opcion - 1) > productos.size());

		if (opcion >= 1) {
			while ((opcion - 1)< productos.size() && opcion != 0) {
				System.out.println("Se eligio: " + productos.get(opcion - 1));
				productosElegidos.add(productos.get(opcion - 1));
				System.out.println("Eleija una opcion para agregar al carrito o 0 para terminar: ");
				opcion = Integer.parseInt(input.nextLine());
			}
			imprimirTiket(productosElegidos);
		} 
	}

	private static void imprimirTiket(ArrayList<Producto> productosElegidos) {
		double total = 0;
		System.out.println();
		System.out.println("Ticket de venta");
		System.out.println("Articulos");
		for (Producto p : productosElegidos) {
			System.out.println(p.mostarParaTiket() + ": $" + p.getPrecio());
			total += p.getPrecio();
		}
		System.out.println("Total: $" + total);

	}

}

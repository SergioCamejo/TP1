package ejercicio_01;

public class Main {

	public static void main(String[] args) {

		Grupo g = new Grupo("1");
		String i1 = "Sergio";
		String i2 = "Carlos";
		String i3 = "María";
		String i4 = "Ana";

		agregarIntegrante(g, i1);
		agregarIntegrante(g, i2);
		agregarIntegrante(g, i3);
		agregarIntegrante(g, i4);

		System.out.println();
		g.mostrar();
		System.out.println();
		System.out.println("El integrante buscado es: " + g.obtenerIntegrante(2));
		System.out.println();
		mostarEliminado(g, i3);
		System.out.println();
		g.mostrar();
		System.out.println();
		mostarEliminado(g, i3);		
		vaciarGrupo(g);		
		System.out.println();
		g.mostrar();

	} // fin metodo main

	public static void agregarIntegrante(Grupo g, String integrante){
		g.agregarIntegrante(integrante);
		System.out.println(integrante + " fue asignado al grupo: " + g);
	}

	public static boolean perteneceAlGrupo(Grupo g, String integrante){
		boolean pertenece = false;
		g.buscarIntegrante(integrante);
		return pertenece;
	}

	public static void mostarEliminado(Grupo g, String integrante) {
		System.out.println("El integrante eliminado es " + g.removerIntegrante(integrante));
	}
	
	public static void vaciarGrupo(Grupo g) {
		g.vaciar();
	}

}

package ejercicio_03;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Atleta a1 = new Atleta(1.52);
		Atleta a2 = new Atleta(1.50);
		Atleta a3 = new Atleta(1.53);
		Atleta a4 = new Atleta(1.65);
		Atleta a5 = new Atleta(1.65);
		Atleta a6 = new Atleta(1.48);
		Atleta a7 = new Atleta(1.50);
		Atleta a8 = new Atleta(1.57);
		Atleta a9 = new Atleta(1.57);
		Atleta a10 = new Atleta(1.60);
		
		ArrayList<Atleta> atletas = new ArrayList<>();
		atletas.add(a1);		
		atletas.add(a2);
		atletas.add(a3);
		atletas.add(a4);
		atletas.add(a5);
		atletas.add(a6);
		atletas.add(a7);
		atletas.add(a8);
		atletas.add(a9);
		atletas.add(a10);
		
		
		
		
		Carrera c = new Carrera();
		
		System.out.println(c.obtenerGanadores(atletas));
		
		/*c.agregarAtleta(a1);
		c.agregarAtleta(a2);
		c.agregarAtleta(a3);
		c.agregarAtleta(a4);
		c.agregarAtleta(a5);
		c.agregarAtleta(a6);
		c.agregarAtleta(a7);
		c.agregarAtleta(a8);
		c.agregarAtleta(a9);
		c.agregarAtleta(a10);*/
		
		
		//c.obtenerGanadores(atletas):
		

	}

}

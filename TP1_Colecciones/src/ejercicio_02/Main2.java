package ejercicio_02;

public class Main2 {

	public static void main(String[] args) {
		
		Atleta a1 = new Atleta(1.52);
		Atleta a2 = new Atleta(1.50);
		Atleta a3 = new Atleta(1.53);
		Atleta a4 = new Atleta(1.50);
		
		Carrera c = new Carrera();
		
		c.agregarAtleta(a1);
		c.agregarAtleta(a2);
		c.agregarAtleta(a3);
		c.agregarAtleta(a4);
		
		System.out.println(c.obtenerGanador());
		

	}

}

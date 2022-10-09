package ejercicio_07.main;

import java.util.ArrayList;

import ejercicio_07.clases.Circunferencia;
import ejercicio_07.clases.Figura;
import ejercicio_07.clases.GrupoDeFiguras;
import ejercicio_07.clases.Rectangulo;
import ejercicio_07.clases.TrianguloEquilatero;

public class Test {

	static ArrayList<Figura> figuras = new ArrayList<>();
	
	public static void main(String[] args) {
		
		GrupoDeFiguras g = new GrupoDeFiguras();
		
		g.agregarFiguras(new Circunferencia("Verde", 15.2));
		g.agregarFiguras(new TrianguloEquilatero("Rojo", 3));
		g.agregarFiguras(new Rectangulo("Amarillo", 4, 9));
		g.agregarFiguras(new Rectangulo("Azul", 9, 3));
		g.agregarFiguras(new Rectangulo("Fuxia", 2, 5));
		g.agregarFiguras(new TrianguloEquilatero("Marrón", 47));
		g.agregarFiguras(new Circunferencia("Celeste", 7.3));		
		
		g.mostrarInfoDeFiguras();

	}

}

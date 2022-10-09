package ejercicio_07.clases;

import java.util.ArrayList;
import java.util.Collections;

public class GrupoDeFiguras {
	
	private ArrayList<Figura> figuras;
	
	public GrupoDeFiguras() {
		this.figuras = new ArrayList<>();
	}
	
	public void agregarFiguras(Figura f) {
		this.figuras.add(f);
		Collections.shuffle(figuras);
	}
	
	public void mostrarInfoDeFiguras() {
		for (Figura f : this.figuras) {
			System.out.println("El color del " + f.getClass().getSimpleName() + " es: " + f.getColor());
			System.out.println("El área del " + f.getClass().getSimpleName() + " es: " + f.area() );
			System.out.println("El perímetro del " + f.getClass().getSimpleName() + " es: " + f.perimetro() );
			System.out.println();
		}
	}

}

package ejercicio_07.clases;

public class TrianguloEquilatero extends Figura {
	
	private int lado;

	public TrianguloEquilatero(String color, int lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double area() {
		return Math.pow(this.lado, (double) 1 / 3);
	}

	@Override
	public double perimetro() {
		return  3 * this.lado;
	}

}

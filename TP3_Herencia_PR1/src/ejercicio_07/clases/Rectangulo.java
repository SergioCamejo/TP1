package ejercicio_07.clases;

public class Rectangulo extends Figura {

	private int alto;
	private int ancho;

	public Rectangulo(String color, int alto, int ancho) {
		super(color);
		this.alto = alto;
		this.ancho = ancho;
	}

	@Override
	public double area() {
		return this.alto * this.ancho;
	}

	@Override
	public double perimetro() {
		return 2 * (this.alto + this.ancho);
	}

}

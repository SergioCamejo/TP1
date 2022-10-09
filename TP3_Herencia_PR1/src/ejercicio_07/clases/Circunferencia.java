package ejercicio_07.clases;

public class Circunferencia extends Figura {
	
	private double radio;	

	public Circunferencia(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double area() {
		return Math.PI * this.radio * this.radio;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * this.radio;
	}

}

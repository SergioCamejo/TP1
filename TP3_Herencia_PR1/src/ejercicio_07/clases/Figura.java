package ejercicio_07.clases;

public abstract class Figura {
	
	private String color;
	
	public Figura(String color) {
		this.color = color;
	}
	
	public abstract double area();
	
	public abstract double perimetro();
	
	public String getColor() {
		return this.color;
	}

}

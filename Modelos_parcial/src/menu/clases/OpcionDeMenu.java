package menu.clases;

import menu.interfaces.Ejecutable;
import menu.interfaces.Mostrable;

public abstract class OpcionDeMenu implements Ejecutable, Mostrable{
	
	private String descripcion;
	private char caracter;
	
	public OpcionDeMenu(String descripcion, char caracter) {
		this.descripcion = descripcion;
		this.setCaracter(caracter);
	}

	private void setCaracter(char caracter) {
		if (this.caracter != 'x' || this.caracter == ' ') {	
			this.caracter = caracter;
		}		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public char getCaracter() {
		return caracter;
	}
	
	@Override
	public void mostrar() {
		System.out.println(this.caracter + " - " + this.descripcion);
	}
	
}
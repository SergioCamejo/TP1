package ejercicio_01.clases;

public class Informe {
	
	private double montoAAbonar;
	private String apellidoCajero;
	private int nivelBateriarobot;
	
	public Informe(double montoAAbonar, String apellidoCajero, int nivelBateriarobot) {
		this.montoAAbonar = montoAAbonar;
		this.apellidoCajero = apellidoCajero;
		this.nivelBateriarobot = nivelBateriarobot;
	}

	@Override
	public String toString() {
		return "Informe [montoAAbonar=" + montoAAbonar + ", apellidoCajero=" + apellidoCajero + ", nivelBateriarobot="
				+ nivelBateriarobot + "]";
	}
	
}

package ejercicio_13.clases;

public class Metodo implements Calificable{
	
	final static int POR_CANT_PARAMETROS = 5;
	final static int POR_CANT_INSTRUCCIONES = 20;
	final static int POR_CANTIDAD_DE_RAMIFICACIONES = 3;
	final static int SE_SUMA_A_LOS_PARAMETROS = 1;
	final static int SE_SUMA_A_LOS_INSTRUCCIONES = 1;
	final static int SE_SUMA_A_LAS_RAMIFICACIONES = 1;
	
	private String nombre;
	private int cantParametro;
	private int cantInstrucciones;
	private int cantRamificaciones;
	
	public Metodo(String nombre, int cantParametro, int cantInstrucciones, int cantRamificaciones) {
		this.nombre = nombre;
		this.cantParametro = cantParametro;
		this.cantInstrucciones = cantInstrucciones;
		this.cantRamificaciones = cantRamificaciones;
	}

	@Override
	public double indiceCalidad() {
		return  POR_CANT_PARAMETROS / (this.cantParametro + SE_SUMA_A_LOS_PARAMETROS) + POR_CANT_INSTRUCCIONES /
				this.cantInstrucciones + SE_SUMA_A_LOS_INSTRUCCIONES / (this.cantRamificaciones + SE_SUMA_A_LAS_RAMIFICACIONES);
	}

	public void mostrarDatos() {
		System.out.println("Cantidad de parametros: " + this.cantParametro);
		System.out.println("Cantidad de instrucciones: " + this.cantInstrucciones);
		System.out.println("Cantidad de ramificaciones: " + this.cantRamificaciones);
		
	}

	public boolean esTuNumbre(String nomnbreMetodo) {
		return this.nombre.equals(nomnbreMetodo);
	}

	
	
}

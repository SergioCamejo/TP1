package ejercicio_01.clases;

public class Robot {
	
	private String codigo;
	private int nivelBateria;
	
	public Robot(String codigo, int nivelBateria) {
		this.codigo = codigo;
		this.nivelBateria = nivelBateria;
	}

	public boolean tieneEsteCodigo(String codigoRobot) {
		return this.codigo.equals(codigoRobot);
	}
	
	public int getNivelBteria() {
		return this.nivelBateria;
	}

	@Override
	public String toString() {
		return "Robot [codigo=" + codigo + ", nivelBateria=" + nivelBateria + "]";
	}

}

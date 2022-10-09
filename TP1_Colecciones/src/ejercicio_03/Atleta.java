package ejercicio_03;

public class Atleta {
	
	private double tiempo;
	
	public Atleta(double tiempo) {
		this.tiempo = tiempo;
	}

	public double getTiempo() {
		return tiempo;
	}

	@Override
	public String toString() {
		return "Atleta [tiempo=" + tiempo + "]";
	}	

}

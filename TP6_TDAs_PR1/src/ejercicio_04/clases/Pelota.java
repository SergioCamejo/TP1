package ejercicio_04.clases;

public class Pelota {
	
	private String codigo;
	private TipoPelota tipo;
	
	public Pelota(String codigo, TipoPelota tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return codigo + " " + tipo.getDato();
	}

	public boolean EsTuCodigo(String codigo) {
		return this.codigo.equals(codigo);
	}
	
	public TipoPelota getTipo() {
		return this.tipo;
	}
	

}

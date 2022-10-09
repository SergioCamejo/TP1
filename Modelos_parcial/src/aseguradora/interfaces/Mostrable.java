package aseguradora.interfaces;

public interface Mostrable {

	public static final String PATRON_TEXTO_HOGAR = "Provincia: %s - Metros cuadrados: %d";
	public static final String PATRON_TEXTO_TECNO = "Marca: %s - Modelo: %Ss - Valor de Reposición: %.2f";
	
	public void mostrar();
	
	public String texto();
}

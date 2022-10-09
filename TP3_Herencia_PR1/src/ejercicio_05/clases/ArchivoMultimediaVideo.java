package ejercicio_05.clases;

public class ArchivoMultimediaVideo extends ArchivoMultimedia {
	
	private final static int ALTO_HD = 1080;
	private final static int ANCHO_HD = 1920;
	
	private int alto;
	private int ancho;
	private FormatoArchivoVideo formatoVideo;
	
	public ArchivoMultimediaVideo(String nombre, double peso, String localizacion, int duracion, int alto, int ancho, FormatoArchivoVideo formatoVideo) {
		super(nombre, peso, localizacion, duracion);
		this.alto = alto;
		this.ancho = ancho;
		this.formatoVideo =  formatoVideo;
	}
	
	public boolean sosFullHd() {
		return this.ancho == ANCHO_HD && this.alto == ALTO_HD;
	}
	
	
	
}

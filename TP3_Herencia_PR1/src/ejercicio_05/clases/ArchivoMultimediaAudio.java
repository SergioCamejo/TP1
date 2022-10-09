package ejercicio_05.clases;

public class ArchivoMultimediaAudio extends ArchivoMultimedia {
	
	private String artista;
	private String album;
	private FormatoArchivoAudio formatoAudio;
	
	public ArchivoMultimediaAudio(String nombre, double peso, String localizacion, int duracion, String artista, String album, FormatoArchivoAudio formatoAudio) {
		super(nombre, peso, localizacion, duracion);
		this.artista = artista;
		this.album = album;
		this.formatoAudio = formatoAudio;
	}
	
	

}

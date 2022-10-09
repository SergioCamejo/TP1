package ejercicio_05.main;

import ejercicio_05.clases.ArchivoMultimediaAudio;
import ejercicio_05.clases.ArchivoMultimediaVideo;
import ejercicio_05.clases.ArchivoTexto;
import ejercicio_05.clases.Computadora;
import ejercicio_05.clases.FormatoArchivoAudio;
import ejercicio_05.clases.FormatoArchivoVideo;

public class Test {

	public static void main(String[] args) {
		
		Computadora c = new Computadora();
		c.agregarArchivo(new ArchivoMultimediaAudio("Bohemian Rapsody", 7745, "C:/Musica", 356, "Queen", "A night at the opera", FormatoArchivoAudio.MP3));
		c.agregarArchivo(new ArchivoMultimediaVideo("El padrino", 667745, "C:/Peliculas", 1356, 1080, 1920, FormatoArchivoVideo.MP4));
		c.agregarArchivo(new ArchivoTexto("Códigos", 145, "C:/Documentos", "UTF-8"));
		c.agregarArchivo(new ArchivoMultimediaAudio("Hablando de la libertad", 9942, "C:/Musica", 642, "La renga", "Despadazado por mil partes", FormatoArchivoAudio.MP3));
		c.agregarArchivo(new ArchivoTexto("Recetas", 345, "C:/Documentos", "Otra"));
		
		System.out.println(c.cantArchivosDeTexto());
		
		System.out.println();
		System.out.println(c.videosFullHD());

	}

}

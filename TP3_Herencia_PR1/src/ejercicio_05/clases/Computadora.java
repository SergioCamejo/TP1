package ejercicio_05.clases;

import java.util.ArrayList;
import java.util.Collections;

public class Computadora {
	
	private ArrayList<Archivo> archivos;
	
	public Computadora() {
		this.archivos = new ArrayList<>();
	}
	
	public void agregarArchivo(Archivo a) {
		this.archivos.add(a);
		Collections.shuffle(archivos);
	}
	
	public void cerrarTodos() {
		for (Archivo a : this.archivos) {
			a.cerrar();
		}
	}
	
	public int cantArchivosDeTexto() {
		int cantTexto = 0;
		for (Archivo a : this.archivos) {
			if (a instanceof ArchivoTexto) {
				cantTexto++;
			}
		}
		return cantTexto;
	}
	
	public void cifrarArchivos() {
		for (Archivo a : this.archivos) {
			if (a instanceof ArchivoTexto) {
				ArchivoTexto at = (ArchivoTexto) a;
				if (at.sosUTF8()) {
					at.cifrarContenido();
				}
			}
		}
	}
	
	public double duracionPromedio() {
		int totalArchivos = 0;
		int totalSegundos = 0;
		for (Archivo a : this.archivos) {
			if (a instanceof ArchivoMultimedia) {
				totalSegundos = ((ArchivoMultimedia) a).dameDuracion();	
				totalArchivos++;
			}
		}
		return totalSegundos / totalArchivos;
	}
	
	public ArrayList<Archivo> videosFullHD() {
		ArrayList<Archivo> archivosFullHD = new ArrayList<>();
		for (Archivo a : this.archivos) {
			if (a instanceof ArchivoMultimediaVideo && ((ArchivoMultimediaVideo) a).sosFullHd()) {
				archivosFullHD.add(a);
			}
		}
		return archivosFullHD;
	}

}

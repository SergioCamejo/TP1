package ejercicio_01;

import java.util.ArrayList;

public class Grupo {

	private String nombre;
	private ArrayList<String> integrantes;

	public Grupo(String nombre) {
		this.setNombre(nombre);
		this.integrantes = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}

	/* Agrega al grupo el nombre de un nuevo integrante, 
	 * siempre y cuando éste no haya sido cargado con anterioridad.
	 * Cuando ya exista, no debe volver a agregarlo.
	 * */
	public void agregarIntegrante(String nombreIntegrante) {
		if (this.buscarIntegrante(nombreIntegrante) == null) {
			this.integrantes.add(nombreIntegrante);
		}		
	}

	/* Devuelve la posición en el grupo del integrante cuyo nombre se
	 * ha recibido por parámetro. En caso de no encontrarlo devolverá -1.
	 * */
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		/* Devuelve el índice de la primera aparición del elemento especificado
		* en esta lista, o -1 si esta lista no contiene el elemento.
		* */
		return this.integrantes.indexOf(nombreIntegrante);
	}

	/* Recibe un valor entero que representa la posición del integrante en la
	 * lista (entero igual o mayor que 1) y devuelve el integrante guardado en 
	 * (posicion - 1) dentro de la colección de integrantes. Si el integrante no
	 * existe se debe devolver null .
	 * */
	public String obtenerIntegrante(int posicion) {
		String integrante = null;
		if (posicion >= 1 && posicion <= this.integrantes.size()) {
			integrante = this.integrantes.get(posicion - 1);		
		}
		return integrante;
	}
	
	/* Busca al integrante del grupo cuyo nombre coincida con el parámetro
	 * de entrada. En caso de que haya coincidencia, lo devuelve;
	 * caso contrario, el método devolverá null ..
	 * */
	public String buscarIntegrante(String nombreIntegrante) {
		String integrante = null;
		int i = 0;
		while (i < this.integrantes.size() && integrante == null) {
			if (this.integrantes.get(i).equals(nombreIntegrante)) {
				integrante = this.integrantes.get(i);
			} else {
				i++;				
			}
		}
		return integrante;
	}
	
	/* Remueve de la colección de integrantes a aquel cuyo nombre coincide
	 * con el nombre recibido como parámetro. Si lo encontró, luego de removerlo
	 * debe devolverlo con return , y si no debe devolver null.
	 * */
	public String removerIntegrante(String nombreIntegrante) {
		String integranteRemovido = null;
		int posiscionIntegranteRemovido = this.obtenerPosicionIntegrante(nombreIntegrante);
		if (posiscionIntegranteRemovido != -1) {
			integranteRemovido = this.integrantes.remove(posiscionIntegranteRemovido);
		}
		return integranteRemovido;
	}
	
	/* Muestra por consola la cantidad de integrantes y
	 * los nombres de cada uno de ellos.
	 * */
	private void mostrarIntegrantes() {
		for (String i : integrantes) {
			System.out.println(i);
		}
	}
	
	/* Muestra por consola el nombre del grupo, la cantidad de
	 * integrantes y el nombre de cada uno de ellos.
	 * */
	public void mostrar() {
		System.out.println("Grupo: " + this.nombre);
		this.mostrarIntegrantes();
	}
	
	/* Elimina todos los elementos de la lista de integrantes.
	 * */
	public void vaciar() {
		this.integrantes.clear();
	}

	@Override
	public String toString() {
		return nombre;
	}
	
}
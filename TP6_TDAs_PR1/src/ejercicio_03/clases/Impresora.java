package ejercicio_03.clases;

import implementaciones.ColaNodos;
import interfaces.Cola;

public class Impresora {
	
	private Cola<Documento> documentos;
	private int cantHojas;
	private boolean estaEncendida;
	
	public Impresora(int cantHojas) {
		this.cantHojas = cantHojas;
		this.documentos = new ColaNodos<>();
	}
	
	public void encenderOApagar() {
		this.estaEncendida = !estaEncendida;
	}
	
	public void agregarDocumento(Documento doc) {
		this.documentos.add(doc);
	}
	
	public boolean imprimir() {
		boolean pudoImprimir = false;
		if (estaEncendida && this.hayHojasSuficientes()) {
			this.efectuarImpresion();
			pudoImprimir = true;
		}
		return pudoImprimir;
	}

	private void efectuarImpresion() {
		while (!this.documentos.isEmpty()) {
			Documento imprimoYRemuevo = this.documentos.remove();
			this.cantHojas -= imprimoYRemuevo.dameHojasRequeridas();
			System.out.println(imprimoYRemuevo);
		}
		
		System.out.println(this.cantHojas == 0 ? "No quedan hojas. Recargar." : "Quedan " + this.cantHojas + " en la bandeja.");
		
	}

	private boolean hayHojasSuficientes() {
		int totalHojasRequeridas = 0;
		Documento centinela = new Documento("centinela", 0, false);
		this.documentos.add(centinela);
		Documento docActual = this.documentos.remove();
		while (centinela != docActual) {
			totalHojasRequeridas += docActual.dameHojasRequeridas();
			this.documentos.add(docActual);
			docActual = this.documentos.remove();
		} 
		
		return this.cantHojas >= totalHojasRequeridas;
	}

}

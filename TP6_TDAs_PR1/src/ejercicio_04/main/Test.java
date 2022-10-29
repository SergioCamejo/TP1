package ejercicio_04.main;


import ejercicio_04.clases.DepartamentoDeportes;
import ejercicio_04.clases.Pelota;
import ejercicio_04.clases.TipoPelota;

public class Test {

	public static void main(String[] args) {
		
		DepartamentoDeportes d = new DepartamentoDeportes();
		d.agregarPelota(new Pelota("111", TipoPelota.VOLEY));
		d.agregarPelota(new Pelota("222", TipoPelota.FUTBOL));
		d.agregarPelota(new Pelota("333", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("444", TipoPelota.FUTBOL));
		d.agregarPelota(new Pelota("555", TipoPelota.VOLEY));
		d.agregarPelota(new Pelota("666", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("777", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("888", TipoPelota.FUTBOL));
		d.agregarPelota(new Pelota("999", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("000", TipoPelota.FUTBOL));
		d.agregarPelota(new Pelota("456", TipoPelota.VOLEY));
		d.agregarPelota(new Pelota("987", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("999", TipoPelota.BASQUET));
		d.agregarPelota(new Pelota("878", TipoPelota.FUTBOL));
		d.agregarPelota(new Pelota("273", TipoPelota.VOLEY));
		
		d.verPelotasEnTopes();
		System.out.println();
		System.out.println(d.buscarPelota("555"));
		System.out.println();
		//d.mostrarPelotasPorTipo();
		d.mostrarPelotasPorTipo();

	}

}

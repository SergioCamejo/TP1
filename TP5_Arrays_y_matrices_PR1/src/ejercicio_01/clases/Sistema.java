package ejercicio_01.clases;

import java.util.ArrayList;
import java.util.Iterator;

public class Sistema {

	private static final int CANTIDAD_CAJEROS = 5;
	private static final int CANTIDAD_ROBOTS = 8;
	private static final int NIVEL_CRITICO_BATERIA = 30;

	private Cajero[] cajeros;
	private Robot[] robots;
	private ArrayList<Pedido> pedidos;	
	private int posicionRobot = 0;
	private int posicionCajero = 0;

	public Sistema() {
		this.cajeros = new Cajero[CANTIDAD_CAJEROS];
		this.robots = new Robot[CANTIDAD_ROBOTS];
		this.pedidos = new ArrayList<>();
	}

	public double[] montosPorCajero() {
		double[] montosPorCajero = new double[cajeros.length];
		// otra manera de hacerlo es recorrer la lista de pedidos con un foreach
		/*for (Pedido p : this.pedidos) {
			montosPorCajero[p.getId()] = p.getMonto();
		}*/
		for (int i = 0; i < pedidos.size(); i++) {			
			montosPorCajero[this.pedidos.get(i).getIdCajero() - 1] += this.pedidos.get(i).getMonto();
		}
		return montosPorCajero;
	}
	
	public void mostrarMontosPorCajero() {
		for (double d : this.montosPorCajero()) {
			System.out.println(d);
		}
	}

	public Informe[] informeDePedidos() {
		Informe[] informes = new Informe[this.pedidos.size()];
		for (int i = 0; i < pedidos.size(); i++) {
			informes[i] = this.armarInforme(this.pedidos.get(i));
		}
		return informes;
	}

	private Informe armarInforme(Pedido pedido) {
		Cajero c = this.buscarCajero(pedido.getIdCajero());
		Robot r = this.buscarRobot(pedido.getCodigoRobot());
		return new Informe(pedido.getMonto(), c.getApellido(), r.getNivelBteria());
	}

	private Robot buscarRobot(String codigoRobot) {
		Robot r = null;
		int i = 0;
		while (i < this.robots.length && r == null) {
			if (this.robots[i].tieneEsteCodigo(codigoRobot)) {
				r = this.robots[i];
			}
			else i++;
		}
		return r;
	}

	private Cajero buscarCajero(int idCajero) {
		Cajero c = null;
		int i = 0;
		while (i < this.cajeros.length && c == null) {
			if (this.cajeros[i].tieneEsteId(idCajero)) {
				c = this.cajeros[i];
			}
			else i++;
		}
		return c;
	}

	public void	mostrarPedidosConMasRiesgo() {
		for (Pedido p : this.pedidos) {
			Robot r = this.buscarRobot(p.getCodigoRobot());
			if (r.getNivelBteria() < NIVEL_CRITICO_BATERIA) {
				System.out.println(p);				
			}
		}
	}

	public void agregarPedido(Pedido p) {
		this.pedidos.add(p);		
	}

	public void agregarRobot(Robot r) {
		this.robots[this.posicionRobot] = r;
		this.posicionRobot++;
	}

	public void agregarCajero(Cajero c) {
		this.cajeros[this.posicionCajero] = c;
		this.posicionCajero++;	
	}

}

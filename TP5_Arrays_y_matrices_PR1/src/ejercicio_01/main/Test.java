package ejercicio_01.main;

import ejercicio_01.clases.Cajero;
import ejercicio_01.clases.Pedido;
import ejercicio_01.clases.Robot;
import ejercicio_01.clases.Sistema;

public class Test {

	public static void main(String[] args) {
		
		Sistema s = new Sistema();

		Cajero c1 = new Cajero(0, "apellido0", 4);
		Cajero c2 = new Cajero(1, "apellido1", 4);
		Cajero c3 = new Cajero(2, "apellido2", 4);
		Cajero c4 = new Cajero(3, "apellido3", 4);
		Cajero c5 = new Cajero(4, "apellido4", 4);

		Robot r1 = new Robot("Robot1", 1);
		Robot r2 = new Robot("Robot2", 10);
		Robot r3 = new Robot("Robot3", 20);
		Robot r4 = new Robot("Robot4", 30);
		Robot r5 = new Robot("Robot5", 25);
		Robot r6 = new Robot("Robot6", 50);
		Robot r7 = new Robot("Robot7", 60);
		Robot r8 = new Robot("Robot8", 70);

		Pedido p1 = new Pedido("Cliente1", 1, "Robot1", 1000);
		Pedido p2 = new Pedido("Cliente2", 1, "Robot2", 1000);
		Pedido p3 = new Pedido("Cliente3", 1, "Robot3", 1000);
		Pedido p4 = new Pedido("Cliente3", 3, "Robot5", 1000);
		Pedido p5 = new Pedido("Cliente3", 1, "Robot8", 1000);

		s.agregarCajero(c1);
		s.agregarCajero(c2);
		s.agregarCajero(c3);
		s.agregarCajero(c4);
		s.agregarCajero(c5);

		s.agregarRobot(r1);
		s.agregarRobot(r2);
		s.agregarRobot(r3);
		s.agregarRobot(r4);
		s.agregarRobot(r5);
		s.agregarRobot(r6);
		s.agregarRobot(r7);
		s.agregarRobot(r8);

		s.agregarPedido(p1); 
		s.agregarPedido(p2);
		s.agregarPedido(p3);
		s.agregarPedido(p4);
		s.agregarPedido(p5);
		
		System.out.println(s.montosPorCajero());
		s.mostrarMontosPorCajero();
		System.out.println();
		System.out.println(s.informeDePedidos());
		System.out.println();
		s.mostrarPedidosConMasRiesgo();
		
		

	}

}

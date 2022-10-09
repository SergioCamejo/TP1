package ejercicio_01.main;

import ejercicio_01.clases.Asalariado;
import ejercicio_01.clases.Empleado;
import ejercicio_01.clases.Subcontratado;
import ejercicio_01.clases.Vendedor;

public class Test {

	public static void main(String[] args) {
		
		Empleado e1 = new Asalariado("Jose", 30, 10000);
		Empleado e2 = new Subcontratado("Carlos", 23, 50, 100);
		Empleado e3 = new Vendedor("Pedro", 25, 100, 200, 5);
		Empleado e4 = new Vendedor("Maria", 30, 100, 200, 10);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);

	}

}

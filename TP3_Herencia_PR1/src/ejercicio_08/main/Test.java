package ejercicio_08.main;

import ejercicio_08.clases.Empresa;
import ejercicio_08.clases.PersonalAComision;
import ejercicio_08.clases.PersonalAsalariado;

public class Test {

	public static void main(String[] args) {
		
		Empresa e = new Empresa();
		
		e.agregarEmpleado(new PersonalAsalariado("11111111", "Carlos", "Gomez", 2008, 45000));
		e.agregarEmpleado(new PersonalAComision("22222222", "Juan", "Lopez", 1997, 4, 3577));
		e.agregarEmpleado(new PersonalAComision("33333333", "Maria", "Gimenez", 2018, 23, 337));
		e.agregarEmpleado(new PersonalAComision("44444444", "Sergio", "Camejo", 2016, 163, 459));
		e.agregarEmpleado(new PersonalAComision("55555555", "Lourdes", "Galeano", 2012, 16, 2365));
		e.agregarEmpleado(new PersonalAsalariado("66666666", "Daniel", "Fernandez", 2003, 160000));
		e.agregarEmpleado(new PersonalAsalariado("77777777", "Juana", "Estevez", 2011, 165000));
		
		e.mostrarSalarios();

	}

}
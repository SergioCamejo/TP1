package menu.main;

import java.util.Scanner;

import menu.clases.Menu;
import menu.clases.OpcionAccesoAMenu;

public class Test {
	
	final static Scanner input = new Scanner(System.in);
	
public static void main(String[] args) {
	
		
		Menu mp = new Menu("Menú Principal", input);
		Menu ms= new Menu("Submenú 1", input);
		Menu mt = new Menu("Submenú del Submenú 1", input); 
		
		OpcionAccesoAMenu op1 = new OpcionAccesoAMenu("Opción 1", '1', null);
		OpcionAccesoAMenu op2 = new OpcionAccesoAMenu("Opción 2", '2', null);
		OpcionAccesoAMenu opS1 = new OpcionAccesoAMenu("Opción S1", '1', null);
		OpcionAccesoAMenu op3 = new OpcionAccesoAMenu("Acceso a Submenú 1", '3', ms);
		OpcionAccesoAMenu op4 = new OpcionAccesoAMenu("Opción 4", '4', null);
		OpcionAccesoAMenu opS2 = new OpcionAccesoAMenu("Acceso a Submenú 2", '2', mt);
		OpcionAccesoAMenu opT1 = new OpcionAccesoAMenu("Opción 1", '1', null);		
		
		mp.registar(op1);
		mp.registar(op2);
		mp.registar(op3);
		ms.registar(opS1);
		ms.registar(opS2);
		mp.registar(op4);
		mt.registar(opT1);
			
		mp.ejecutar();
		
		input.close();
	}

}

package ar.edu.unju.fi.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese el tipo de empleado");
		System.out.println("1- repositor  2- cajero  3- supervisor");
		
		Integer opc = scanner.nextInt();
		
		System.out.println("la opcion elegida es: "+ opc);
		
		scanner.close();
		
		// ejemplo simple de uso de Scanner para el ingreso de datos por consola

	}

}

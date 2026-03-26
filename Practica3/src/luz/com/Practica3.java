package luz.com;

import java.util.Scanner;

public class Practica3 {

	public static void main(String[] args) {
		
		/*
		 * COSAS QUE DEBES USAR 
		 * Variables
		 * Scanner
		 * Tipos de datos: int
		 * Operadores Aritmeticos: -
		 * String format
		 * Sout
		 * 
		 EJERCICIO
		 Crea un programa que pida al ausuario :
		 1. Su año de nacimiento
		 2. El año actual
		 El programa debe calcular cuantos años tiene actualmente
		 
		 RESULTADO
		 "Ud. tiene : 30 años"
		 */
		Scanner scnr = new Scanner(System.in);
		
		int anioNacimiento;
		int anioActual;
		int edad;
		 
		System.out.print("Ingrese su año de nacimiento: ");
		anioNacimiento = scnr.nextInt();
		
		System.out.print("Ingrese su edad actual: ");
		anioActual = scnr.nextInt();
		
		edad = anioActual - anioNacimiento;
		System.out.println("Luz Atamari");
		System.out.println("Ud tiene: " + edad + "años");
		String mensaje = String.format("Ud tiene %d años ",edad);
		System.out.println(mensaje);
		
		
		
	}

}
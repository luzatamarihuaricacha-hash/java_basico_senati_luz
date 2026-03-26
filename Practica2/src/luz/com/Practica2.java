package luz.com;

import java.util.Scanner;

public class Practica2 {

	public static void main(String[] args) {
		/*
		 ## Cosas que debes usar
		 # Variables
		 # Scanner
		 # Tipo de dato double
		 # Operadores Aritmeticos (+ , /)
		 # Sout
		 ## EJERCICIO
		 # Crear un programa que pida al usuario
		 3 notas.
		 
		 El programa debe calcular el promedio final.
		 
		 ##RESULTADO
		 "El promedio final es: 12"
		 */

		//Luz Atamari:
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("Ingrese la primera nota: ");
		double nota1 = scnr.nextDouble();
		System.out.print("Ingrese la segunda nota: ");
		double nota2 = scnr.nextDouble();
		System.out.print("Ingrese la tercera nota: ");
		double nota3 = scnr.nextDouble();
		
		//Promedio
		double promedio = (nota1 + nota2 + nota3) / 3;
		System.out.println("Luz Atamari" );
		System.out.println("El promedio final es: " + promedio);
		
		String respuesta2 = String.format("El promedio final es: %.2f  ",promedio);
		System.out.println(respuesta2);
		
		int edad = 15;
		String nombre = "Luz";
		double sueldo = 3000;
		
		String mensaje = String.format(
				"El empleado %s de edad %d desea ganar %.2f dolares."
				,
				nombre, edad, sueldo
				);
		
		System.out.println(mensaje);		
	}

}

package luz.com;

import java.util.Scanner;

public class Practica4 {

	public static void main(String[] args) {
		/*
		 COSAS QUE DEBES USAR 
		 - Variables
		 - Scanner
		 - Tipo de datos:double , int
		 - Constante : (final) - parala almacenar el igv
		 - Operadores Aritmeticos (+, -, *, /)
		 - sout
		 - String.format
		 EJERCICIO
		 Crea un programa que pida al usuario:
		 1. El precio total
		 2. La cantidad de productos:
		 
		 - Calcular el total (precio * cantidad)
		 - Calcular el IGV (Total/ 1.18)
		 - Calcular l precio total sin el IGV (Total - IGV)
		 RESULTADO
		 - "Precio sin IGV: 90 | IGV : 10 | precio total: 100"
		 
		 */
		Scanner scnr = new Scanner(System.in);
		
		double precio;
		int cantidad;
		double totalPagar;
		double totalIgv;
		double subtotal;
		final double igv = 0.18;
		
		System.out.print("Por favor ingrese el precio: ");
	    precio = scnr.nextDouble();
		System.out.print("Por favor ingrese la cantidad: ");
		cantidad = scnr.nextInt();
		
		totalPagar = precio * cantidad;
		totalIgv = totalPagar * igv;
		subtotal = totalPagar - totalIgv;
		
		System.out.println("============Luz Atamari=================");
		String mensaje = String.format("Precio sin IGV: %.2f | IGV 18 : %.2f | Precio total: %.2f"
				,
				subtotal,totalIgv,totalPagar);
		System.out.println(mensaje);
		

	}

}

package luz.com;
//Luz Atamari
import java.util.Scanner;

public class EntradaSalidaConsola {

	
	public void ejemploScanner() {
		Scanner scanner = new Scanner(System.in);
		
		//Pedir datos de tipo String
		System.out.println("Por favor ingrese su nombre: ");
		String nombre = scanner.nextLine();
		
		//Pedir datos de tipo Int
		System.out.println("Por favor ingrese su edad: ");
		int edad = scanner.nextInt();
		
		//Pedir datos de tipo Double
		System.out.println("Por favor ingrese el precio: ");
		double precio = scanner.nextDouble();
		
		//Pedir datos de tipo Boolean
		System.out.println("Por favor ingrese una respuesta: ");
		boolean respuesta = scanner.nextBoolean();
		
		System.out.println("Datos Ingresados");
		System.out.println("Nombre: " + nombre );
		System.out.println("Edad: " + edad );
		System.out.println("Precio: " + precio );
		System.out.println("Respuesta: " + respuesta );
		
		scanner.close();
	}
	
	public void ejemploSalidaDatos() {
		//Inprime un texto y añade un salto de linea (println)
		System.out.println("Hola, Luz");
		
		//Inprime un texto sin añadir un salto de linea (print)
		System.out.print("Hola, Luz");
		
		//Inprime un texto formateado similar a f-string de python
		//String 
		System.out.printf("Hola, %s","Luz");
		
		
		//Int
		System.out.printf("El numero es:  %d", 20);
		
		//Double
		System.out.printf("El precio es: %f",56.99);
		
		//Double
		System.out.printf("El valor de PI es: %.2f",3.1416);
		
		//Boolean
		System.out.printf("El valor es: %b",true);
		
		//Salto de linea
		System.out.printf("Linea 1 %n Linea 2 ");
		
		//Imprimir varias variables en un print
		String nombre = "Luz";
		int edad = 18;
		double sueldo = 4000;
		//Salto de linea
		
		System.out.printf("%n Me llamo %s, %n tengo %d años %n y voy a ganar %.2f %n", nombre, edad, sueldo);
	}
	
	
	
	
	
	public static void main(String[] args) {
		EntradaSalidaConsola esc = new EntradaSalidaConsola();
		esc.ejemploScanner(); 
		esc.ejemploSalidaDatos();
		
	

	}

}

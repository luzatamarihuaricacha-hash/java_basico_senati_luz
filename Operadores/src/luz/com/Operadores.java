package luz.com;

public class Operadores {
	
	public void operadoresAritmeticos() {
		int numero1 = 50;
		int numero2 = 50;
		System.out.println("========Operadores Aritmeticos");
		//Suma
		int respuestaSuma = numero1 + numero2;
		System.out.println(respuestaSuma);
		//Resta
		int respuestaResta = numero1 - numero2;
		System.out.println(respuestaResta);
		
		//Suma Multiplicacion
		int respuestaMultiplicacion = numero1 * numero2;
		System.out.println(respuestaMultiplicacion);
		
		//Divicion
		int respuestaDivision = numero1 / numero2;
		System.out.println(respuestaDivision);
		
		//Modulo
		int respuestaModulo = numero1 % numero2;
		System.out.println(respuestaModulo);
	}
	public void operadoresRelacionales() {
		int numero1 = 10;
		int numero2 = 20;
		System.out.println("========Operadores Relacionales");
		//igual a ==
		System.out.println(numero1 == numero2); //false
		
		//Diferente a !=
		System.out.println(numero1 != numero2);  //true
		
		//Mayor que >
		System.out.println(numero1 > numero2);  //false
		
		//Menor que <
		System.out.println(numero1 < numero2);  //true

		//Mayor o igual que >=
		System.out.println(numero1 >= numero2);  //false
		
		//Menor o igual que <=
		System.out.println(numero1 <= numero2);  //true
	}

	public void operadoresLogicos () {
		boolean v = true;
		boolean f = false;
		//and (y) &&
		System.out.println("========Operadores logicos");
		System.out.println("================&&");
		System.out.println(v && v); //true
		System.out.println(v && f); //false
		System.out.println(f && v); //false
		System.out.println(f && f); //false
		
		// or (o) ||
		System.out.println("================||");
		System.out.println(v || v); //true
		System.out.println(v || f); //true
		System.out.println(f || v); //true
		System.out.println(f || f); //false
		
		//not (negacion) !
		System.out.println("================!!");
		System.out.println(!v); //false
		System.out.println(!f); //true
		
	}
	public void operadoresAsignacion() {
		//Asignacion Simple (=)
		int alumnos = 10;
		
		//Suma y Asignacion (+=)
		alumnos += 5;
		
		//Resta y Asignacion (-=)
		alumnos -= 5;
		System.out.println("============================Operadores de Asignacion");
		System.out.println(alumnos);
		
	}
	public void operadoresIncrementoDecremento() {
		int contador = 4 + 10;
		System.out.println("========Operadores Incremento Decremento");
		// Incremento (++) incrementa de uno en uno
		contador++ ;
		System.out.println("======================++");
		System.out.println(contador);
		
		//Decremento (--) disminuye de uno en uno
		contador--;
		System.out.println("======================--");
		System.out.println(contador);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operadores op = new Operadores();
		op.operadoresAritmeticos();
		op.operadoresRelacionales();
		op.operadoresLogicos();
		op.operadoresAsignacion();
		op.operadoresIncrementoDecremento();
		

	}

}

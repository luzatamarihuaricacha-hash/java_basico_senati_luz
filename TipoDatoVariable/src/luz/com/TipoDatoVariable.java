package luz.com;

public class TipoDatoVariable {

	
	public void tipoDatoPrimitivo() {
		//Tipos de datos enteros 
		byte edad = 25;  //-128 a 127
		int poblacion = 1000000;  // -32768 a 32767
		short temperatura = -200;  // a 4 Cifras
		long poblacionMundial = 78000000000L;
		
		//Tipos de datos con Punto Flotante 
		float precio = 99.99f;
		double pi =3.1416;
		
		//Tipo de dato CHAR
		//Almacena un unico caracter
		char letra = 'D';
		char comillaDoble = '"';
		
		//Tipo de dato Booleano 
		boolean esActivo = true;
		
		//Imprimiendo Datos
		System.out.println(edad);
		System.out.println(poblacion);
		System.out.println(pi);
		System.out.println(letra);
		System.out.println(esActivo);
	}
	
	public void tipoDatoReferencia() {
		//Tippo de dato String
		//Forma 1
		String nombre = "Luz";
		
		//Forma 2 Instanciando
		String nombre2 = new String("Madely");
		
		//Imprimiendo Variables
		System.out.println(nombre);
		System.out.println(nombre2);
		
		
	}
	public static void main(String[] args) {
		 // Instanciar o incocar un objeto
		TipoDatoVariable tdv = new TipoDatoVariable();
		tdv.tipoDatoPrimitivo();
		tdv.tipoDatoReferencia();
		//TipoDatoVariable tdr = new TipoDatoVariable();
		//tdr.tipoDatoPrimitivo();
	}

}

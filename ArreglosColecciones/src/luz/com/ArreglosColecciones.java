package luz.com;
//Luz Atamari
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArreglosColecciones {
	
	
	public void arraySimple() {
		
		int[] numeros = {1,2,30,40,50,60,100};
		String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves","Viernes", "Sabado", "Domingo"};
		//Imprimir un numero segun el indice 
		System.out.println(numeros[6]);
		System.out.println(dias[2]);
		
		//Modificar un elemento 
		numeros[0] = 10;
		numeros[1] = 20;
		
		//Contar la cantidas de elementos que tiene un array
		int cantidad = numeros.length;
		System.out.println(cantidad);
		
		//Iteara los dos arrays
		
        for(int numero:numeros) {
        	System.out.println("Numero" + numero);
        }
        //for
        for(int i = 0; i < dias.length ; i ++) {
        	System.out.println("Dias: " + dias[i]); 
        }
	}
	
	public void arrayList() {
		ArrayList<String> frutas = new ArrayList<>();
		
		//Agregar datos o elementos
		frutas.add("Manzanas");
		frutas.add("Pera");
		frutas.add("Naranja");
		frutas.add("Uva");
		
		//Agregar un elemento segun el indice 
		frutas.add(2,"Granadilla");
		
		//Acceder a elementos 
		String primeraFruta = frutas.get(0);
		System.out.println("primeraFruta: " + primeraFruta);
		
		//Modificar elemetos
		frutas.set(4,"Pepino");
		
		//Eliminar Elemento
		frutas.remove(3);
		
		//Verificar si contiene un elemeto
		boolean contieneNaranja = frutas.contains("Naranaj");
		System.out.println("Existe la palabra Naranja: " + contieneNaranja);
		
		//Tamaño 
		int tamanio = frutas.size();
		System.out.println("El tamaño es: " + tamanio );
		
		//Para validar si esta vacio 
		boolean estaVacia = frutas.isEmpty();
		System.out.println("El array esta vacia: " + estaVacia);
		
		//Limpiar todolos elementos 
		frutas.clear();
		
	}
	
	public void hashMap() {
		HashMap<String, String> capitales = new HashMap <>();
		
		//Agregar elementos a mi HashMap 
		capitales.put("Peru", "Lima");
		capitales.put("España", "Madrid");
		capitales.put("Bolivia", "La Paz");
		capitales.put("Chile", "Arica");
		//Acceder a un elemeto 
		String capitalPeru = capitales.get("Peru");
		System.out.println(capitalPeru);
		
		//Quitar un elemento
		capitales.remove("Bolivia");
		
		//Validar si existe una KEY
		boolean existeMexico = capitales.containsKey("Mexico");
		System.out.println("Existe Mexico: " + existeMexico);
		
		//Modificar elementos
		capitales.replace("Chile", "Santiago");
		
		//Bucles en HashMaop
		//Iterar Keys 
		for(String pais : capitales.keySet()) {
			System.out.println("Pais: " + pais);
		}
		
		//Iterar values
		for(String capital : capitales.values()) {
			System.out.println("Capital: " + capital);
		}
		
		//Iterar keys and values
		for(Map.Entry<String, String> paisCapital : capitales.entrySet()) {
			System.out.println("Pais: " + paisCapital.getKey() + " - Capital: " + paisCapital.getValue());
			
			
		}
	}
	
	

	public static void main(String[] args) {
		ArreglosColecciones ac = new ArreglosColecciones();
		ac.arraySimple();	
		ac.arrayList();
		ac.hashMap();
	}

}

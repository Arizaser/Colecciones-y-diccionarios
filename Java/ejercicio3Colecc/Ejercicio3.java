package ejercicio3Colecc;
import java.util.*;
import utiles.*;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y
 * almacenados en un objeto de la clase ArrayList.
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
		
		System.out.println("Introduce 10 numeros enteros");
		for (int i = 0; i < 10; i++) {
			listaNumeros.add(Teclado.leerEntero());
			
		}
		
		System.out.println("Numeros sin ordenar: " + listaNumeros);
		
		//Ordenamos con el metodo sort de Collections
		Collections.sort(listaNumeros);
		System.out.println("Numeros ordenados: "+ listaNumeros);
		

	}

}

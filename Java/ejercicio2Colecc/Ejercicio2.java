package ejercicio2Colecc;

import java.util.*;

/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de
 * esos números. El tamaño de la lista también será aleatorio y podrá oscilar
 * entre 10 y 20 elementos ambos inclusive.
 * 
 */

public class Ejercicio2 {
	public static void main(String[] args) {
		ArrayList<Integer> arrayListAleatorio = new ArrayList<Integer>();
		int tamanno = (int)(Math.random() * (10 - 21) + 20);
		int max=0;
		int min=100;
		int suma = 0;
		
		for (int i = 0; i < tamanno; i++) {
			int numero=(int) (Math.random() * 100);
			arrayListAleatorio.add(numero);
			
		}
		System.out.println(arrayListAleatorio);
		
		for (Integer integer : arrayListAleatorio) {
			suma+=integer;
			
			if (integer < min) {
        min = integer;
      }else if (integer > max)  {
        max = integer;
      }
		}
		
		System.out.println("El numero mayor es= "+max);
		System.out.println("El numero menor es= "+min);	
		System.out.println("La suma de numeros es= "+suma);
		System.out.println("La media es= "+(suma/arrayListAleatorio.size()));
			
		}
		
	

}
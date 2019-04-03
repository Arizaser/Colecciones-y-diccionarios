package ejercicios11Colecc;

import java.util.*;

import utiles.Teclado;

/**
 * Realiza un programa que escoja al azar 5 palabras en español del
 * minidiccionario del ejercicio anterior. El programa irá pidiendo que el
 * usuario teclee la traducción al inglés de cada una de las palabras y
 * comprobará si son correctas. Al final, el programa deberá mostrar cuántas
 * respuestas son válidas y cuántas erróneas.
 */

public class Ejercicio11 {
	public static void main(String[] args) {
		HashMap<String, String> diccionarioIngles = new HashMap<String, String>();
		ArrayList<String> palabrasEspan = new ArrayList<String>();
		ArrayList<String> palabrasAlmacenadas = new ArrayList<String>();
		int cont = 0;
		int numero = 0;
		int indice = 0;

		diccionarioIngles.put("palabra", "word");
		diccionarioIngles.put("idioma", "language");
		diccionarioIngles.put("libro", "book");
		diccionarioIngles.put("puerta", "door");
		diccionarioIngles.put("ordenador", "computer");
		diccionarioIngles.put("pantalla", "scream");
		diccionarioIngles.put("tecla", "key");
		diccionarioIngles.put("gafas", "glasses");
		diccionarioIngles.put("diccionario", "dictionary");
		diccionarioIngles.put("escuela", "school");

		palabrasEspan.addAll(diccionarioIngles.keySet());

		for (int i = 0; i < 5; i++) {
			numero = (int) (Math.random() * 10);
			palabrasAlmacenadas.add(palabrasEspan.get(numero));
		}

		for (String palabra : palabrasAlmacenadas) {
			String pIntroducida = Teclado.leerCadena("Dime la traduccion de la palabra: " + palabra);

			if (pIntroducida.equals(diccionarioIngles.get(palabrasAlmacenadas.get(indice)))) {
				System.out.println("Correcto");
				cont++;
			} else {
				System.out.println("Respuesta incorrecta");
				System.out.println("La respuesta correcta es " + diccionarioIngles.get(palabrasAlmacenadas.get(indice))+"\n");
			}
			indice++;
		}

		System.out.println("Has acertado " + cont +"/"+"5 palabras");
	}
}

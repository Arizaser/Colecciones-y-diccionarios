package ejercicio10Colecc;

import utiles.*;
import java.util.*;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap
 * para almacenar las parejas de palabras. El programa pedirá una palabra en
 * español y dará la correspondiente traducción en inglés.
 */

public class Ejercicio10 {

	public static void main(String[] args) {
		HashMap<String, String> diccionarioIngles = new HashMap<String, String>();
		String palabra=Teclado.leerCadena("Dime la palabra en español");
		
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
		
		
		if (diccionarioIngles.containsKey(palabra)) {
			System.out.println(diccionarioIngles.get(palabra));
		}else {
			System.out.println("La palabra no esta en el diccionario. Adios");
			
	}
			
			
		
			
		
	}

}

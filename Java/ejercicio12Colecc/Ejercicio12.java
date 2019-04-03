package ejercicio12Colecc;
import java.util.*;


/**
 * Escribe un programa que genere una secuencia de 5 cartas de la baraja
 * española y que sume los puntos según el juego de la brisca. El valor de las
 * cartas se debe guardar en una estructura HashMap que debe contener parejas
 * (figura, valor), por ejemplo (“caballo”, 3). La secuencia de cartas debe ser
 * una estructura de la clase ArrayList que contiene objetos de la clase Carta.
 * El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo
 * → 3, rey → 4; el resto de cartas no vale nada. 
 * 
 * Ejemplo: 
 * as de oros 
 * cinco de bastos 
 * caballo de espadas 
 * sota de copas 
 * tres de oros 
 * Tienes 26 puntos
 */

public class Ejercicio12 {

	public static void main(String[] args) {
		HashMap<String, Integer> brisca = new HashMap<String, Integer>();
		ArrayList<Carta> mano = new ArrayList<Carta>();
		Carta carta = new Carta();
		int puntos= 0;

		brisca.put("AS", 11);
		brisca.put("TRES", 10);
		brisca.put("SOTA", 2);
		brisca.put("CABALLO", 3);
		brisca.put("REY", 4);
		brisca.put("DOS", 0);
		brisca.put("CUATRO", 0);
		brisca.put("CINCO", 0);
		brisca.put("SEIS", 0);
		brisca.put("SIETE", 0);
		
		for (int i = 0; i < 5; i++) {
			do {
				carta = new Carta();
			} while (mano.contains(carta));
			mano.add(carta);
		}

		for (Carta c : mano) {
			System.out.println(c);
			puntos+=brisca.get(c.getNumero());
		}
		
		System.out.println("\nHas conseguido " + puntos + " puntos");
		

		
	}

}

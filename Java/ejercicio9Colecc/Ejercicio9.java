package ejercicio9Colecc;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Modifica el programa anterior de tal forma que las cartas se muestren ordenadas. 
 * Primero se ordenarán por palo: bastos, copas, espadas, oros. Cuando coincida el 
 * palo, se ordenará por número: as, 2, 3, 4, 5, 6, 7, sota, caballo, rey.
 */

public class Ejercicio9 {

	public static void main(String[] args) {
		ArrayList<Carta> listaCartas = new ArrayList<Carta>();
		Carta carta = new Carta();

		// Genera las 10 cartas y las almacena en el ArrayList
		for (int i = 0; i < 10; i++) {

			do {
				carta = new Carta();
			} while (listaCartas.contains(carta));
			listaCartas.add(carta);
		}
		
		//ordena las cartas
		Collections.sort(listaCartas);
		
		for (Carta c : listaCartas) {
			System.out.println(c);
		}
	}

}
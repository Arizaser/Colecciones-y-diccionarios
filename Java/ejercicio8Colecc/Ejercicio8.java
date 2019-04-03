package ejercicio8Colecc;

import java.util.ArrayList;

import utiles.Teclado;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10
 * objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 */

public class Ejercicio8 {

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
		
		for (Carta c : listaCartas) {
			System.out.println(c);
		}
	}

}

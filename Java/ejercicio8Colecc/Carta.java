package ejercicio8Colecc;

import java.util.Arrays;

/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española (10
 * objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 */

public class Carta {
	public String[] numeros= {"UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "SOTA", "CABALLO", "REY"};
	public String[] palos= {"BASTOS", "COPAS", "ESPADAS", "OROS"};
	
	public String numero;
	public String palo;
	
	//Constructor le asigna un numero y un palo aleatorio
	public Carta() {
		this.numero = numeros[(int) (Math.random() * 10)];
		this.palo = palos[(int) (Math.random() * 4)];
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getPalo() {
		return palo;
	}



	public void setPalo(String palo) {
		this.palo = palo;
	}



	@Override
	public String toString() {
		return numero + " de " + palo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + Arrays.hashCode(numeros);
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		result = prime * result + Arrays.hashCode(palos);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (!Arrays.equals(numeros, other.numeros))
			return false;
		if (palo == null) {
			if (other.palo != null)
				return false;
		} else if (!palo.equals(other.palo))
			return false;
		if (!Arrays.equals(palos, other.palos))
			return false;
		return true;
	}

	
	
}

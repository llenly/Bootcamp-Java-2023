package Baraja;

import java.util.Objects;

public class Baraja {

	private int valor;
	private String palo;

	public Baraja(int valor, String palo) {
		this.valor = valor;
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Baraja)) {
			return false;
		}
		Baraja otraCarta = (Baraja) obj;
		return this.valor == otraCarta.valor && this.palo.equals(otraCarta.palo);
	}

	@Override
	public int hashCode() {
		return Objects.hash(valor, palo);
	}

	@Override
	public String toString() {
		if (valor == 10) {
			return "sota de " + palo;
		} else if (valor == 11) {
			return "caballo de " + palo;
		} else if (valor == 12) {
			return "rey de " + palo;
		} else {
			return valor + " de " + palo;
		}
	}
}
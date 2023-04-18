package Baraja;

import java.util.HashSet;

public class BarajaPrincipal {

	public static void main(String[] args) {
HashSet<Baraja> baraja = new HashSet<Baraja>();
		
		for (int valor = 1; valor <= 7; valor++) {
		    for (String palo : new String[]{"oros", "copas", "espadas", "bastos"}) {
		        baraja.add(new Baraja(valor, palo));
		    }
		}
		
		baraja.add(new Baraja(10, "oros"));
		baraja.add(new Baraja(11, "oros"));
		baraja.add(new Baraja(12, "oros"));

		baraja.add(new Baraja(10, "copas"));
		baraja.add(new Baraja(11, "copas"));
		baraja.add(new Baraja(12, "copas"));

		baraja.add(new Baraja(10, "espadas"));
		baraja.add(new Baraja(11, "espadas"));
		baraja.add(new Baraja(12, "espadas"));

		baraja.add(new Baraja(10, "bastos"));
		baraja.add(new Baraja(11, "bastos"));
		baraja.add(new Baraja(12, "bastos"));
		
		
		for (Baraja carta : baraja) {
		    System.out.println(carta);
		}

	}


	}



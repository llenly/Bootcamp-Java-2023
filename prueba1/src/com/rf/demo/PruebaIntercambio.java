package com.rf.demo;

public class PruebaIntercambio {

	public static void main(String[] args) {
		
		  Intercambio<String> names = new Intercambio<String>("Rosa", "Ismael");
		  Intercambio<Integer> number = new Intercambio<Integer>(1, 2);
		  
	        System.out.println("NOMBRES: \n1 - " + names.getUno() + "\n2 - " + names.getDos());
	        System.out.println("NUMEROS: \n uno = " + number.getUno() + "\ndos = " + number.getDos());

	        names.intercambiar();
            number.intercambiar();
            
	        System.out.println("\nINTERCAMBIO NOMBRES: \n1 - " + names.getUno() + "\n2 - " + names.getDos());
	        System.out.println("NUMEROS: \n uno = " + number.getUno() + "\ndos = " + number.getDos());
	}

}

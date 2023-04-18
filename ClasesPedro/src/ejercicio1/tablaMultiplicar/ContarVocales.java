package ejercicio1.tablaMultiplicar;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		// contar cantidad de vocales de una frase que pidas por pantalla
		
		
		System.out.println(" escribe una frase ");
		Scanner teclado = new Scanner(System.in);
		 String vocales =teclado.nextLine();
	
		 int contador = 0;
		 
		 for( int i = 0 ; i < vocales.length(); i++) {
			//
			char  cambio  = vocales.charAt(i);
			
			switch ( cambio ) {
			case 'a' : case 'e': case 'i': case 'o': case 'u': 
			      contador++;
			      break;
			
			}
				
			
		 }
	
		 System.out.println(contador); 
	}

}

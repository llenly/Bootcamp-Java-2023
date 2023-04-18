package recursividad;

import java.util.Scanner;

public class FraseInvertidaRecursividad {

	public static void main(String[] args) {
// TODO Auto-generated method stub

String frase = " esto es una frase que voy a invertir ";
	
System.out.println(FraseInvertRecursv(frase, frase.length()-1));			

	  }
	
	public static String FraseInvertRecursv(String fraseInvertida, int longitudFrase) {
//
//		int j = 0;
//		j = frase.charAt(j);
//    	System.out.println(frase.charAt(j));
//    	
//    	
   
//		for (int i = longitudFrase - 1; i >= 0; i--) {
//			// fraseInvertida = fraseInvertida + frase.charAt(i);
//			fraseInvertida += frase.charAt(i);
//		}
//		System.out.println(" mi frase invertida es : " + fraseInvertida);

		if (longitudFrase == 0) {

// este return da error por que tiene que devolver un charAt y lo parseo de caracter a string añadiendo "", vacias  
			return fraseInvertida.charAt(longitudFrase)+ "";
		}else {
			return fraseInvertida.charAt(longitudFrase)+FraseInvertRecursv(fraseInvertida,longitudFrase -1);
		}

	}

 
}
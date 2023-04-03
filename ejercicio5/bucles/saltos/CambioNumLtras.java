package ejercicio5.bucles.saltos;

import java.util.Scanner;

public class CambioNumLtras {

	public static void main(String[] args) {
// Hacer una clase que convierta de números a letras, definiendo num=72.
//Podéis hacer una primera version en donde los números del 11 al 15 salgan como diez y uno, diez y dos….
//y una segunda version corregida

		int numero = 72;
		int unidades, decenas;
// VERSION CON ARRAY ,NUM 88
		int num = 88;
		String[] arrayUnid = { "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez",
				"once", "doce", "trece", "catorce", "quince" };

		String[] arrayDec = { "diez", "veinte", "treinta", "cuarenta", "cincuenta", "sesenta", "setenta", "ochenta",
				"noventa" };

// saco la unidad , o sea el primer numero del resto de el entre 10
		unidades = numero % 10;
		decenas = numero / 10;

		switch (decenas) {
		case 0:
			System.out.println("");
			break;
		case 1:
			System.out.println("diez");
			break;
		case 2:
			System.out.println("veinte");
			break;
		case 3:
			System.out.println("treinta");
			break;
		case 4:
			System.out.println("cuarenta");
			break;
		case 5:
			System.out.println("cincuenta");
			break;
		case 6:
			System.out.println("sesenta");
			break;
		case 07:
			System.out.println("setenta");
			break;
		case 8:
			System.out.println("ochenta");
			break;
		case 9:
			System.out.println("noventa");
			break;
		}
// añadir y 
		System.out.println(" y ");
		switch (unidades) {
		case 0:
			System.out.println("");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		case 4:
			System.out.println("cuatro");
			break;
		case 5:
			System.out.println("cinco");
			break;
		case 6:
			System.out.println("seis");
			break;
		case 07:
			System.out.println("siete");
			break;
		case 8:
			System.out.println("ocho");
			break;
		case 9:
			System.out.println("nueve");
			break;

		}
// VERSION CON ARRAY 

		unidades = num % 10;
		decenas = num / 10;

		if (num > 0 && num < 16) {
			System.out.println(" el numero es  " + arrayUnid[num - 1]);
		} else {
			System.out.println(" el numero es " + arrayDec[decenas - 1] + " y " + arrayUnid[unidades - 1]);
		}

// PIDIENDO EL NUMERO POR CONSOLA
		System.out.println("ingresa un numero ");
		Scanner teclado = new Scanner(System.in);
		int number = teclado.nextInt();
		teclado.nextLine();
		

		unidades = number % 10;
		decenas = number / 10;

		if (number > 0 && number < 16) {
			System.out.println(" el numero es  " + arrayUnid[num - 1]);
		} else {
			System.out.println(" el numero es " + arrayDec[decenas - 1] + " y " + arrayUnid[unidades - 1]);
		}

	}

}

package ProgramacionOrientadaObjt;

import java.util.ArrayList;
import java.util.Scanner;

import Colecciones.Lista;

public class SumaMediaAritmetica {

	public static void main(String[] args) {

		ArrayList<Integer> resultLista = new ArrayList<Integer>();

		leerValores(resultLista);
		int resulSuma = calcularSuma(resultLista);
		mostrarResult(resultLista, resulSuma);

	}

	public static void leerValores(ArrayList<Integer> lista) {

		boolean seguir = true;
		Scanner teclado = new Scanner(System.in);

		while (seguir) {
			System.out.println("mete un numero ");

			String aux = teclado.nextLine();

			if (comprobarEntero(aux)) {
				int numero = Integer.parseInt(aux);
				if (numero != -99) {
					lista.add(numero);
				} else {
					seguir = false;
				}
			}
		}
		teclado.close();

	}

	public static int calcularSuma(ArrayList<Integer> lista) {
//		 for(int i=0 ;i< lista.size(); i++) {
//		 suma+=lista.get(i);
//	 }

		// foreach
		int suma = 0;
		for (int aux : lista) {
			suma = suma + aux;
		}

		return suma;

	}

	public static void mostrarResult(ArrayList<Integer> lista, int suma) {
		int contador = 0;
		double media = (double)suma / (double)lista.size();

		// sacar el mayor de los numeros metidos
		for (int aux : lista) {

			if (aux > media) {
				contador++;
			}

		}
		System.out.println(" la suma es " + suma);
		System.out.println(" la media es " + media);
		System.out.println(" hay " + contador + " numeros mayores");

	}

//	cuando usamos escanerr y recivamos enteros , si el usaurio escribe una leta con esta execpcion lo capturamos 
//	comprobar el dato por teclado es entero o no , o sea no lleve letras y solo numeros 
	public static boolean comprobarEntero(String esEntero) {
		try {
			int aux = Integer.parseInt(esEntero);
			return true;

		} catch (NumberFormatException e) {
			return false;
		}

	}

}

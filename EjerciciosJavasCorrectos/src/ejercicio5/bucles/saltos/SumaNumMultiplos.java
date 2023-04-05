package ejercicio5.bucles.saltos;

import java.util.Scanner;

public class SumaNumMultiplos {

	public static void main(String[] args) {
// Calcular la suma de los primeros 10 números múltiplos de 5
//Los múltiplos de un número es el resultado de multiplicar dicho número por la secuencia de números enteros.	
		
		System.out.println("ingrese un numero , calcularemos la suma de sus 10 primero multiplos ");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado .nextInt();

		int total = 0;
		int contador = numero;
		int indice = 0;
		int sumar =0;
		int multiplo = 0; 
		
		while(contador > 0) {
			if( ++ indice % numero == 0) {
				--contador;
				total += indice;
				System.out.println(" el indice es :" + indice);
			}
		}
		
		System.out.println(" el total es :" + total);

		for ( int i = 1; i <= numero ; i++) {
			
		//	System.out.println(i + " esto es el indice  ");
		//	System.out.println(multiplo + " esto es multiplo ");
			
//el multiplo seria multiplicar cada indice por el numero	
			
			 multiplo = i * numero;
			 //	sumar += i * numero;
			 System.out.println(" los multiplo del numero introducido" + numero + " es : " + multiplo );	
			//sumar = sumar + multiplo 
	        sumar += multiplo;
			
		}
		
		System.out.println(" la suma de  los multiplo de : "+ numero+ " es : " + sumar );
	}

	
}

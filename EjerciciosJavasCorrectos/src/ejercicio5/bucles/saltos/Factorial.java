package ejercicio5.bucles.saltos;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
// Calcular el factorial del numero 8.
//El factorial de un número es el producto  de los número anteriores o igual a dicho número.
		int num = 8;
		int numero = 8;
		int factorial = 1;
		
		while(numero != 0) {
			System.out.println(numero);
			factorial = factorial * numero;
			numero--;
			
		}
		
		System.out.println(" el factorial de 8 es = " + factorial);
		
		
		 factorial= 1;
		 for (int i = num; i > 0 ; i--){
			 
			 factorial = factorial * i;
			 
		 }
			 
		 System.out.println("El factorial de " + num + " es: " + factorial);
		 
// otra manera de alante hacia atras  con el ++, mientras que i menor o igual  que 8 ,el bucle se va a ejecutar   

		 factorial= 1;
		 for (int i = 1; i <= num  ; i++){
			 
			 factorial = factorial * i;
			 System.out.println(" i = "+ i); 
			 System.out.println(" factorial " + factorial);
			 
		 }
		
		 System.out.println("El factorial de " + num + " es: " + factorial);
		 
		
		 
		 
	}

}

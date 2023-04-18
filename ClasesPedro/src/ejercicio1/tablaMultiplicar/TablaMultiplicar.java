package ejercicio1.tablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// crear una tabla de multilicar de un num 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" introduce un numero del 1 al 10");
		  int numero = teclado.nextInt();
		  
		  System.out.println("tabla de multiplicar de :" + numero);
		  
		  for(int i =1; i<= 20 ; i++) {
			  System.out.println(numero + " x " + i + " = " +  numero * i);
		  }
		
		
	
	}
}

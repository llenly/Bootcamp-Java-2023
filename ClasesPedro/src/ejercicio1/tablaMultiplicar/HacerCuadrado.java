package ejercicio1.tablaMultiplicar;

import java.util.Scanner;

public class HacerCuadrado {

	public static void main(String[] args) {
// dado un numero pedido por pantalla dibuja un cuadrado de lados numero
		
		System.out.println("ingresa el lado del cuadrado o un numero ");
		 Scanner teclado = new Scanner(System.in);
		  int numero = teclado.nextInt();
		   teclado.nextLine();
		   
		   //hacer un for para recorrer las filas 
		    for(int i = 0; i < numero; i++) {
		    	// hacemos un segundo for para recorrer las coli¡umn
		    	for(int j = 0; j < numero; j++) {
		    		System.out.print("* ");
		    		
		    	}
		    	
		    	System.out.println();
		    }
		 

	}

}

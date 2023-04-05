package ejercicio5.bucles.saltos;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		// Dibuja un cuadrado, como en la imagen que acompaña, con ocho * de lado:
		
		System.out.println("ingresa un numero para dibujar un cuadrado");
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		teclado.nextLine();
		
		// primero se hacer for para recorrer las filas 
		  for (int i = 0; i < numero ; i++) {
			  //luego otro for para recorrer las columnas 
                 for (int j = 0; j < numero; j++) {
                	 //imprimimo * por cada iteracion sin el ln para que me imprima sin salto de linea
                	 System.out.print(" * ");
                	 
                 }
                 System.out.println();
	        }
	}

}

package recursividad;

import java.util.Scanner;

public class SumaNumRcursivo {

	public static void main(String[] args) {
		// suma de los n primeros numero enteros 
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" ingrese un numero ");
		int numero = teclado.nextInt();
		teclado.nextLine();

		System.out.println(" la suma de los n primeros de "+  numero + " es :" + RecursvSumaNum(numero));
	}

	
	// aqui va el metodo 
	public static int RecursvSumaNum( int numero) {
		if(numero == 0 ) {
			
			return numero; 
			
		}else {
			
			
			return numero + RecursvSumaNum(numero - 1 );
		}
		
		
	}
}

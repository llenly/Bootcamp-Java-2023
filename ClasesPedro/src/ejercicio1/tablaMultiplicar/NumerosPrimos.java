package ejercicio1.tablaMultiplicar;

import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
// Calcular cuantos números primos hay entre 1 y 100, y cuales son. 
// los numero primos son los que tienen dos divisores distintos positivos ,1 y el mismo 
// no se comprueba 1 por que no es primo solo es divisible una ves

		// int numero = 100;
        
	
		System.out.println(" escribe un numero ");

		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		teclado.nextLine();
		
	if ( esPrimo(numero)) {
	 	  System.out.println(" es primo ");
	    	}
   
	
    	}

// esto es con un metodo 
	
	public static boolean esPrimo(int numero) {
		for (int i = 2; i < numero / 2; i++) {
			// cuando el resto del numero es cero , es no es primo por que se divide entre mas de 1 y el 
			System.out.println(" i es = " + i);
             if ( numero % i == 0) {
            	 System.out.println(" numero " +numero);
            	 return false;
             }
		}
		
		return true ;
	}
}

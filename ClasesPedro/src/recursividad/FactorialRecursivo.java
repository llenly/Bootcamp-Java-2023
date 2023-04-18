package recursividad;

import java.util.Scanner;

public class FactorialRecursivo {

	public static void main(String[] args) {
		// sacar el factorial de un numero con funcion recursiva 
		
// pedir numero por pantalla
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int numero = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("el factorial del numero es :" + FactRecursv(numero));

	}

	//el metodo o la funcion hay que creala fuera del main 
	
	public static  int FactRecursv( int numero) {
// hay que poner el caso base que para la ejecucion y devuelve un resultado que seria el factorial del numero 
		
		
		if(numero == 1) {
//tiene que retornar el utlimo valor para que empiece la funcion 
			return numero;
			
		}else {
// se hace la llamada recursiva , tiene que llamar al numero para multiplicarlo por cada numero antes d de el (accedo al numero anterior restando el numero -1
			
	        //numero 5 * 5-1=4, compruebo 4 == 1 / no ,
			//numero 4 * 4-1=3, compruebo 3 == 1 / no ,
			//numero 3 * 3-1=2, compruebo 2 == 1 / no ,
			//numero 2 * 2-1=1, compruebo 1 == 1 / si ,
			//lo primero se ejecuta es FactRecursv(numero-1) por que numero no es == 1 
			return numero * FactRecursv(numero-1);
		}
		
	}
	
	
	
}

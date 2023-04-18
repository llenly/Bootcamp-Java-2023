package ejercicio1.tablaMultiplicar;

import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// pedir numeros por pantalla , hasta que escriban menos 1 , sumar todos los
		// numeros ingresados por pantalla

		int suma = 0;
		int numero = 0;
		int mayor = 0;
		int contador = 0;
		int menor = 1000;

		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println(" escribe numero por pantalla ");
			numero = teclado.nextInt();
			// la operacion se hace mienyras que numero sea distinto de -1

			if (numero != -1) {
				suma = suma + numero;
				if (contador == 0) {
					menor = numero;
				} else if (numero < menor) {
					menor = numero;
				}
				contador++;
			}
			
//			if (numero != -1) {
//				suma = suma + numero;
//				if (numero < menor) {
//					menor = numero;
//				}if (numero > mayor) {
//					mayor = numero;
//				}
//				contador++;
//			}
			
			
			

		} while (numero != -1);

//	    
		System.out.println(" la suma es  " + suma);
		System.out.println("cont " + contador);
		System.out.println("menor " + menor);

		// solo con el while

//	   Scanner teclado1 =  new Scanner(System.in);
//	      // int num = teclado1.nextInt();
//	      //  teclado1.nextLine();
//	           
//   	  
//   	    
//   	 System.out.println(" escribe otro numero por pantalla ");
//        	int num = teclado1.nextInt();
//   	 
//        	  int sumar = 0;  int cont = 0; 
//        	  
//	   while(num !=-1) {
//		   
//		   cont ++;
//		   System.out.println(" escribe otro numero por pantalla ");
//		   num = teclado1.nextInt();
//		 
//		   sumar  = sumar  + num ;
//			       
//	        }
//	   
//	 //  System.out.println(" escribe numero por pantalla ");
//	   System.out.println(" la suma es  " + cont ); 
//	   System.out.println("cont " + cont); 

	}

}

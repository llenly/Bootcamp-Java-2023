package ejercicio1.tablaMultiplicar;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		//pide un numero por pantalla y compruebar desde ese num cuales son pares y cuales son impares
		
//		System.out.println("ingresa un numero ");
//	       
//		Scanner teclado3 = new Scanner(System.in);
//		int number = teclado3.nextInt();
//		teclado3.nextLine();
//			 
//		int i = 1;
//		while (i <= number) {
//			if(i % 2 == 0) {
//				  System.out.println( "ES PAR\t" + i );	
//			}
//			i++;
//		}
//			
//		
//		System.out.println("ingresa un numero otra ves");
//       
//		Scanner teclado = new Scanner(System.in);
//		int numero = teclado.nextInt();
//		teclado.nextLine();
//		
//		int contador = 0;
//	//		for ( int j = 1; j <= numero; j++) {//			//comprobar el resto de el numero que se va iterar guardado en i 
//				 if ( j % 2 == 0 ) {
//					// contador++;
//					// j = contador;
//					//  System.out.println( "ES EL CONTADOR" +  contador );
//					  System.out.println( "ES PAR :" +  j );
//					  
//				 } else {
//					 
//					System.out.println( "ES IMPAR :" +  j );
//				 }
//				 //EL CONTADOR SACA LOS IMPARES
//				 contador++;
//				 
//				 
//				 //		}
//	     		
		System.out.println("ingresa un numero de nuevo ");	       
		Scanner teclado2 = new Scanner(System.in);
		int num = teclado2.nextInt();
		teclado2.nextLine();
		
          int cont= 1;
         
		 // tengo que hacer primero la condicion 
          if( num % 2 == 0 ) {
        	  // si es par solo imprimo los pares 
        	  for( int a =1; a <= num ; a ++) {
        		  if( a % 2 == 0 ) {
        			  System.out.println(" el numero es par " + a );
        			  
        		  }
        		  
        	  }
        	  
          }else {
        	  for( int a =1; a <= num ; a ++) {
        		  if( a % 2 == 1 ) {
        			  System.out.println(" el numero es impar " + a );
        			  
        		  }
        		  
        	  }
          }
		 
        	  
        	  
	
	   }
             
	}
	
	











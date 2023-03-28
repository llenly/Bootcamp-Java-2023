package com.rf.demo;

public class Ejercicio5 {

	public static void main(String[] args) {
//Cargar dos variables int  con los valores 10 y 20, e indicar cual es mayor, si son iguales, o si uno es múltiplo de otro.
//Para probar el programa, ir cargando distintos valores en las variables.
		
       
		int n1 = 15;
		int n2 = 20;
		
		if ( n1 == n2){
			System.out.println("los numero son iguales");
		}
		if (n1 > n2) {
			System.out.println( n1 + "es mayor que " + n2);
		}else {
			System.out.println( n2 + "es mayor que " + n1);
		}
		
		
		
			if(n1 % n2 ==0) {
				System.out.println( "son multiplos " );
			}else {
				System.out.println( "no son multiplos " );
			}
		
		
		
		
		
		int nota = 6;

        if( nota <= 4 ) {
            System.out.println("Insuficiente");
        }
        if( nota > 5 && nota < 6 ) {
            System.out.println("Suficiente");
        }
        if( nota >= 6 && nota <= 7 ) {
            System.out.println("Bien");
        }
        if( nota == 7 || nota == 8 ) {
            System.out.println("Notable");
        }
        if( nota == 9 || nota == 10 ) {
            System.out.println("Sobresaliente");
        }
        
        
   
        
        
        
	}

}
 
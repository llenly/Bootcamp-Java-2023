package com.ejerc.demo;

public class Datos2 {

	//VARIABLES INICIALIZADAS SACADAS DEL MAIN PARA QUE SEAN PUBLIC 
	//3 SACAR LAS VAR DEL MAIN PARA QUE SE VEAN PUBLIC	Y CAMBIAR LA MANERA DE LLAMARLAS EN LA CLASE2 , MAIN ES ESTATIC, NO PUEDE ACCEDER A LAS VAR A NO SER QUE SEAN STATIC	 
	
	 static int dia = 10;
	 static long nDni = 57433222;
	 static double precio = 0;
     static final boolean ACTIVO= true;
    
    
	public static void main(String[] args) {
		

		 
//  PARA ACCEDER A LAS VAR HAY QUE DECLARARLAS STATIC COMO EL METODO
		 precio =  (float)135.12;

//IMPRIMIR EN CONSOLA VAR		 
		 
		System.out.println( "dia\t" + dia + "\n ");
		System.out.println( "nDni\t" + nDni + "\n ");
		System.out.println( "precio\t" + precio + "\n ");
		System.out.println( "ACTIVO\t" + ACTIVO + "\n ");
		 

	}
	
//
	
}

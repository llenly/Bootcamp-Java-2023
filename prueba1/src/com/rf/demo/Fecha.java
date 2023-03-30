package com.rf.demo;

public class Fecha {

	public static void main(String[] args) {
		int dia = 20;
		int mes = 8;
		int año = 2015;
		boolean diasbien = false;
		
		if(dia >= 1 && dia <= 30) {
			System.out.println("La fecha es correcta");
			
		}
		if( mes >=1 && mes <= 12 ){
			System.out.println("El mes es correcto");
		}
			
		if(año != 0 ) {
			System.out.println("El año es correcto");
		
		}
		
		//version con dias reales 
		
		// if(mes >=1 && mes <= 12 ) {
		//	 if(año != 0) {
		//		 switch(mes) {
		//		
		//		 }
		//	 }
		// }
		
		
		
	 }

 }

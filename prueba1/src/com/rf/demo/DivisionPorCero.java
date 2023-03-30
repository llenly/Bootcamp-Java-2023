package com.rf.demo;

public class DivisionPorCero {

	public static void main(String[] args) {
		// captura de errores 
		
		int a = 0;
		int b = 300;
		int c;
		
		try {
			c = b/a;
	         System.out.println(" el resultado es " +c);
			
		}catch (ArithmeticException e) {
			 System.out.println(" se ha producido un error");
		
		}finally {
			
			  System.out.println(" el resultado es ");
		}
		
		System.out.println("programa finalizado");

	}

}

package com.rf.demo;

public class OperacionMat {

	public static void main(String[] args) {
	
		int cantidad = 3;
		int unidades = 12;
		double precio = 5.4;
		double importe;
		double iva = 0.21;
		
		
		importe = cantidad * unidades * precio;
		
		int total = (int)(importe * iva);
		
		
		System.out.println("cantidad \t=" + cantidad);
		System.out.println("unidades \t=" + unidades);
		System.out.println("precio \t=" + precio);
		
		
		System.out.println("importe \t=" + importe);
		System.out.println("iva \t=" + importe*iva);
		System.out.println("total \t=" + total + importe *iva);
		
		

	}

}

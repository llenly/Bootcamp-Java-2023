package ejercicio5.bucles.saltos;

public class TablaMultiplicar {

	public static void main(String[] args) {
//Presentar en consola las tablas de multiplicar del 1 al 10,

		int tabla; 
		int num;
		
// creo un fro para recorrero los numeros introducidos y mostralos , empiezo en 1 oir que el cero no tiene tabla 
		 for ( num = 1 ; num <= 10 ; num ++) {
//aqui muestros los numeros del 1 al 10	 
			 System.out.println(" \t \n Tabla del " + num );
 // luego creo otro for en el que recorro las posiciones por cada numero y lo multiplico 
			 for ( int i = 1 ; i <= 10 ; i++) {
// luego i vale cada numero del 1 al 10 para multiplicarlo por los num iterados del for de arriba 
				// System.out.println(i + " esto es i ");
				 System.out.println( num + " x " + i + " = " + num * i );
			 }
		 }
	}

}

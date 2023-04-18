package ejercicio1.tablaMultiplicar;



import java.util.Scanner;

public class Recursividad {

	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el número a invertir");
		int numero = teclado.nextInt();
		String aux = ""+numero;
		//System.out.println("El tamaño es "+aux.length());
		int tamano = aux.length();
		System.out.println("El número invertido es: " + invertirNumero(numero,tamano));

	}
	///función recursiva 1
	public static int sumarDigitos(int numero) {
		//caso base
		if(numero<10)
			return numero;
		
		else
			return (numero%10) + sumarDigitos(numero/10);
		
	}
	
	/// sumarDigitos(123) = 3 + sumarDigitos(12) = 6
	/// sumarDigitos(12) = 2 + sumarDigitos(1) = 3
	/// sumarDigitos(1) = 1
	
	
	//función recursiva 2
	public static int invertirNumero(int numero, int pos) {
		if(numero<10)
			return numero;
		else {
			return  (numero%10)* (int)Math.pow(10, pos-1) + invertirNumero(numero/10,pos-1);
		}
		// (numero/10,pos-1) el cociente es el numero por el que yo divido
		//482 = 400 + 80 + 2 /// 2*100, 8*10, 4 = 284
		/// invertirNumero(482) = 2* 10^2 + invertirNumero(48,2) = 84
		// = 8 * 10^1 + invertirNumero(4) = 4
		// 4815 = 4*10^3 + 8*10^2 + 1*10^1 + 5*10^0
		//         4000  + 800    + 10     +   5
		// invertirNumero(4815 , 4) = 5 * 10^(4-1) +  invertirNumero(481 , 3)
		///                            5000        +        184
		/// invertirNumero(481 , 3) = 1 * 10^(3-1) + invertirNumero(48 , 2) 
		//                             100         +       84
		// invertirNumero(48 , 2) =  8 * 10^(2-1)  + invertirNumero (4 , 1)
		//                              80         +          4
		
	

	}
	// fibonnaci sin recursividad 
	
	
	
	 public static int fibo ( int indice) {
		 
		 int contador = 2;
		 int fibo0 = 1;
		 int fibo1 = 1;
		 int resultado = 0;
		 while(contador < indice ) {
			 resultado = fibo0 + fibo1; 
			 fibo0 = fibo1;
			 fibo1 = resultado;
			 
		 }
		return resultado;
		 
		 
	 }
	
	
 // CADA VES QUE SE CREE UN METODO DEBE ESTAR ENTRE LA CLASE DEL FINAL DEL MAI Y DEL METODO ANTERIOR 
	// SERIE DE FIBONACCI 
	 public static int finonnaci ( int indice) {
		 if( indice <3 ) {
			 return 1;
		 }
		 return finonnaci ( indice -1) + finonnaci(indice -2);
	 }
		
	// la recursividad es llamda en pila  
	///serie de fibonnaci... f(0) = 1; f(1) = 1;
		// f(8) = f(6) + f(7)
		//
		// f(7) = f(5) + f(6)
		//
		// f(6) = f(4) + f(5)
		//   8  =  5  +  3
		// f(5) = f(3) + f(4)
	 	//   5  =  3  +   2
		// f(4) = f(2) + f(3)
		//   3  =   2  +   1
		// f(3) = f(2) + f(1)
		//  2   =   1  +   1
	 
// siempre me piden el n indice 
//  indices = 1,  2,  3,  4,  5,  6,  7,  8,    9,   10,   11,   12,  13  
// 1,  1,  2,  3,  5,  8, 13, 21,   34,   55,   89,  144, 233 
}


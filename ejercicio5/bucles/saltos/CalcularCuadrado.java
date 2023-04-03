package ejercicio5.bucles.saltos;

public class CalcularCuadrado {

	public static void main(String[] args) {
// -Recibir una colección de números desde la linea de comandos, calcular su cuadrado y presentarlo en salida.
//El bucle debe continuar hasta haber calculado todos los números que se le entreguen
		
		int num;
		int cuadrado; 
		
		 for ( String numeros  : args) {
			 // aqui se parsea la coleccion de numeros que viene por argumentos
			 num = Integer.parseInt(numeros);
			// cuadrado = num * num ; 
			 cuadrado = num * 2;
			 
			 System.out.println(" el cuadrado de " + num + " es = " + cuadrado); 
		 }
 
		
	}

}

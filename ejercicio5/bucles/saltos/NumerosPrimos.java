package ejercicio5.bucles.saltos;

public class NumerosPrimos {

	public static void main(String[] args) {
		// Calcular cuantos números primos hay entre 1 y 100, y cuales son.
		// los numeros son primos cuando solo son divisible por el mismo y 1

		int numero = 100;
		int contador_primo = 0;
		boolean numeros_primos;

		// hacemos un for para recorrer los num del 1 al 100

		for (int i = 1; i <= numero; i++) {
			numeros_primos = true;
// para cada numero en la posiciion i calculamos si es primo 
			int j = 2; // uno es no es primo por empiezo en 2
// si un numero se puede dividir entre dos ya no es primo y el bucle se va a ejecutar hasta la mitad del numero recogido en i 

			while (j <= ((i / 2) - 1) && numeros_primos == true) {

// un numero primo
// si el resto entre el numero en guardado en la posocion i es cero no va a ser
				if (i % j == 0) {
					numeros_primos = false;
//	System.out.println( j + " el numero no es primo ");
				}
				j++;

			}
			if (numeros_primos == true) {
// si es primo el numero incrementamos el contador
				contador_primo++;
				System.out.println(i + " el numero es primo ");
			}
		} // aqui acaba el for

		System.out.println(" en el rango 1 ... " + numero + " , hay " + contador_primo + " numero primos ");

	}
}
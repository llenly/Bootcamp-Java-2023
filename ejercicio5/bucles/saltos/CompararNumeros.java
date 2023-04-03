package ejercicio5.bucles.saltos;

public class CompararNumeros {

	public static void main(String[] args) {

//Cargar dos variables int  con los valores 10 y 20, e indicar cual es mayor, si son iguales, o si uno es múltiplo de otro.
//Para probar el programa, ir cargando distintos valores en las variables.

		int num1 = 10;
		int num2 = 20;

		System.out.println(num1);
		System.out.println(num2);
		
		
		if (num1 == num2) {
			System.out.println("los numero son iguales");
		} else {
			if (num1 > num2) {
				System.out.println("num1 es mayor que num2");
			} else {
				System.out.println("num2 es mayor que num1");
			}

		}
		
		if(num1 % num2 ==0) {
			System.out.println( "son multiplos " );
		}else if(num2 % num1 == 0) {
			System.out.println( " son multiplos " );
		} else {
			System.out.println( "no son multiplos " );
		}
		

	}

}

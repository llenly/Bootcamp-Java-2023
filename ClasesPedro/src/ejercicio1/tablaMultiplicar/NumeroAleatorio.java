package ejercicio1.tablaMultiplicar;

public class NumeroAleatorio {

	public static void main(String[] args) {
// Guardar en un array numeros aleatorios entre el 10 y el 60 
// 
		
		int maximo = 60;
		int minimo = 10;

		int alea = (int) (Math.random() * (maximo - minimo + 1 )+(minimo));
		
		 System.out.println( " estos son mis numeros aleatorios = "+ alea);
		

	}

}

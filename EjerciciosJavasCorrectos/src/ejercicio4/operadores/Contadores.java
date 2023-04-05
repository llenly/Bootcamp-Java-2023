package ejercicio4.operadores;

public class Contadores {

	public static void main(String[] args) {
		
		 int valor = 0;
		   valor = 23;
		   valor+=10; // sumar el valor + 10
		   //valor = valor + 10; es la misma linea de arriba 33
		   
 //32 operador de decremento, si esta antes de la var muestra directo el decremento, primero resta y luego lo utiliza
		   System.out.println("Resultado a= " + --valor);//32
		   
//33 operador de incremento, si esta antes de la var muestra directo el decremento, primero suma y luego lo utiliza 
		   System.out.println("Resultado b= " + ++valor);//33
		
//muestra 33 // deja valor en 34, operador de incremento, si esta despues de la var muestra directo la var incrementada, primero usa  y luego lo suma 
		   System.out.println("Resultado c= "+ valor++);//33
		   
//muestra 34 // deja valor en 33, operador de decremento, si esta antes de la var muestra directo la var decrementada, primero usa  y luego lo resta 
		   System.out.println("Resultado d= " + valor--);//34 usar y despues decrementar sale 34 y deja en 33
		   
//33  
		   System.out.println("Resultado e= " + valor);//33
	}

}

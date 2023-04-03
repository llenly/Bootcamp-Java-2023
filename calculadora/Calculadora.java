package calculadora;
import java.lang.Math;


public class Calculadora {

	public int sumar (int a , int b) {
		
		return a + b;
	}
   public int restar (int a , int b) {
		
		return a - b;
	}
   public int multiplicar (int a , int b) {
	
	     return a * b;
}
   public int dividir (int a , int b) {
	
	     return a / b;
}
   
   public int cuadrado(int a)  {

       return (int)Math.pow (a, 2);

   }
   
   public int negativo(int a)

   {

   if(a!=0)

   {

   return -1*a;

   }

   else

   {

   return 0;

   }

   }
	 
}

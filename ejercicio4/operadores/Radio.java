package ejercicio4.operadores;

public class Radio {

	public static void main(String[] args) {
//Dado el radio, (23), calcular el área del circulo y la longitud de la circunferencia.   
		  
		    int radio = 23;
	        double longitud;
	        double area;
	        
//el area se calcula pi * radio al cuadrado , para acceder a PI hay que acceder a la clase Math
	    	area = Math.PI * (radio * radio);
	    	
// la formula de la longitud es 2 * PI * radio  	
			longitud = 2 * Math.PI * radio ;
			
		System.out.println("radio =\t"+ radio);
		System.out.println("area =\t"+ area);
		System.out.println("longitud =\t"+ longitud);
		
	}

}

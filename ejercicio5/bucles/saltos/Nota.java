package ejercicio5.bucles.saltos;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		//aqui llamo al metodo y lo aguardo en e aux
		
           String aux = calificacion();
           System.out.println("tu nota es :" + aux);
//Crear una variable (nota) con el valor 6,
//decidir el texto que se ha de presentar según la siguiente escala.
				
//				int nota = 6;
//
//		        if( nota > 0 && nota <= 4 ) {
//		            System.out.println("Insuficiente");
//		        }
//		        if( nota >= 5 && nota < 6 ) {
//		            System.out.println("Suficiente");
//		        }
//		        if( nota >= 6 && nota <= 7 ) {
//		            System.out.println("Bien");
//		        }
//		        if( nota == 7 || nota == 8 ) {
//		            System.out.println("Notable");
//		        }
//		        if( nota == 9 || nota == 10 ) {
//		            System.out.println("Sobresaliente");
//		        }
//				

	    }
    
	//dentro la clase pero fuera del main 
	//probando con un switch
    
	 public static String calificacion (){
	        	
	        
			System.out.println("Ingresa la nota: ");
			Scanner entrada = new Scanner(System.in);
			   int nota2 = entrada.nextInt();
			        entrada.nextLine();
	            String resultado = "";

	            switch(nota2){
	                case 0: case 1: case 2: // si la nota < 3
	                    resultado = "M.D.";
	                    break;
	                case 3: case 4:         // si la nota >= 3 && < 5
	                    resultado = "INS.";
	                    break;
	                case 5:                 // si la nota >= 5 && < 6
	                    resultado = "SUF.";
	                    break;
	                case 6:                 // si la nota >= 6 && < 7 
	                    resultado = "BIEN.";
	                    break;    
	                case 7: case 8:         // si la nota >= 7 && < 9
	                    resultado = "NOT.";
	                    break;
	                case 9: case 10:        // si la nota >= 9 && < 10
	                    resultado = "SOB.";
	                    break;
	                default:                // para cualquier otro valor no valido
	                    resultado ="No valido";
	                    break;
	            }

	            // respuesta obtenida de acuerdo a la valoración de la nota
	            return  resultado;
	        }
}





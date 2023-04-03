package ejercicio4.operadores;

public class OperacionesMat {

	public static void main(String[] args) {

//Has de preparar un programa que calcule una linea de factura, para ello, tienes las variables
		
		int cantidad = 3;
		int unidades = 12;
		double precio = 5.4;
		double importe;
		double iva = 0.21;
        int total; 
        double valorIva;
       
//el importe = cantidad multiplicado por las unidades y multiplicado por el precio

		importe = cantidad * unidades * precio ;

/*  el total es el resultado de multiplicar el importe por 1,21. Ten en	
	* cuenta que puedes necesitar utilizar «cast» el valor de iva es el 21% del
	* importe. Debes presentar en salida,también el valor correcto si no
	* convirtiéramos el total a «int».
 */
	  total =(int)( importe * 1.21);	

// el valor de iva es el 21% del importe.
	  valorIva = importe * iva ;
	  
	  //salida por consola 
	  System.out.println("cantidad \t es = " + cantidad);
	  System.out.println("unidades \t es = " + unidades);
	  System.out.println("precio \t es = " + precio);
	  System.out.println("importe \t es = " + importe);
	  System.out.println("valorIva \t es = " + valorIva);
	  System.out.println("total \t es = " + total + "\tresultado sin redondeo , quitarle el int\t"+  importe * 1.21 );
	  
	  
		
	}

}

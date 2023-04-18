package ejercicio1.tablaMultiplicar;

public class StringeEspacios {

	public static void main(String[] args) {
		// 
		
		String frase = " hola llenly tienes que comer ";
		String fraseSinEspacio = "";
		String nueva_frase = "";
		
		// coger los caracteres de la farse para gusradalo en un var 
		char caracter;
	    char letra;
	    
		    for ( int i = 0 ; i< frase.length(); i++) {
		    	
		    	caracter = frase.charAt(i);
		    	
		    	 if (caracter != ' ') {
		    		 fraseSinEspacio = fraseSinEspacio + caracter;
		    	 }
		    }
		    
// CON UN  DO  WHILE		    
		    int j = 0;
		    frase+= '$';
		    
		    do {
		    	
		    	letra = frase.charAt(j);
		    	
//		    	System.out.println(frase.charAt(j));
		    	System.out.println(fraseSinEspacio );
		    	  if( letra !=  ' ' && letra != '$') {
		    		  nueva_frase = nueva_frase + letra ;
		    	  }
		    	  
		    	 j++;
		    }

		   while( letra != '$');
		     System.out.println(nueva_frase);
		     
 // CON UN WHILE SOLO 
		     
		     
	}

}

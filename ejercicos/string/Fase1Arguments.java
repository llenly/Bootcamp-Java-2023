package ejercicos.string;

public class Fase1Arguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "";
		int longitud = args.length;
		
		for(int i = 0; i < longitud; i++) {
			   frase+=  args[i] + "";
			 
		}
		  System.out.println("string fase1 = " + frase);
		
//vuelta del array al reves 
		  
			 int lg = frase.length();
			 String vuelta = "";
			  for (int i = lg -1 ; i >= 0; i-- ){
			       vuelta+=frase.charAt(i);
			       //System.out.print(frase.charAt(i));
			 } 
			System.out.println("string fase2 cadena invertida = " + vuelta);
			
//cambia las vocales por numeros en la frase invertida
		
			String cambioVocales= "";
			  for(int i = lg -1; i>=0 ; i--) {
				  
				 switch (frase.charAt(i)) {
				 
				 case 'a':
					 cambioVocales +=1;
					 break;
				 case 'e':
					 cambioVocales +=2;
					 break;
					 
				 case 'i':
					 cambioVocales +=3;
					 break;
					 
				 case 'o':
					 cambioVocales +=4;
					 break;
				 case 'u':
					 cambioVocales +=5;
					 break;
					 
				default:
					cambioVocales+= frase.charAt(i);
				 }
			  }
			  System.out.println("string fase3 cambio vocales= " + cambioVocales);  
			
			  
			//fase 4   
			  
			  
			//fase 5 
			  
	}

}

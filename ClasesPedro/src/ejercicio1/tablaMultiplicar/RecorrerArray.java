package ejercicio1.tablaMultiplicar;

public class RecorrerArray {

	public static void main(String[] args) {
	// array bidimensional 
		
		int miArray [][] = new int [5][5] ;
		 // voy a recorrer para llenar el array con vaores
		
		for(int i = 0; i < miArray.length; i++) {
			for(int j= 0; j < miArray.length; j++) {
				miArray[i][j] = (i + 1)* (j +1);
				
			}
		
		}
		  
		// para imprimirlo
		for(int i = 0; i < miArray.length; i++) {
			for(int j= 0; j < miArray.length; j++) {
				System.out.print(miArray [i][j]+ " ");
				System.out.print(" i ="+ ( i +1));
				System.out.print(" j ="+ ( j +1));
				System.out.print(" - ");
			}
		   System.out.println();
		}
        
	}

}

package ejerciciodatos;

public class DatosArray {

	public static void main(String[] args) {
	// DEFINIR ARRAY QUE CONTENGA LOS DIAS DE LOS 12 MESES
		
		int[] diasMeses = {31,28,31,30,31,30,31,31,30,31,30,31};

  //ARRAY DE DOS DIMENSIONES, 5 Y 7 ELEMENTOS
		int[][] miArray = new int [5][7];
		
 //RELLENARLOS CON NUM SECUENCIALES 
		//miArray[0][0]=1;
		//miArray[0][1]=2;
		//miArray[0][2]=3;
		//miArray[0][3]=4;
		//miArray[0][4]=5;  asi sucesivamente
		

		//me creo una var contador que guarde el valor con los datos del array
		int contador=0;
		
// dos for que recorra las dos posiciones del array bidimensional 
		for(int i=0; i < miArray.length; i++) {
			
			for(int j=0; j < miArray[i].length; j++) {
				miArray[i][j]=contador++;
				
				System.out.println(miArray[i][j]);
			}
		}
		
      

	}

}

package ejercicio1.tablaMultiplicar;

import java.util.Scanner;

public class DniLetra {

	public static void main(String[] args) {
		// CALCULAR LA LETRA DEL DNI
		System.out.println("ingresa el  numero del dni sin letra ");
		Scanner teclado = new Scanner(System.in);
		int numeroDni = teclado.nextInt();
		teclado.nextLine();
		
		// array de caracteres 
		char[] letraDni = {'T', 'R','W', 'A','G', 'M','Y', 'F','P', 'D','X', 'B',
				'N', 'J','Z', 'S','Q', 'V','H', 'L','C', 'K','E'};

		int letra = numeroDni % 23;
        String Dni = "";
 // para converti un entero a un string solo concateno con el string vacio 
 // Dni += "" + numeroDni;  
        
               Dni += numeroDni;
               Dni += letraDni[numeroDni % 23 ];
               
               
        System.out.println("tu numero de dni es " + Dni);       
		
		switch (letra) {

		case 0:
			System.out.println("la letra de tu dni es :T");
			break;
		case 1:
			System.out.println("la letra de tu dni es :R");
			break;
		case 2:
			System.out.println("la letra de tu dni es :W");
			break;
		case 3:
			System.out.println("la letra de tu dni es :A");
			break;
		case 4:
			System.out.println("la letra de tu dni es :G");
			break;
		case 5:
			System.out.println("la letra de tu dni es :M");
			break;
		case 6:
			System.out.println("la letra de tu dni es :Y");
			break;
		case 7:
			System.out.println("la letra de tu dni es :F");
			break;
		case 8:
			System.out.println("la letra de tu dni es :P");
			break;
		case 9:
			System.out.println("la letra de tu dni es :D");
			break;
		case 10:
			System.out.println("la letra de tu dni es :X");
			break;
		case 11:
			System.out.println("la letra de tu dni es :B");
			break;
		case 12:
			System.out.println("la letra de tu dni es :N");
			break;

		case 13:
			System.out.println("la letra de tu dni es :J");
			break;
		case 14:
			System.out.println("la letra de tu dni es :Z");
			break;
		case 15:
			System.out.println("la letra de tu dni es :S");
			break;
		case 16:
			System.out.println("la letra de tu dni es :Q");
			break;
		case 17:
			System.out.println("la letra de tu dni es :V");
			break;
		case 18:
			System.out.println("la letra de tu dni es :H");
			break;
		case 19:
			System.out.println("la letra de tu dni es :L");
			break;
		case 20:
			System.out.println("la letra de tu dni es :C");
			break;
		case 21:
			System.out.println("la letra de tu dni es :K");
			break;
		case 22:
			System.out.println("la letra de tu dni es :E");
			break;
		}
		System.out.println("RESTO = " + letra);
		
		
		// HACERLO CON ARRAY
		
		

	}

}

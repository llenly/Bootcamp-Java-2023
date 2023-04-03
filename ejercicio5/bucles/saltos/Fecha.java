package ejercicio5.bucles.saltos;

public class Fecha {

	public static void main(String[] args) {
		/*
		 * 3- hacer una clase, definiendo día=20, mes =8,año = 2015, y luego añadir el
		 * código para comprobar que la fecha es correcta. En la primera version, asumir
		 * meses de 30 dias En la segunda version, utilizar los días reales de cada mes,
		 * sin arrays En la tercera, utilizar arrays En la cuarta, tened en cuenta los
		 * años bisiestos
		 */

		int dia = 20;
		int mes = 13;
		int año = 2015;

		// var de la segunda version
		boolean diasReales = false;
		// array para la tercera version
		int[] diasMeses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

//PRIMERA VERSION 
		if (dia >= 1 && dia <= 30) {
			System.out.println(" el dia es correcto");
		} else {
			System.out.println(" el dia es incorrecto");
		}

		if (mes >= 1 && mes <= 12) {
			System.out.println(" el mes es correcto");
		} else {
			System.out.println(" el mes es incorrecto");
		}

		if (año != 0) {
			System.out.println(" el año es correcto");
		} else {
			System.out.println(" el año es incorrecto");
		}

//En la SEGUNDA VERSION, utilizar los días reales de cada mes, sin arrays

		if (mes >= 1 && mes <= 12) {
			if (año != 0) {
// hago un switch para comprobar en cada asoq ue el mes tenga 30 o 31 dias
				switch (mes) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if (dia <= 31) {
// en caso que los meses tengan 31 dias la var diasReales pasa a true
						diasReales = true;
						if (diasReales) {
							System.out.println(" el dia es correcto");
						} else {
							System.out.println(" el dia es incorrecto");
						}
						break;

					}
				case 4:
				case 6:
				case 9:
				case 11:
					if (dia <= 28) {
						diasReales = true;
						if (diasReales) {
							System.out.println(" el dia es correcto");
						} else {
							System.out.println(" el dia es incorrecto");
						}
						break;
					}
				default:

				}
			} else {
				System.out.println(" el año es incorrecto");
			}
		} else {
			System.out.println(" el mes es incorrecto");
		}

		// TERCERA VERSION CON ARRAY

//hay que crear un array con los meses del año definido arriba 

		if ((mes >= 1 && mes <= 12) && dia <= diasMeses[mes - 1]) {
			System.out.println(" el dia es correcto");
		} else {
			System.out.println(" el dia es incorrecto");
		}
		if (mes >= 1 && mes <= 12) {
			System.out.println(" el mes es correcto");
		} else {
			System.out.println(" el mes es incorrecto");
		}

		if (año != 0) {
			System.out.println(" el año es correcto");
		} else {
			System.out.println(" el año es incorrecto");
		}

		// AÑOS BISISESTOS cada 4 años feb tiene 29 dias

		if (mes >= 1 && mes <= 12) {
			if (año != 0 && año % 4 == 0) {
				// array de meses en la posicion 1 28 = 29
				diasMeses[1] = 29;
				if (dia <= diasMeses[mes - 1]) {
					System.out.println(" el dia es correcto ");
				} else {
					System.out.println(" el dia es incorrecto ");
				}
			} else {
				System.out.println("el año es incorrecto ");
			}

		} else {
			System.out.println(" el mes incorrecto");
		}

	}

}

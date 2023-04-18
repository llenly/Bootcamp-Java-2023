package Banco;

public class Principal {

	public static void main(String[] args) {

		
			Cuenta cuenta = new Cuenta("271-1234-4560-721", "LLenly Lisaso");
			
			cuenta.ingresar(5000);
			cuenta.retirar(1000);
			
			System.out.println(cuenta.getSaldo());
		}

	}



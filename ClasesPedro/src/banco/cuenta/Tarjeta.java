package banco.cuenta;

import java.time.LocalDate;

public abstract class Tarjeta {

	
	// att
	private String titular;
	private String numero;
	private LocalDate fechaCaducidad;
	private Cuenta cuentaAsosiada;
	
	
	// constructor 
	
	public Tarjeta(String titular,String numero,LocalDate fechaCaducidad) {
		
		 this.titular = titular;
		 this.numero= numero;
		 this.fechaCaducidad = fechaCaducidad;
	}
	
	// metodos setcuenta 
	
	public void setCuenta(Cuenta cuentaAsosiada ) {
		
		this.cuentaAsosiada= cuentaAsosiada;
	}
	
	//metodos abastractpo
	public abstract void ingresar(double valorIngresar);
	
	public abstract void retirar (double valorRetirar);
	
	public abstract void pagoEnEstablecimiento ( String datos , double valorCompra);
	
	public abstract double getSaldo ();

	//para recuperar la cuenta asociada 
	
	public Cuenta getCuentaAsosiada() {
		return cuentaAsosiada;
	}

	
	
	
	
}

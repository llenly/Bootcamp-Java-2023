package banco.cuenta;

import java.time.LocalDate;

public class Debito extends Tarjeta {

	// AÑADIR EL CONSTRUCTOR  con los att de su clase `padre que es tarjeta
	
	 public Debito (String titular,String numero,LocalDate fechaCaducidad) {
		 
		 // llamar al constructor del padre 
		 super(titular,numero, fechaCaducidad);
		 
		 
		// TODO Auto-generated method stub

	}

	@Override
	public void retirar(double valorRetirar) {
		// TODO Auto-generated method stub
		this.getCuentaAsosiada().retirar(valorRetirar, " retiro en cajero automatico");

	}

	@Override
	public void pagoEnEstablecimiento(String datos, double valorCompra) {
		
		// TODO Auto-generated method stub
		this.getCuentaAsosiada().retirar(valorCompra, " compras en : "+ datos);

	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ingresar(double valorIngresar) {
		// TODO Auto-generated method stub
		
		this.getCuentaAsosiada().ingresar(valorIngresar, " ingreso en cajero automatico");
		
	}

}

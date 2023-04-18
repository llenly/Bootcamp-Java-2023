package banco.cuenta;

import java.time.LocalDate;
import java.util.ArrayList;

public class Credito extends Tarjeta {

	 // att
	private double credito;
	private ArrayList <Movimiento> movimientoCredito;
	
	
	// constructor hereda de tarjeta 
	
	public Credito(String titular, String numero, LocalDate fechaCaducidad, double credito) {
		super(titular, numero, fechaCaducidad);
		
		//inicializar 
		this.credito = credito;
		this.movimientoCredito = new ArrayList <Movimiento>();
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ingresar(double valorIngresar) {
		// TODO Auto-generated method stub
	
		// creo un objeto nuevo 
		
		Movimiento ingresarCredito = new Movimiento();
		ingresarCredito.setConcepto(" ingreso en cuenta asociada (cajero automatico)");
		ingresarCredito.setmImporte(valorIngresar);
		this.movimientoCredito.add(ingresarCredito);
		
		
	}

	@Override
	public void retirar(double valorRetirar) {
		// TODO Auto-generated method stub

		Movimiento retirarCredito = new Movimiento();
		
		retirarCredito.setConcepto("retirada en cuenta asociada");
		
		double comision = valorRetirar * 0.05;
		   if( comision < 3) {
			   comision = 3;
		   }
		retirarCredito.setmImporte(- (valorRetirar + comision) );
		
		this.movimientoCredito.add(retirarCredito);
		
		
	}

	@Override
	public void pagoEnEstablecimiento(String datos, double valorCompra) {
		// TODO Auto-generated method stub

		
		// se creo un nuevo objeto movimiento
		 Movimiento  pago = new Movimiento();
		 pago.setConcepto("Compra a crédito en:" + datos );
		 pago.setmImporte(-valorCompra);
		 
 //aqui le añado a lista de  moviemnto credito el valor del objeto PAGO con los param que recibe el metodo, cambio los att  IMPORTE Y CONCETO 
 // añado a lista el objt pago con sus att 
		 this.movimientoCredito.add(pago);
		 
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}

}

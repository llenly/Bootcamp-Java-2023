package banco.cuenta;

import java.util.ArrayList;

public class Cuenta {

	// sto es un array que coje la clase movimiento
	private ArrayList<Movimiento> mMovimientos;
	private String mNumero;
	private String mTitular;

	public Cuenta(String mNumero, String mTitular) {

		// inicializando el arraylist con <Movimiento> para indicar el tipo de array que
		// estoy generando

		mMovimientos = new ArrayList<Movimiento>();
// marrones son los paramentros que le paso al constructor , y los azules son los att de la clase
		this.mNumero = mNumero;
		this.mTitular = mTitular;
	}

	// crear metodos
	public void addMovimiento(Movimiento m) {

		// añadiendo a la la lista de movimineto un mov con el .add
		mMovimientos.add(m);

	}

//	public double getSaldo() {
//		 
//		
//	}

	public void ingresar(double valorIngreso) {
		// estoy creando un objeto de la calse movimiento 
		
        Movimiento ingreso = new Movimiento();
    // en el nuevo objeto le asigno un cocnceto y un importe , se la da valor a los att de clasee movimiento 
        ingreso.setConcepto("");
        ingreso.setmImporte(valorIngreso);
        
        //este metodo para añadir los mov le metro el valor de ingreso que es mi obj
        this.addMovimiento(ingreso);
        
	}
	

	// metodo con concepto 
	public void ingresar(double valorIngreso , String concepto) {
		// estoy creando un objeto de la calse movimiento 
		
        Movimiento ingreso = new Movimiento();
    // en el nuevo objeto le asigno un cocnceto y un importe , se la da valor a los att de clasee movimiento 
        ingreso.setConcepto(concepto);
        ingreso.setmImporte(valorIngreso);
        
        //este metodo para añadir los mov le metro el valor de ingreso que es mi obj
        this.addMovimiento(ingreso);
        
	}
	
	public void retirar(double valorRetirar) {
		
		Movimiento retirar = new Movimiento();
		 retirar.setConcepto("");
		 retirar.setmImporte(-valorRetirar);
		 
		 //anadirlo a la lista de mov
		 
		 this.addMovimiento(retirar);
		
		
	}
	
public void retirar(double valorRetirar, String concepto) {
		
		Movimiento retirar = new Movimiento();
		// le asigno al obj el valor  qyue pasa por parametro 
		 retirar.setConcepto(concepto);
		 retirar.setmImporte(-valorRetirar);
		 
		 //anadirlo a la lista de mov
		 
		 this.addMovimiento(retirar);
		
		
	}

}

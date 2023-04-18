package ProgramacionOrientadaObjt;

// programacion orientda a objetos herencia 

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	//private int peso_carroceria;
	private int peso_plataforma;

	private String color;
	private int peso_total;

	private boolean asientos_cuero, climatizador;

// contructor de la clase se llama siempre como la clase se inicializa o no , dandole valores a las var
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;

	}
// generamos los metodos get y set para establecer las caracteristicas de cada instancia o sea de cada obj 
// que pertenece a la clase coche y para devolver la informacion 

//get devuelve los valores generales de la clse u objeto coche 
	public String dime_datos_generales() {
		return " la plataforma del vehiculo tiene " + ruedas + " ruedas" + " .Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + ".cm y un peso de plataforma de " + peso_plataforma + " kg";

	}

//set el azul pertenece a la clase y el marron al metodo , establecer el color del coche
	public void establece_color(String color_coche) {
		color = color_coche;
	}

//devuelve el color del coche
	public String dime_color() {
		return "el color del coche es " + color;
	}

// metodo sett  para indicar o estalecer  si tiene asientos de cuero 
	public void configura_asientos(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

// metodo gett  para recoger si tiene asientos de cuero el nombre lo pones tu 
	public String dime_asientos() {
		if (asientos_cuero == true) {
			return "el coche tiene asientos de cuero";

		} else {
			return " el coche tiene asientos de serie";
		}
	}

// metodo sett para establecer si tiene climatizador 
	public void configura_climatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

// metodo gett para recoger si tiene climatizador el coche el nombre lo pones tu
	public String dime_climatizador() {
		if (climatizador == true) {
			return "el coche tiene asientos de cuero";

		} else {
			return " el coche tiene asientos de serie";
		}
	}
	// metodo sett para establecerel peso del coche 
	public void establece_peso_coche(int peso_carroceria) {
	  	peso = peso_carroceria;
	}
	
	

}

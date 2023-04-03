package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

static Calculadora calc;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	
		calc=new Calculadora();
	}
	

	@Test
	void sumaTest() {
		assertEquals(calc.sumar(6, 5),11);
	}


	@Test
	void restarTest() {
		assertEquals(calc.restar(6, 5),1);
	}
	

	@Test
	void multiplicarTest() {
		assertEquals(calc.multiplicar(6, 5),30);
	}

	@Test
	void dividirTest() {
		assertEquals(calc.dividir(30, 5),6);
	}
	
	
	@Test
	void cuadradoTest() {
		assertEquals(calc.cuadrado(4),16);
	}

	@Test
	void restaTest() {
		assertEquals(calc.restar(20, 10),10);
	}
	
	@Test
	void negativoTest() {
		assertEquals(calc.negativo(10),-10);
		assertEquals(calc.negativo(0),0);
	}

	
}

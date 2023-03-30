package TestUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

 

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

 

public class CalculadoraTest {

    private Calculadora calc = new Calculadora();

    @BeforeEach
    void setUp() throws Exception{
        this.calc = new Calculadora();
    }

    @Test
    public void testSumar() {

        double resultado = calc.sumar (4.5, 2.2);

        assertEquals(10.4, resultado);
    }

    @Test
    public void testRestar() {

        double resultado = calc.restar(8.5, 10.6);

        assertEquals(3.4, resultado);

    }

    @Test
    public void testMultiplicar() {

        double resultado = calc.multiplicar(2.0, 5.0);

        assertEquals(10.0, resultado);
    }

    @Test
    public void testDividir() {
        double resultado = calc.dividir(15.0, 3.0);

        assertEquals(5.0, resultado);
    }

 

}
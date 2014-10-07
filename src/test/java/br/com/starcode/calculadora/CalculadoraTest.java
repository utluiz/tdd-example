package br.com.starcode.calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	Calculadora calculadora;
	
	@Before
	public void setup() {
		calculadora = new Calculadora();
	}

	@Test
	public void testSoma() throws Exception {
		int resultado = calculadora.soma(1, 2);
		assertEquals(3, resultado);
	}
	
	@Test
	public void testSubtracao() throws Exception {
		int resultado = calculadora.subtrai(2, 1);
		assertEquals(1, resultado);
	}
	
}

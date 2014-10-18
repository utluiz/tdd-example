package br.com.starcode.fiboncci;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.starcode.fibonacci.Fibonacci;

/*

0	F1	F2	F3	F4	F5	F6	F7	F8	F9	F10	F11	F12	F13	F14	F15	F16	F17	F18	F19	F20
0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597	2584	4181	6765
*/
public class FibonacciTest {
	
	Fibonacci fibonacci;
	int[] itens = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765 };
	
	@Before
	public void setup() {
		fibonacci = new Fibonacci();
	}

	@Test
	public void testarPrimeiros20() throws Exception {
		
		for (int i = 0; i < itens.length; i++) {
			int resultado = fibonacci.calcularElementoFibonacci(i);
			int esperado = itens[i]; 
			assertEquals(esperado, resultado);
		}
		
	}
	
}

package br.com.starcode.calculadora;

public class Calculadora {
	
	public int soma(int a, int b) {
		return a + b;
	}
	
//	OLD WAY
//	public int subtrai(int a, int b) {
//		return a - b;
//	}
//	
	public int subtrai(int a, int b) {
		return soma(a, -b);
	}
	
	public int multiplica(int a, int b) {
		return 0;
	}
	
}

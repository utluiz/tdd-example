package br.com.starcode.fibonacci;

public class Fibonacci {

	public int calcularElementoFibonacci(int n) {
		if (n <= 1) return 1;
		return calcularElementoFibonacci(n - 1) + 
				calcularElementoFibonacci(n - 2);
	}
	
}

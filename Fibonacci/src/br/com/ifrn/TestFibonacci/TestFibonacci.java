package br.com.ifrn.TestFibonacci;

import junit.framework.TestCase;

import org.junit.Test;

import br.com.ifrn.Fibonacci.Fibonacci;


public class TestFibonacci extends TestCase{

	Fibonacci fiboo = new Fibonacci();
	
	@Test
	public void testFiboZero() {
		verificaFibonacci(1,1);
	}
	public void testFibonacciParaNumeroInvalido(){
		try {
			fiboo.fibonacci(-1);
			fail("Deveria ter lançado Exception");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
	}
	public void verificaFibonacci(int resultadoEsperado, int valor){
		assertEquals(resultadoEsperado, fiboo.fibonacci(valor));
	}

}

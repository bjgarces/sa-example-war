package com.bbva.sa_example_war;

import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {

	public void testSumar() {
		assertEquals(10, Calculadora.sumar(5, 5));
	}

	public void testRestar() {
		assertEquals(0, Calculadora.restar(5, 5));
	}

	public void testMultiplicar() {
		assertEquals(25, Calculadora.multiplicar(5, 5));
	}

	public void testDividir() {
		assertEquals(1.0f, Calculadora.dividir(5, 5));
	}

}

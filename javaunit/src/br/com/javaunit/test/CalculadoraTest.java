package br.com.javaunit.test;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

import br.com.javaunit.Calculadora;

public class CalculadoraTest {

	@Test
	public void somaDoisNumeros() {
		
		Calculadora calc = new Calculadora();
		
		int somar = calc.somar(1, 5);
		Assert.assertEquals(6, somar);
	}
}

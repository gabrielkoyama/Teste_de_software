/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
	
class AppTest {
	
	@Test
	public void calcuadoraTestZero() {
		Calculadora calc = new Calculadora();
		assertEquals(0f, calc.dividir(10f, 0f), 0.1);
	}
	
	@Test
	public void calcuadoraTestBesta() {
		Calculadora calc = new Calculadora();
		assertEquals(2f, calc.dividir(10f, 5f), 0.1);
	}
}

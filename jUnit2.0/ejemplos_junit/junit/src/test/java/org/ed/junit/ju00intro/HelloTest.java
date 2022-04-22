package org.ed.junit.ju00intro;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloTest {

	/**
	 * Ejemplo de test básico con JUnit. 
	 * Define el objeto a probar (target), el resultado esperado (expected) y obtiene el valor de la ejecución (actual).
	 * Comprueba la igualdad con assertEquals
	 */
	@Test
	public void testSayHello() {
		Hello target = new Hello();
		String expected = "hello2";
		String actual = target.sayHello();
		
		assertEquals("Returns hello",expected, actual);
	}

}

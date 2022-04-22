package org.ed.junit.ju01testdecimal;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 * 
 * La clase contiene dos ejemplos de test con JUnit usando assertEquals con un margen de error.
 * En los dos test se permite que el valor no sea exactamente igual con una diferencia de +/- 0.01
 *
 */
public class EurosConversorTest  {

	@Test
	public void testEuros2Pesetas() {
		EurosConversor target = new EurosConversor();
		
		double expected = 998.316d;
		double actual = target.euros2Pesetas(7);
		
		assertEquals("Euros 2 pesetas conversion", expected, actual, 0.01);
	}

	@Test
	public void testPesetas2Euros() {
		EurosConversor target = new EurosConversor();
		
		double expected = 6.01d;
		double actual = target.pesetas2Euros(1000);
		
		assertEquals("Pesetas 2 euros conversion", expected, actual, 0.01);
	}

}

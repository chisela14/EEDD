package org.ed.junit.ju02asserttypes;

import static org.junit.Assert.*;
import org.junit.Test;


/**
 * 
 * La clase implementa varios test unitarios probando la funcionalidad de distintos tipos de assert
 *
 */
public class TestRobot {

	Robot r1;
	Robot r2;
	Robot r3;
	Robot r4;

	public TestRobot() {
		r1 = null;
		r2 = new Robot("R2D2");
		r3 = r2;
		r4 = new Robot("Arale");
	}

	/**
	 * assertNull es v�lido cuando el objeto que se comprueba es NULL
	 */
	@Test
	public void testIfNull() {
		assertNull("Comprobamos que r1 es nulo", r1);
	}

	/** 
	 * assertNotNull es v�lido cuando el objeto que se comprueba tiene cualquier valor distinto de NULL
	 */
	@Test
	public void testIfNotNull() {
		assertNotNull("Comprobamos que r2 NO es nulo", r2);
	}


	/**
	 * assertSame es v�lido cuando los dos objetos son el mismo, es decir, apuntan a la misma referencia en memoria (no es lo mismo que ser iguales)
	 */
	//r2 y r3 son el mismo objeto
	@Test
	public void testSameObject() {
		assertSame("r2 y r3 hacen referencia a lo mismo", r2, r3);
	}


	/**
	 * assertNotSame es v�lido en la situaci�n contraria al test anterior, cuando los objetos no son el mismo, aunque sean iguales.
	 */
	@Test
	public void testNotSameObject() {
		assertNotSame("r1 y r2 NO hacen referencia a lo mismo", r1, r2);
	}

	/**
	 * assertEquals permite comprobar la igualdad entre objetos, en este caso con un margen de error de +/- 0.01
	 */
	@Test
	public void testInitialAutonomy() {

		assertEquals("Initial autonomy is 42", 42.0, r2.getAutonomy(), 0.1);
	}

	/**
	 * assertTrue es v�lido cuando la condici�n que se indica es TRUE
	 */
	@Test
	public void testIfItsTrue() {
		r4.setAutonomy(-4.0);

		assertTrue("If we try to set less than 0, then 42.0 is set",
				r4.getAutonomy() == 42.0);
	}

	/**
	 *  assertFalse es v�lido cuando la condici�n se indica es FALSE
	 */
	@Test
	public void testFalso() {
		double testValue = -66.0;
		r4.setAutonomy(testValue);

		assertFalse("If we try to set less than 0, that value is not assigned",
				r4.getAutonomy() == testValue);
	}
	//Con esto podemos controlar todas las situaciones mientras que no salte una exception, una exception sería un error, no un failure.
}
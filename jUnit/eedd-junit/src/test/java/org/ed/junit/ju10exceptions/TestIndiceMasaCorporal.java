package org.ed.junit.ju10exceptions;




import org.junit.Test;
import static org.junit.Assert.*;

/**
* TestIndiceMasaCorporal
* Clase de testeo para la clase {@link IndiceMasaCorporal}.
* La clase IndiceMasaCorporal puede lanzar excepciones en uno
* de sus constructores y en un método de cálculos.
* Queremos provocar un error para comprobar que la clase
* IndiceMasaCorporal lanza una excepción cuando debe.
*
* Lo que se debe hacer al testear es provocar un error con
* la orden fail() en caso de que NO se haya lanzado una excepción.
* De la excepción ya se encarga jUnit y sigue adelante con el resto
* de los tests.

*/
public class TestIndiceMasaCorporal {
	
	
	/**
	* testEsNumero
	* comprueba que una cadena es un número
	*/
	@Test
	public void testCalcularIMC( )  {
		IndiceMasaCorporal indiceMasaCorporal = new IndiceMasaCorporal(74.0F, 173.0F);
		float esperado = (74.0F / (173.0F * 173.0F)) * 10000F;
		try {
			assertEquals("Cálculo de IMC correcto, margen 0.1",indiceMasaCorporal.calcularIMC(),esperado,0.1);
		} catch (Exception e) {
		}
	}
	
	/**
	* testDiagnostico
	* comprueba que el dianóstico es correcto
	*/
	@Test
	public void testDiagnostico( ) {
		IndiceMasaCorporal indiceMasaCorporal = new IndiceMasaCorporal("67.0", "168.0");
		try {
			assertEquals("Diagnóstico de IMC correcto",indiceMasaCorporal.diagnostico(),"Muy bien");
		} catch (Exception e) {
		}
	}
	
	/**
	* testExcepcion
	* comprueba que este test lanza excepción, pasando
	* parámetros incorrectos al constructor
	*/
	@Test
	public void testExcepcion( ) {
		try {
			IndiceMasaCorporal indiceMasaCorporal = new IndiceMasaCorporal("67.0", "JEJE");
			assertTrue("ERROR, debía haber lanzado excepción", false);
		} catch (NumberFormatException nfe) {
			System.out.println("Excepción tal y como se esperaba: " + nfe.getMessage());
		}
	}
	
	/**
	* testExcepcionNegativos
	* comprueba que este test lanza excepción, pasando
	* parámetros negativos a la operación de cálculo
	*/
	@Test
	public void testExcepcionNegativos( ) {
		IndiceMasaCorporal indiceMasaCorporal = new IndiceMasaCorporal("67.0", "-5.0");

		try {
			assertEquals("Diagnóstico de IMC correcto",indiceMasaCorporal.diagnostico(),"Muy bien");
			fail("ERROR, debía haber lanzado excepción por números negativos");
		} catch (Exception e) {
			System.out.println("Excepción por negativos tal y como se esperaba: " + e.getMessage());
		}
	}
	
	@Test(expected = Exception.class)
	public void testExcepcionNegativosAnotaciones( ) throws Exception {
		IndiceMasaCorporal indiceMasaCorporal = new IndiceMasaCorporal("67.0", "-5.0");
			assertEquals("Diagnóstico de IMC correcto",indiceMasaCorporal.diagnostico(),"Muy bien");

	}
}
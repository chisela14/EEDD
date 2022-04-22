package org.ed.junit.ju11testconsole;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestMatriz {
	
	//Variables para redirigir la salida de la consola
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	//Antes de cada test redirigimos la salida de consola a la variabla outContent
	@BeforeEach
	public void setUpStreams() {
	    System.setOut(new PrintStream(outContent));
	}

	//Prueba de salida de una cadena por pantalla
	@Test
	public void test() {
		System.out.print("hello");
	    assertEquals("hello", outContent.toString());
	}
	
	//Prueba de salida de una matriz por pantalla
	@Test
	public void testPintaMatriz() {
		String expected = "X X X \nX X X \nX X X \n";
		Matriz m = new Matriz(3,3);
		m.pintaMatriz();
		assertEquals(expected, outContent.toString());
	}
	
	//Al finalizar cada test restauramos la salida de consola
	@AfterEach
	public void restoreStreams() {
	    System.setOut(originalOut);
	}

}

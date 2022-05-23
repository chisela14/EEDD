package com.jacaranda.tests;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;


import com.jacaranda.lemas.Diccionario;
import com.jacaranda.lemas.LetraException;

class DiccionarioTest {
	static Diccionario target;
	
	@BeforeAll
	static void instanciarTarget() throws Exception {
		target = new Diccionario(); 
	}

	@Test
	void testAddPalabra() throws Exception {
		assertEquals("Añade palabra", target.addPalabra("prueba", "prueba"))
		fail("Not yet implemented");
	}

	@Test
	void testBuscarPalabra() throws Exception {
		fail("Not yet implemented");
	}

	@Test
	void testListadoPalabrasQueEmpiezanPor() throws Exception {
		fail("Not yet implemented");
	}
	
	@Test
	void testBorrarPalabra() throws Exception {
		fail("Not yet implemented");
	}

}

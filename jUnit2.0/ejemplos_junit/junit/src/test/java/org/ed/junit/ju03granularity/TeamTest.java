package org.ed.junit.ju03granularity;

import static org.junit.Assert.*;

import org.junit.Test;


public class TeamTest {
	
	/**
	 * Prueba unitaria para validar que la asignación del nombre del equipo es correcta
	 */
	@Test
	public void testName () {
		Team target = new Team("Real Oviedo");
		assertEquals("Name assignation is correct", target.getName(), "Real Oviedo");		
	}

	/**
	 * Prueba unitaria para validar que el equipo se inicializa sin jugadores
	 */
	@Test
	public void testInitialSize () {
		Team target = new Team("Real Oviedo");
		assertEquals("Initial size is 0",target.totalNumbers(),0);
	}

	/**
	 * Prueba unitaria para validar la asignación de jugadores a un equipo
	 */
	@Test
	public void testTotalNumber () {
		Team target = new Team("Real Oviedo");
		target.addNumber(0);
		target.addNumber(23);
		target.addNumber(42);
		
		assertEquals("Size is 3",target.totalNumbers(),3);
	}
	
	/**
	 * Prueba unitaria para validar que la asignación de posiciones en el equipo es correcta
	 */
	@Test
	public void testNumberAt () {
		Team target = new Team("Real Oviedo");
		target.addNumber(0);
		target.addNumber(23);
		target.addNumber(42);
		
		assertEquals("23 is at position 1",target.numberAt(1), Integer.valueOf(23));
	}

	/**
	 * Prueba unitaria para validar que la eliminación de jugadores es correcta
	 */
	@Test
	public void testRemoveNumber() {
		Team target = new Team("Real Oviedo");
		target.addNumber(-3);
		assertFalse("-3 player number is not present", target.removeNumber(-3));
	}
	
	/**
	 * Prueba que combina disintas pruebas unitarias. Más rápido de implementar pero menos escalable y mantenible
	 */
	@Test
	public void testAllTeam() {
		Team target = new Team("Real Oviedo");
		assertEquals("Name assignation is correct", target.getName(), "Real Oviedo");
		
		assertEquals("Initial size is 0",target.totalNumbers(),0);
		
		target.addNumber(0);
		target.addNumber(23);
		target.addNumber(42);
		
		assertEquals("23 is at position 1",target.numberAt(1),Integer.valueOf(23));
		
		target.addNumber(-3);
		assertFalse("-3 player number is not present", target.removeNumber(-3));
		
		assertEquals("Size is 3",target.totalNumbers(),3);
	}

}

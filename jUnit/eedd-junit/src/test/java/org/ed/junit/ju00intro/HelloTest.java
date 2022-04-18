package org.ed.junit.ju00intro;

import static org.junit.Assert.*;
import org.junit.Test;

public class HelloTest {

	@Test
	public void testSayHello() {
		Hello target = new Hello();
		String expected = "hello";
		String actual = target.sayHello();
		
		//el mensaje es opcional pero nos da información si falla
		assertEquals("Returns hello",expected, actual);
	}

}

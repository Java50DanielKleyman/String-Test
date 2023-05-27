package string_tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTests {

	@Test
	void compareTotest() {
		String str = "Hello";
		assertEquals(0, str.compareTo("Hello"));
	}
	@Test
	void compareToIgnoreCasetest() {
		String str = "Hello";
		assertEquals(0, str.compareToIgnoreCase("Hello"));
	}
	@Test
	void concattest() {
		String str = "Hello";
		assertEquals("HelloWorld!!!", str.concat("World!!!"));
	}
	@Test
	void startsWithtest() {
		String str = "Hello";
		assertTrue(str.startsWith("He"));
		assertFalse(str.startsWith("Hew"));
	}
	@Test
	void endsWithtest() {
		String str = "Hello";
		assertTrue(str.endsWith("llo"));
		assertFalse(str.endsWith("Hew"));
	}
	@Test
	void equalsIgnoreCasetest() {
		String str = "Hello";
		assertTrue(str.equalsIgnoreCase("Hello"));
		assertFalse(str.equalsIgnoreCase("Hew"));
	}
	@Test
	void indexOftest() {
		String str = "Hello";
		assertEquals(4, str.indexOf("o"));		
	}
	@Test
	void lastIndexOftest() {
		String str = "Hello world";
		assertEquals(9, str.lastIndexOf('l'));		
	}
}

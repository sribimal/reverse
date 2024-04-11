package com.bimal;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
	
	@Test
	public void testReverseSimple() {
		ReverseString reverseString = new ReverseString();
		File file = new File("src/test/resources/input_simple.txt");
		Assert.assertEquals("CBA", reverseString.reverse(file));
	}
	
	@Test
	public void testReverseAllText() {
		ReverseString reverseString = new ReverseString();
		File file = new File("src/test/resources/input_all_text.txt");
		StringBuilder actual = new StringBuilder(reverseString.reverse(file));
		Assert.assertNotNull("This is the string to reverse", actual.reverse());
	}
	
	@Test
	public void testReverseAlphaNumeric() {
		ReverseString reverseString = new ReverseString();
		File file = new File("src/test/resources/input_alpha_numeric.txt");
		StringBuilder actual = new StringBuilder(reverseString.reverse(file));
		Assert.assertNotNull("ABC 123 DEF 345", actual.reverse());
	}
	
	@Test
	public void testReverseSpecialChars() {
		ReverseString reverseString = new ReverseString();
		File file = new File("src/test/resources/input_with_symbols.txt");
		StringBuilder actual = new StringBuilder(reverseString.reverse(file));
		Assert.assertNotNull("A B & C * 4 # 6 % 0		tab", actual.reverse());
	}

}

package com.bimal;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
	
	/*
	 * first two test cases are without using the file system. last 4 are using the file system
	*/
	 
	@Test
	public void testReverseAsStringSimple() {
		ReverseString reverseString = new ReverseString();
		Assert.assertEquals("CBA", reverseString.reverse("ABC"));
	}
	
	@Test
	public void testReverseAsStringComplex() {
		ReverseString reverseString = new ReverseString();
		StringBuilder actual = new StringBuilder(reverseString.reverse("A B & C * 4 # 6 % 0		tab"));
		Assert.assertEquals("A B & C * 4 # 6 % 0		tab", actual.reverse().toString());
	}
	
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
		Assert.assertEquals("This is the string to reverse", actual.reverse().toString());
	}
	
	@Test
	public void testReverseAlphaNumeric() {
		ReverseString reverseString = new ReverseString();
		File file = new File("src/test/resources/input_alpha_numeric.txt");
		StringBuilder actual = new StringBuilder(reverseString.reverse(file));
		Assert.assertEquals("ABC 123 DEF 345", actual.reverse().toString());
	}
	
	@Test
	public void testReverseSpecialChars() {
		ReverseString reverseString = new ReverseString();
		File file = new File("src/test/resources/input_with_symbols.txt");
		StringBuilder actual = new StringBuilder(reverseString.reverse(file));
		Assert.assertEquals("A B & C * 4 # 6 % 0		tab", actual.reverse().toString());
	}

}

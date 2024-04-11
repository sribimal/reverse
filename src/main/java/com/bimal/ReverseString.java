package com.bimal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ReverseString {

	//flavor where the content to reverse is in a File. function overloading
	public String reverse(File file) {
		String output = null;
		try {
			InputStream in = new FileInputStream(file);
			String input = new String(in.readAllBytes(), StandardCharsets.US_ASCII);
			output = reverse(input);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}

	//Flavor where we have a plain string from any source. function overloading
	public String reverse(String input) {
		String output = new String();
		char[] chars = input.toCharArray();

		for (char c : chars) {
			output = String.valueOf(c) + output;
		}
		return output;
	}

}

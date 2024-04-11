package com.bimal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ReverseString {
	
	public String reverse(File file) {
		String output = new String();
		try {
			InputStream in = new FileInputStream(file);
			String input = new String(in.readAllBytes(), StandardCharsets.US_ASCII);
			System.out.println(input);
			char[] chars = input.toCharArray();
			
			for (char c : chars) {
				output = String.valueOf(c) + output;
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return output;
	}

}

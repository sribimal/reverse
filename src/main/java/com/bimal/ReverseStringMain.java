package com.bimal;

import java.io.File;

public class ReverseStringMain {

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		//we can expose a rest api to take text as a post body or the path as a param
		File file = new File("src/main/resources/input.txt");
		reverseString.reverse(file);
	}

}

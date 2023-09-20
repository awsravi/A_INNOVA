package com.innovaa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {

		String s1 = "home";
		//String s2 = "renuka";

		// emoh
		//innova reruka

		List<String> lstr = Arrays.asList(s1.split(" "));

		String output = lstr.stream()
				.map(s -> new StringBuilder(s)
				.reverse()).collect(Collectors.joining(" "));
		System.out.println(output);
		
		
	}
}

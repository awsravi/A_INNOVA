package com.innovaa;

import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class KulaReverseStringRemoveSP {
	public static void main(String[] args) {

		String input = "I@love&india";
		//output:Ievolaidni
		String reversedOutput = reverseWords(input);
		System.out.println(reversedOutput);
	}
	//("[a-zA-Z]+");
	public static String reverseWords(String input) {
		Pattern pattern = Pattern.compile("[^a-zA-Z]+");
		String[] words = pattern.split(input);

		String reversedWords = Arrays.stream(words)
				.map(str -> new StringBuilder(str)
						.reverse()
						.toString())
				.collect(Collectors.joining(""));
		return reversedWords;


		
	}
}

package com.innovaa;

public class KulaStringreverseSP {

	public static void main(String[] args) {
		String input = "I@love&india";
		String output = reverseWords(input);

		System.out.println(output);
	}

	public static String reverseWords(String input) {
		String[] words = input.split("[^a-zA-Z]+"); // Split by non-alphabetic characters
		String[] nonWords = input.split("[a-zA-Z]+"); // Split by alphabetic characters

		// Reverse the order of words
		StringBuilder reversedWords = new StringBuilder();
		for (int i = words.length - 1; i >= 0; i--) {
			reversedWords.append(words[i]);
			if (i > 0) {
				reversedWords.append(nonWords[i]);
			}
		}

		return reversedWords.toString();
	}
}

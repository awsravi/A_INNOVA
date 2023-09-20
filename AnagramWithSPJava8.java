package com.innovaa;

import java.util.Arrays;

public class AnagramWithSPJava8 {

	public static void main(String[] args) {
		String str = "mo@#m";
		String target = "mom";

		if (areAnagrams(str, target)) {
			System.out.println(str + " is an anagram of :" + target);
		} else {
			System.out.println(str + " is not an anagram of :" + target);
		}
	}

	// Function to check if two strings are anagrams
	public static boolean areAnagrams(String str1, String str2) {
		// Remove non-alphabetic characters and convert to lowercase
		str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

		// Check if the lengths of the strings are equal
		if (str1.length() != str2.length()) {
			return false;
		}

		// Sort and compare characters in strings
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}
}

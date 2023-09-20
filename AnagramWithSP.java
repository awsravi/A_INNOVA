package com.innovaa;

import java.util.Arrays;

public class AnagramWithSP {
	public static void main(String[] args) {
		String str = "mo@#m";
		String target = "mom";

		if (areAnagrams(str, target)) {
			System.out.println(str + " is anagram :" + target);
		} else {
			System.out.println(str + " not an anagram :" + target);
		}
	}

	// Function to check if two strings are anagrams
	public static boolean areAnagrams(String str1, String str2) {
		// Remove spaces and convert both strings to lowercase
		str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

		// Check if the lengths of the strings are equal
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert strings to character arrays and sort them
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		// Compare sorted arrays
		return Arrays.equals(charArray1, charArray2);
	}
}

package com.innovaa;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnagramCheckjava8 {
	public static boolean isAnagram(String str, String target) {
		// Remove non-alphanumeric characters and convert to lowercase
		String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String cleanedTarget = target.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		// Check if lengths are different
		if (cleanedStr.length() != cleanedTarget.length()) {
			return false;
		}

		// Create frequency maps for characters in both strings
		Map<Character, Long> strFreqMap = cleanedStr.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<Character, Long> targetFreqMap = cleanedTarget.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Compare the frequency maps
		return strFreqMap.equals(targetFreqMap);
	}

	public static void main(String[] args) {
		String str = "mo@#m";
		String target = "mom";

		boolean result = isAnagram(str, target);

		if (result) {
			System.out.println(str + " is an anagram of :" + target);
		} else {
			System.out.println(str + " is not an anagram of :" + target);
		}
	}
}

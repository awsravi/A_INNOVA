package com.innovaa;

import java.util.Arrays;

public class AnagramWithoutSPJava8 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Convert strings to character arrays and sort them using streams
        Character[] charArray1 = str1.chars().sorted().mapToObj(c -> (char) c).toArray(Character[]::new);
        Character[] charArray2 = str2.chars().sorted().mapToObj(c -> (char) c).toArray(Character[]::new);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

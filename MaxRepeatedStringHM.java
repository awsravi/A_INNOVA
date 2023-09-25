package com.innovaa;
import java.util.HashMap;
import java.util.Map;

public class MaxRepeatedStringHM {
    public static void main(String[] args) {
        String[] str1 = {"abbey", "bob", "caley", "caley", "zeeman", "abbey", "bob", "abbey"};
        String[] str2 = {"abbey", "bob", "caley", "caley", "zeeman", "abbey", "bob", "abbey", "caley"};

        String maxRepeatedString = findMaxRepeatedString(str1, str2);
        System.out.println("Maximum repeated string: " + maxRepeatedString);
    }

    public static String findMaxRepeatedString(String[] str1, String[] str2) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of strings in str1
        for (String str : str1) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        // Count the frequency of strings in str2
        for (String str : str2) {
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);
        }

        String maxRepeatedString = null;
        int maxFrequency = 0;

        // Find the string with the maximum frequency
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                maxRepeatedString = entry.getKey();
            }
        }

        return maxRepeatedString;
    }
}

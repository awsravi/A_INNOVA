package com.innovaa;

public class MaxRepeatedString {
    public static void main(String[] args) {
        String[] str1 = {"abbey", "bob", "caley", "caley", "zeeman", "abbey", "bob", "abbey"};
        String[] str2 = {"abbey", "bob", "caley", "caley", "zeeman", "abbey", "bob", "abbey", "caley"};

        String maxRepeatedString = findMaxRepeatedString(str1, str2);
        System.out.println("Maximum repeated string: " + maxRepeatedString);
    }

    public static String findMaxRepeatedString(String[] str1, String[] str2) {
        String maxRepeatedString = null;
        int maxCount = 0;

        for (String s1 : str1) {
            int count = 0;

            for (String s2 : str2) {
                if (s1.equals(s2)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxRepeatedString = s1;
            }
        }

        return maxRepeatedString;
    }
}

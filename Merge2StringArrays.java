package com.awsravi.java19;

import java.util.Arrays;
import java.util.stream.Stream;

public class Merge2StringArrays {
	public static void main(String[] args) {
		String[] str1 = { "abbey", "bob", "caley", "caley", "zeeman", "abbey", "bob", "abbey" };
		String[] str2 = { "abbey", "bob", "caley", "caley", "zeeman", "abbey", "bob", "abbey", "caley" };
		
		//Flatmap use
		String[] mergedArray = Stream.of(str1, str2).flatMap(Arrays::stream).toArray(String[]::new);

		//concat use
		String[] concat=Stream.concat(Arrays.stream(str1),Arrays.stream(str2)).toArray(String[]::new);
		
		//
		for (String str : mergedArray) {
			System.out.print(str + " ");

		}
	}
}
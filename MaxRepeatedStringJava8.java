package com.awsravi.STRINGS;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxRepeatedStringJava8 {
	public static void main(String[] args) {
		String[] str1 = { "abbey", "bob", "caley", "caley", "zeeman", "abbey", "bob", "abbey" };
		String[] str2 = { "abbey", "bob", "caley", "caley", "zeeman", "abbey", "bob", "abbey", "caley" };

	    String[] combined = Stream.concat(Arrays.stream(str1), Arrays.stream(str2))
                .toArray(String[]::new);
	   
		//String[] mergedArray = Stream.of(str1, str2).flatMap(Arrays::stream).toArray(String[]::new);
		
	    Map<String,Long> combicount=Arrays.stream(combined).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	    System.out.println(combicount);
	  
	    Entry<String, Long> maxRep=combicount.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
	    System.out.println(maxRep);
	
	
	
	
	}
}

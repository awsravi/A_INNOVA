package com.innovaa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxRepeatedStringJava81 {
	public static void main(String[] args) {
		String[] str1 = { "abbey", "bob", "caley", "caley", "zeeman", "abbey", "bob", "abbey" };
		String[] str2 = { "abbey", "bob", "caley", "caley", "zeeman", "abbey", "bob", "abbey", "caley" };

		List<String> s1 = Arrays.asList(str1);
		List<String> s2 = Arrays.asList(str2);
		
		
		//Array Concat
		
		String[] concat=Stream.of(str1,str2).flatMap(Arrays::stream).toArray(String[]::new);
		
		for( String merge: concat) {
			System.out.print(merge+" ");
		}
		
		
		Map<String, Long> concatCount=Arrays.stream(concat)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("count "+concatCount);
		
		//find max repeate
				Entry<String, Long> out = concatCount.entrySet().stream()
						.max(Map.Entry.comparingByValue()).get();

				System.out.println("Max repeated String: " + out);
				
				
		//Convert List after 		
		
				
	//======================================================================//			
				
				
		//concat
				List<String> mergestrs = Stream.of(s1, s2).flatMap(List::stream)
						.sorted().collect(Collectors.toList());
				System.out.println("merge :"+mergestrs);
		//count each word
		Map<String, Long> mergecount = mergestrs.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(mergecount);
		
		//find max repeate
		Entry<String, Long> output = mergecount.entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();

		System.out.println("Max repeated String: " + output);

	}
}

package com.demo.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Anagrams1 {
	   public static void main(String[] args) {
	        List<String> input = Arrays.asList("eat", "bat", "tea", "tab", "ate");
	        Map<String, List<String>> groupedAnagrams = input.stream().collect(Collectors.groupingBy(word -> {
	                    char[] chars = word.toCharArray();
	                    Arrays.sort(chars);
	                    return new String(chars); // sorted word as key
	                }
	            ));
	        groupedAnagrams.values().forEach(System.out::println);
	    }
	}

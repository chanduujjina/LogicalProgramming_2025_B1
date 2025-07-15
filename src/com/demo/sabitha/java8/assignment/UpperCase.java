package com.demo.sabitha.java8.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
	
		 public static void main(String[] args) {
		       List<String> name=Arrays.asList("chandu", "cool", "coder");
		       List<String> upperCaseNames=name.stream().map(String::toUpperCase).collect(Collectors.toList());
				
		        System.out.println("Title Case: " + upperCaseNames);
		 }
		 
}

package com.demo.sabitha.java8.assignment;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Removes {
	public static void main(String[] args) {
		String input = "cool coder java 8";
		String result=Arrays.stream(input.split(" ")) .map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println(result);
		
	}
	
}

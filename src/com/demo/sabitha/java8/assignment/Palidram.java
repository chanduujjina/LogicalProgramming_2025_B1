package com.demo.sabitha.java8.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Palidram {
	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 1);
		 boolean isPalindrome = IntStream.range(0, numbers.size() / 2).allMatch(i -> numbers.get(i).equals(numbers.get(numbers.size() - 1 - i)));
		 System.out.println(isPalindrome);
	}

}

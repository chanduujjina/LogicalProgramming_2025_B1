package com.demo.assignment;

import java.util.stream.Collectors;

public class RemoveSpecialChar2 {
	public static void main(String[] args) {
		String input="Java@#21";
		  String result = input.chars().mapToObj(c -> (char) c).filter(Character::isLetterOrDigit).map(String::valueOf).collect(Collectors.joining());
	      System.out.println(result);
	}
	

}

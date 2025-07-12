package com.demo.assignment;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TitleCase2 {
	 public static void main(String[] args) {
	        String name = "hello java";

	        String titleCase = Arrays.stream(name.split(" ")).filter(word -> !word.isEmpty()).map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()).collect(Collectors.joining(" "));
	        System.out.println("Title Case: " + titleCase);
	    }

}

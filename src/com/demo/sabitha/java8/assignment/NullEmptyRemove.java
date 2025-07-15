package com.demo.sabitha.java8.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NullEmptyRemove {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("chandu", "", null, "siva", " ");
		List<String> filteredNames = list.stream().filter(name -> name != null && !name.trim().isEmpty()).collect(Collectors.toList());
		System.out.println(filteredNames);
	}

}

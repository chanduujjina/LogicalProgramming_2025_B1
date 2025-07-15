package com.demo.sabitha.java8.assignment;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfOccurrences {
	public static void main(String[] args) {
		String input="java java spring boot java";
		String[] str=input.split(" ");
		Map<String,Integer> map=new HashMap<>();
		for(String str1:str) {
			map.put(str1,map.getOrDefault(str1,0) + 1);
		}
		System.out.println(map);
	}
	

}

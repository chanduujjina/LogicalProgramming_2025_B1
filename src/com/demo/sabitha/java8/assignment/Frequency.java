package com.demo.sabitha.java8.assignment;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	public static void main(String[] args) {
		String str="banana";
		char[] str1=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(Character char1: str1) {
			map.put(char1,map.getOrDefault(char1,0)+1);
		}
		System.out.println(map);
	}

}

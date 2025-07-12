package com.demo.assignment;

import java.util.HashMap;
import java.util.HashSet;

public class Frequency3 {
	public static void main(String[] args) {
		  String input = "JavaProgramming";
		  char[] split = input.toCharArray();
		  HashMap<Character,Integer> hashMap=new HashMap<>();
		  for(Character c:split) {
			  hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
		  }
		  System.out.println(hashMap);
		}
}

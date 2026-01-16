package com.demo.sabitha.java8.assignment;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class EmptyNullRemove1 {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("chandu", "", null, "siva", " ");
		List<String> list1=new LinkedList<>();
		for(String name:list) {
			if(name!=null&&!name.trim().isEmpty()) {
				list1.add(name);
			}
		}
		System.out.println(list1);
	}
}

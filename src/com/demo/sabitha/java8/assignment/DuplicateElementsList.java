package com.demo.sabitha.java8.assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DuplicateElementsList {
	public static void main(String[] args) {
		List<String> list=new  ArrayList<>();
		list.add("chandu");
		list.add("siva");
		list.add("chandu");
		list.add("raju");
		list.add("raju");
		Collections.sort(list);
		LinkedList<String> linkedList=new LinkedList<>();
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i).equals(list.get(i+1))) {
				linkedList.add(list.get(i));
			}
		}
		System.out.println(linkedList);
	}

}

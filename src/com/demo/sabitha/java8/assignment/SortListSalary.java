package com.demo.sabitha.java8.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListSalary {
	static Employe employe=new Employe();
	public static void main(String[] args) {
		List<Employe> employes=new ArrayList<>();
		employes.add(new Employe(1,"sample",30000D,"female",123456789L,"sample@123"));
		employes.add(new Employe(2,"sample1",40000D,"male",123456789L,"sample1@123"));
		employes.add(new Employe(3,"sample2",20000D,"female",123456789L,"sample2@123"));
		employes.add(new Employe(4,"sample3",10000D,"female",123456789L,"sample3@123"));
		Collections.sort(employes,new Comparator<Employe>() {
			
			public int compare(Employe o1, Employe o2) {
				return Double.compare(o1.getSalary(),o2.getSalary());
			}
		});
		for(Employe a:employes) {
			System.out.println(a.getId()+" "+a.getName()+" "+a.getGeneder()+" "+a.getSalary()+" "+a.getEmail()+" "+a.getPhoneNum());
		}
		
			

			
	}

}

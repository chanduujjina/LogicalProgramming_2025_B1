package com.demo.assignment;

public class MissingNumbers {
	
	public static void main(String[] args) {
		
		int [] Array = new int []{1,2,4,5,6,9};
		
		for(int i=0;i<Array.length-1;i++) {
			if (Array[i+1]!=Array[i]+1) {
				System.out.println(Array[i]+1);
			}
		}
	
	
	}
	}
		
		
	
	
	

	
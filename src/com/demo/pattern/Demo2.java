package com.demo.pattern;

public class Demo2 {
	
	public static void main(String[] args) {
		
		int rows =2;
		int columns = 2;
		
		//number of iteartions = rows*columns
		
		for (int i =1;i<=rows;i++) {//number of iterations 3
			
			for(int j =1;j<=columns;j++) {
				System.out.println("$");
			}
		}
	}

}

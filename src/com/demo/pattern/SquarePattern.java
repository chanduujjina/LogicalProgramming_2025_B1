package com.demo.pattern;

public class SquarePattern {
	
	public static void main(String[] args) {
		
		int length = 4;
		int breadth = 4;
		
		for (int i =1;i<=length;i++) {//1
			for (int j =1;j<=breadth;j++) {//1,2,3,4
				System.out.print("* ");
			}
			System.out.println();//next line
		}
	}

}

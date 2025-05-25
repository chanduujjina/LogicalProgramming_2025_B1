package com.demo.pattern;

public class RightAngleTriangleDemo2 {
	
	public static void main(String[] args) {
		
		int count =1;
		for (int i =1;i<=5;i++) {//1,2,3,4
			for (int j =1;j<=i;j++) {//1,2,3
				System.out.print(count+" ");
				count++;
			}
			System.out.println();//next line
		}
	}

}

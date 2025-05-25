package com.demo.pattern;

public class RightAngleTriangleDemo1 {
	
	public static void main(String[] args) {
		
		for (int i =5;i>=1;i--) {//1,2,3,4
			for (int j =1;j<=i;j++) {//1,2,3
				System.out.print("* ");
			}
			System.out.println();//next line
		}
	}

}

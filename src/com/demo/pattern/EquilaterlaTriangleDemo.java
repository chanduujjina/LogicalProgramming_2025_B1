package com.demo.pattern;

public class EquilaterlaTriangleDemo {
	
	public static void main(String[] args) {
		
		int consoleSize = 160;
		for (int i =1;i<=20;i++) {//1
			for(int j =1;j<=consoleSize/2-i;j++) {
				System.out.print(" ");
			}
			
			for (int k =1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();//to move the cusrsor to nect line
		}
	}

}

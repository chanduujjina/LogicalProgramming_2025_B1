package com.demo.pattern;

public class BorderPattern {
	
	public static void main(String[] args) {
		int row = 4;
		int column = 6;
		
		
		for (int i =1;i<=row;i++) {//i =1,2
			for (int j =1;j<=column;j++) {//1,2,3,4,5,6
				if (i ==1 || i == row || j ==1 || j == column) {//* * * * * *
					                                            //*         *
					                                            //
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();//next line
		}
	}

}

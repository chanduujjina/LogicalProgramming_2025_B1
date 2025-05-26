package com.demo.numberSeries;

public class FactorsofNumbersDemo1 {
	
	public static void main(String[] args) {
		int number = 56;
		
		
		System.out.println("Factors of " + 56 + " are:");
		
		for (int i = 1;i <= 56; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
		
	}

}

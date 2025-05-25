package com.demo.numberSeries;

public class PrimeNumberDemo1 {
	
	public static void main(String[] args) {
		
		int inputNumber = 13;
		
		int count =0;
		for (int i =1;i<=inputNumber;i++) {//1,2
			if (inputNumber%i == 0) {
				count++;//1
			}
		}
		if (count == 2) {
			System.out.println("Given number:"+inputNumber+ " is primeNumber");
		}
	}

}

package com.demo.numberSeries;

public class PrimeNumberDemo1 {
	
	public static void main(String[] args) {
		
	int inputNumber = 19;
	
	int count =0;
	
	for (int i =1;i<=inputNumber;i++) {
		if (inputNumber%i == 0) {
			count++;
		}
	}
	if (count ==2) {
		System.out.println("Given number:"+inputNumber+" is primeNumber");
	}
		}
	}
			
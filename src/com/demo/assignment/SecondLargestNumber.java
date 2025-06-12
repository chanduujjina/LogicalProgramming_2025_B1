package com.demo.assignment;

public class SecondLargestNumber {
	
	public static void main(String[] args) {
		
	  int input = 153;
	  int count = 0;
	  int temp = input;
	 
	  
	  
	  
	  while (temp>0) {
		  temp = temp/10;
		  count++;
		  
		  
		  
	  }
	  temp = input;
	  int sum = 0;
	  
	  while (temp>0) {
		 sum =sum +(int) Math.pow(temp%10,count);
		 temp = temp/10;
		 
	  }
	  if (input == sum) {
		  System.out.println("it is an ArmsStrong");
	  }
	  else {
		  System.out.println("it is not a ArmStrong");
	  }
		
	  System.out.println("count"+count);
	  System.out.println("input"+ input);
		
		
	}

}
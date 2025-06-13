package com.demo.hemanth;

public class assignment_2 {
	
	static int find_no_of_digits(int n)
	{
		int count =0;
		while(n>0)
		{
			n = n/10;         
			count = count + 1;
		}
		return count;
		
		
	}
	
	public static void main(String[] args) {
		
		// 1.Write a program on sum of digits in a number ?
		int number =1234;
		int number_sum = 0;
		while(number>0)
		{
			int temp = number%10;
			number_sum = number_sum + temp;
			number = number/10;
		}
		System.out.println(number_sum);
		// 2.Write a program to find Find Missing Number in Array input : int numberArray = {1,2,4,5}_value
		int array1 [] = {1,2,4,5};
		int first_value = array1[0];
		
		for(int i=0;i<array1.length;i++)
		{
			if (first_value != array1[i])
			{
				System.out.println(first_value);
				break;
			}
			first_value = first_value + 1;	
		}
		
	//	3.Check the given number is ArmStrong number ?	input Number : 153
		int arm_number = 153;
		int m = arm_number;
		int l = find_no_of_digits(arm_number);
		int sum1 = 0;
		while(arm_number>0)
		{
			
			int temp1 = arm_number % 10;
		    sum1 = sum1 + (int) Math.pow(temp1,l);
		    
			arm_number = arm_number/10;
			
		}
		if(sum1 == m)
		{
			System.out.println("It si a armstrong number");
		}
		else
		{
			System.out.println("It is not a armstrong number");
		}
	
	//	4.Find the Second Largest Element in Array ? input : int numberArray = {3,1,7,2}
		int arr1 []  = {3,1,7,2};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j =i;j<arr1.length;j++)
			{
				
				if(arr1[i] < arr1[j])
				{
					int temp_var = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp_var;
					
				}
				
			}
		}
		
		int secondLargestElemnt = arr1[1];
		System.out.println(secondLargestElemnt);
		
		//  5.Find the words in an array start with ch  input : String nameArray = {"chandu","chari","anand","raju"};
		
		String arr2  [] = {"chandu","chari","anand","raju"};
		for(String word : arr2)
		{
			if(word.startsWith("ch"))
			{
				System.out.println(word);
			}			
		}
		
		
	//	6.Find the duplicate elements in array ? input 1 : int numberArray = {1,1,2,2,4,5}			output : 1,2

		int arr [] = {1,1,2,2,4,5};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
				
			}
		}
		
	//	7.Write a program to split number and String in a word ? input : "test 123 test1 234"
		
		String arr3  = "test 123 test 1234";
	    String [] words = arr3.split(" ");
	    
	    for(String word : words)
	    {
	    	if(word.matches(".*[a-z].*"))
	    	{
	    		System.out.println(word);
	    	}
	    	if(word.matches(".*[0-9].*"))
	    	{
	    		System.out.println(word);
	    	}
	    }
	    
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

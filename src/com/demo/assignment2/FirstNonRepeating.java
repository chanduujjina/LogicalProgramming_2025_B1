package com.demo.assignment2;

public class FirstNonRepeating {
	public static void main(String[] args) {
		String name = "swiss";
		for(int i =0;i<name.length();i++) {
			int factorcount =0;
			char ch = name.charAt(i);
			for(int j =0;j<name.length();j++) {
				char ch1 = name.charAt(j);
				
				
				if (ch ==ch1) {
					factorcount++;
					
					
				}
			}
			if (factorcount ==1) {
				System.out.println(ch);
			}
		}
	}
}
	

	
	



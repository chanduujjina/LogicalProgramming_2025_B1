package com.demo.assignment2;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		
			
			String name = "Cherry";
			String Vowel = "";
			String Consonants ="";
			
			for (int i = 0;i<name.length();i++) {
				char ch = name.charAt(i);
				if (ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u') {
					Vowel+=ch;
					
				}
				else {
					Consonants+=ch;
					
				}
				
			}
			System.out.println("Vowels "+ Vowel );
			System.out.println("Consonants "+Consonants);
		
	
		
	}
}
	
	
	



package com.demo.assignment;

public class RemoveSpecialChar {
	public static void main(String[] args) {
		String str="Java@#21";
		String result="";
		for(int i=0;i<str.length();i++) {
			if(Character.isAlphabetic(str.charAt(i))||Character.isDigit(str.charAt(i))) {
				result+=str.charAt(i);
			}
		}
		System.out.println(result);
		
	}
	

}

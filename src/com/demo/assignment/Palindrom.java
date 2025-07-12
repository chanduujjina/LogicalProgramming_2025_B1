package com.demo.assignment;

public class Palindrom {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer(151);
		StringBuffer reverse = s.reverse();
		if(s==reverse) {
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("notPalindrom");
		}
	}

}

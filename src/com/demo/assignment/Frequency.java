package com.demo.assignment;

public class Frequency {
	public static void main(String[] args) {
		String str="JavaProgramming";
		for(int i=0;i<str.length();i++) {
			int fc=0,fc2=0;
			for(int j=i;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					fc++;
				}
			}
			for(int j=0;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					fc2++;
				}
			}
			if(fc==fc2)
				System.out.println(str.charAt(i)+"-> "+fc);
		}
		
}

}

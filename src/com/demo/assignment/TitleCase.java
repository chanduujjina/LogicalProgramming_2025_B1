package com.demo.assignment;


public class TitleCase {
	public static void main(String[] args) {
		 String str="hello java";
		 String[] str1=str.split(" ");
		 String result="";
		 for(String i:str1) {
			 for(int j=0;j<i.length();j++) {
				 String upperCase="";
				 if(j==0) {
					 String sub=i.substring(0,1);
					 upperCase= sub.toUpperCase();
					 result+=" "+upperCase;
				 }
				 else {
					 result+=i.charAt(j);
				 }
		 }
		
	}
	System.out.println(result.trim());
			
	}

}

package com.demo.sabitha.assinment3;
public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
	String str="swiss";
	String str1="";
	for(int i=str.length()-1;i>=0;i--) {
		char ch=str.charAt(i);
		int count=0;
		for(int j=i;j>=0;j--) {
			char ch1=str.charAt(j);
			if(ch==ch1) 
				count++;
		}
		if(count==1)
			str1+=ch;
	}
	for(int i=str1.length()-1;i>=0;i--) 
			System.out.print(str1.charAt(i));
	}
	
}

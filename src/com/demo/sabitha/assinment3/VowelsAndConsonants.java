package com.demo.sabitha.assinment3;
public class VowelsAndConsonants {
	public static void main(String[] args) {
		String str="Programming";
		new VowelsAndConsonants().VowCon(str);
		new VowelsAndConsonants().VowCon1(str);
		
	}
	public void VowCon(String Str) {
		String str1="";
		String str2="";
		for(int i=0;i<Str.length();i++) {
			char ch=Str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				str1+=" "+ch;
			}
			else
				str2+=" "+ch;
		}
		System.out.println("It is the Vowels in a string "+str1);
		System.out.println("It is the Consonants in a string "+str2);
	}
	//other way to find vowels to convert total string in any lower or upper case
	public void VowCon1(String Str) {
		Str=Str.toLowerCase();
		String str1="";
		String str2="";
		for(int i=0;i<Str.length();i++) {
			char ch=Str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				str1+=" "+ch;
			}
			else
				str2+=" "+ch;
		}
		System.out.println("It is the Vowels in a string "+str1);
		System.out.println("It is the Consonants in a string "+str2);
	}

}

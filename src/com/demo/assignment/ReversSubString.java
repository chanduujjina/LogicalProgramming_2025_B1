package com.demo.assignment;

public class ReversSubString {
	public static void main(String[] args) {
		String str="Hello World!";
		String[] split = str.split(" ");		
		for(String a:split) {
			StringBuffer buffer=new StringBuffer();
			buffer.append(a);
			System.out.print(buffer.reverse()+" ");
		}
		
	}

}

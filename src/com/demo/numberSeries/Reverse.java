package com.demo.numberSeries;

public class Reverse {
	public static void main(String args[])
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int a=s.nextInt();
		int t=a;
		int rev=0;
		while(t>0)
		{
			int x=t%10;
			rev=rev*10+x;
			t=t/10;
		}
		System.out.print(rev);
	}

}

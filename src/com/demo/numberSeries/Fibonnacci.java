package com.demo.numberSeries;

public class Fibonnacci {
	public static void main(String args[])
	{
		java.util.Scanner s=new java.util.Scanner(System.in);
		int a=s.nextInt();
		int x=0;
		int y=1;
		while(x<=a)
		{
			System.out.print(x+" ");
			int c=x+y;
			x=y;
			y=c;
			
		}
	}

}

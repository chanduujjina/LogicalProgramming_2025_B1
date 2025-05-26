package com.demo.numberSeries;

public class Factoral2 {
		static java.util.Scanner s=new java.util.Scanner(System.in);
		double pow=1;
		double m1(double a)
		{
			for(int i=1;i<=a;i++)
			{
				pow=pow*i;
			}
			return pow;
		}
		public static void main(String args[])
		{
			double a=s.nextDouble();
			Factoral2 f=new Factoral2();
			System.out.print(f.m1(a));
		}
}


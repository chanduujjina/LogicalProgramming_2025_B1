package com.demo.sabitha.assinment3;
public class PrimeNumbers {
	public static void main(String[] args) {
		new PrimeNumbers().Prime(100);
	}
	public void Prime(int a) {
		System.out.println("prime number are ");
		for(int i=2;i<=a;i++) {
			int Factcount=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					Factcount++;
				}
			}
			if(Factcount==0)
				System.out.print(i+" ");
		}
		
	}

}


package com.demo.assignment2;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
		int array[] = new int[3];
		int count =0;
		for(int i=0;i<arr.length;i++) {
			int factorcount=0;
			for(int j=0;j<arr.length;j++) {
				if (arr[i]==arr[j]) {
					factorcount++;
					
				
				}
			}
			if (factorcount==1) {
				array[count++]=arr[i];
				
			}
		}
		arr=array;
		for(int x:arr) {
			System.out.println(x);
		}
	}
}
	
	


	
	



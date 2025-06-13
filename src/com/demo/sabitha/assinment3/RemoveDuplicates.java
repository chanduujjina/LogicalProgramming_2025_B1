package com.demo.sabitha.assinment3;
public class RemoveDuplicates {
	public static void main(String[] args) {
		int [] arr=new int[] {1, 2, 2, 3, 4, 4, 5};
		int count1=0;
		new RemoveDuplicates().RemoveDArrya(arr, count1);
	}
	public void RemoveDArrya(int arr[],int count1) {
		int [] arr1=new int[3];
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count==1)
				arr1[count1++]=arr[i];
			
		}
		for(int x:arr1) {
			System.out.print(x+" ");
		}
	}
	
}


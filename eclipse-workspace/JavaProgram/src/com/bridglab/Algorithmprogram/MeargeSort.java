package com.bridglab.Algorithmprogram;

import com.bridglab.utility.Utillity;

public class MeargeSort {
  
	public static void main(String args[]) {
		System.out.println("Enter the size");
		int num = Utillity.sc.nextInt();
		String[]str = new String[num];
		System.out.println("Enter the String");
		for(int i=0 ; i<str.length-1 ; i++) {
			str[i] = Utillity.sc.next();
		}
		sort(str);
	}
	public static void sort(String []arr) {
		int i,j;
		int size = arr.length;

		
		for(i=0;i<size/2;i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");
		for(j=size/2;j<size;j++) {
			System.out.print(arr[j]);
		}
		
	}
	
}

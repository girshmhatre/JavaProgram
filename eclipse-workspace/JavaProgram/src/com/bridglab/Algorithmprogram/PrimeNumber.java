package com.bridglab.Algorithmprogram;

import com.bridglab.utility.Utillity;

public class PrimeNumber {
   public static void main(String args[]) {
	   int num = 1000;
	   int arr[] = Utillity.primeNo(num);
	   for(int i=0 ; i<arr.length ; i++ ) {
		   System.out.println(arr[i]);
	   }
	   int arr3[] = Utillity.mPlindrom(arr);
	   	System.out.println("Palindrom");
	   for(int q=0 ; q<arr3.length;q++) {
		   System.out.print(arr3[q]);
	}
	   
   }
    
 }


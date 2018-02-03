package com.bridglab.Algorithmprogram;

import com.bridglab.utility.Utillity;

public class PrimeNumber {
   public static void main(String args[]) {
	   int num = 1000;
	   int arr[] = Utillity.primeNo(num);
	   for(int i=0 ; i<arr.length ; i++ ) {
		   System.out.print(" "+arr[i]);
	   }
	   System.out.println(" ");
	   System.out.println("Palindrom");
	   for(int i=0 ; i<arr.length ; i++ ) {
		   if(Utillity.mPlindrom(arr[i])) {
			   System.out.print(" "+arr[i]);
	 }
		   
	   }
	}
	   
   }
    



package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class Harmonic {
	 public static void main(String args[]){
		  int n;
			System.out.println("Enter the Number");
			  n = Utillity.sc.nextInt();
		  float sum=0;	
		  System.out.print("Harmonic Series:");
			for(int i=1 ; i<=n ; i++){
			System.out.print(" 1/"+i+" + ");
			sum = sum +(1/(float)i);
		        }
		  System.out.println("="+ sum);
		}

}
 
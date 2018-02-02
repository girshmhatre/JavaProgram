package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class PrimFact {
	public static void main(String args[]){
		  int n;
		  int m = 1;
		  System.out.println("Enter the Number");
		  n = Utillity.sc.nextInt();
		  if(0<=n && n<31){
		  for(int i=1 ; i<=n ; i++){
		 	m = 2*m;
		     System.out.println("2^"+i+"="+m);
			}
		}
		}
}

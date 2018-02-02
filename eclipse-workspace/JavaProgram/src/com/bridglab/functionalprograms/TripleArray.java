package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class TripleArray {
	public static void main(String args[]) {
		int i,j,k;
		int sum =0,n;
		int count=0;
		System.out.println("Enter the array size");
		n= Utillity.sc.nextInt();
		int array[] =  new int[n];
		System.out.println("Enter the Element");
		for(i=0;i<n;i++) {
			array[i] = Utillity.sc.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				for(k=j+1;k<n ;k++) {
					sum = array[i]+array[j]+array[k];
				if(sum==0) {
			      System.out.println(""+i+""+j+""+k);
			      count++;
				}
		}
		
	}
		}
		System.out.println("the distinct"+count);
}

}
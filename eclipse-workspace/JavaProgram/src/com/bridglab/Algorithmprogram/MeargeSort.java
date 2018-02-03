package com.bridglab.Algorithmprogram;

import com.bridglab.utility.Utillity;

public class MeargeSort {
  
	public static void main(String args[]) {
		System.out.println("Enter the size");
		int num = Utillity.sc.nextInt();
		int[]str = new int[num];
		int i;
		System.out.println("Enter the String");
		for( i=0 ; i<str.length-1 ; i++) {
			str[i] = Utillity.sc.nextInt();
		}
	    sort(str,0,num);
	
	    for( i=0 ; i<num ; i++) 
	    {
	    	

	    	System.out.println(str[i]);
	    }
	}
	private static void sort(int[] str, int lo, int hi) {
		int n = lo-hi;
		if(n<=1) {
			return;
		}
		int mid=(hi-lo)/2;
		sort(str,lo,mid);
		sort(str,mid,hi); 
		int i=lo;
		int j=mid;
		int[]temp = new int[hi];
		for(int k = 0 ; k<n ; k++) {
			if(i==mid) 
				temp[k]=str[j++];
			else if(j==hi)
				temp[k]=str[i++];
			else if(str[j]<str[i])
				temp[k]=str[j++];
			else
				temp[k]=str[i++];

		}
	
		for(int k=0 ; k<n ; k++ ) {
			str[lo+k]=temp[k];
		}
		
	}
	
	
		
	}
	


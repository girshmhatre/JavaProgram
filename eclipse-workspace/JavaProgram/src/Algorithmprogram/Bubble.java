package Algorithmprogram;

import com.bridglab.utility.Utillity;

public class Bubble {
	public static void main(String args[]) {
		System.out.println("enter the arra size");
		int n = Utillity.sc.nextInt();
		int array[] = new int[n];
	    System.out.println("Enter the element ");
	    for(int i=0 ; i<n ; i++) {
	    	array[i] = Utillity.sc.nextInt();
	    }
	    System.out.println("sorted array");
	    int array2[] = Utillity.mBubblesort(array);
	    for(int j=0 ;j<array2.length ; j++) {
	    	System.out.print(array2[j]);
	    }
	}

}

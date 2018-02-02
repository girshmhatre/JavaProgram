package com.bridglab.Algorithmprogram;

import com.bridglab.utility.Utillity;

public class Elapsedtimesort {
	public static void main(String args[]) {
		int n;
		int j=0;
		System.out.println("enter the size");
		n = Utillity.sc.nextInt();
		int arr[] = new int[n];
		double[] e =new double[6];
		System.out.println("Enter the Element for sorting and Searching");
		for(int i = 0 ; i<n ; i++) {
			arr[i]=Utillity.sc.nextInt();
		}
		String []str =new String[n];
		System.out.println("Enter the String for sorting and Searching");
		for(int i = 0 ; i<n ; i++) {
			str[i]=Utillity.sc.next();
		}
			System.out.println("----------------------------------");
			long start = System.nanoTime();
			System.out.println("Binary Search for Integer");
			int []arr2 = Utillity.mBubblesort(arr);
			System.out.println("Enter the element want u search");
			int key = Utillity.sc.nextInt();
			System.out.println(Utillity.mBinarySe(arr2,key));
			long end = System.nanoTime();
			double e2 =+Utillity.getElapse(start,end);
			System.out.println("Require time"+e2);
            e[j++] = e2;		
            System.out.println("----------------------------------");
		
			long start1 = System.nanoTime();
			System.out.println("Binary Search for String");
			String[]arr3 = Utillity.mInsert(str);
			System.out.println("Enter the String want u search");
			String key2 = Utillity.sc.next();
			System.out.println(Utillity. mBinaryString(arr3,key2));
			long end1 =  System.nanoTime();
			double e1 =+Utillity.getElapse(start1,end1);
			System.out.println("Require time"+e1);
            e[j++] = e1;		
            System.out.println("----------------------------------");
            
            long start6 =System.nanoTime();
			System.out.println("Insertion Sort for integer");
			int []arr6 = Utillity.mInsertInt(arr);
			for( int k= 0 ; k<arr6.length ; k++) {
				System.out.println(arr6[k]);
			}
			long end6 =  System.nanoTime();
			double e6 =+Utillity.getElapse(start6,end6);
			System.out.println("Require time"+e6);
            e[j++] = e6;		
            System.out.println("----------------------------------");
			
            
			long start2 = System.nanoTime();
			System.out.println("Insertion Sort for String");
			String[]arr4 = Utillity.mInsert(str);
			for( int k= 0 ; k<arr4.length ; k++) {
				System.out.println(arr4[k]);
			}
			long end2 =  System.nanoTime();
			double e3 =+Utillity.getElapse(start2,end2);
			System.out.println("Require time"+e3);
            e[j++] = e3;		
            System.out.println("----------------------------------");
            
			
			long start3 = System.nanoTime();
			System.out.println("Bubble sort for Integer");
			int []arr5 = Utillity.mBubblesort(arr);
			for( int k= 0 ; k<arr5.length ; k++) {
				System.out.println(arr5[k]);
			}
			long end3 = System.nanoTime();
			double e4 =+Utillity.getElapse(start3,end3);
			System.out.println("Require time"+e4);
            e[j++] = e4;		
            System.out.println("----------------------------------");
			
            
            long start4 = System.nanoTime();
			System.out.println("Bubble sort for String");
			String []arr7 = Utillity.mBubblesortString(str);
			for( int k= 0 ; k<arr7.length ; k++) {
				System.out.println(arr7[k]);
			}
			long end4 =  System.nanoTime();
			double e5 =+Utillity.getElapse(start4,end4);
			System.out.println("Require time"+e5);
            e[j++] = e5;		
            System.out.println("----------------------------------");
			
            System.out.println("elapsed time performance in ascending order\n");
            double [] e7 = Utillity.mBubblesort1(e);
			for( j = 0 ; j<e.length ; j++) {
				System.out.println(+e7[j]);
			}
			
			 System.out.println("elapsed time performance in dsescending order\n");
				for( j = e.length-1 ; j>=0 ; j--) {
					System.out.println(+e7[j]);
				}
				
	}

}

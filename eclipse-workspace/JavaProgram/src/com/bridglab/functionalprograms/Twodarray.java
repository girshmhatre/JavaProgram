package com.bridglab.functionalprograms;

import java.io.PrintWriter;

import com.bridglab.utility.Utillity;

public class Twodarray {
	public static void main(String args[]) {
		int m,n;
		int i , j;
		
		System.out.println("enter the value of m");
		m = Utillity.sc.nextInt();
		System.out.println("enter the value of n");
		n = Utillity.sc.nextInt();
		PrintWriter writer = new PrintWriter(System.out); 
		int arr[][] = new int[m][n];
		double arr1[][] = new double[m][n];
		boolean arr2[][] = new boolean[m][n];	
		
		writer.write("enter your choice");
		writer.flush();
		int choice = Utillity.sc.nextInt();
		
		switch(choice) {
		
		case 1 :
		 writer.write("Integer Array");
		 writer.flush();
		 writer.write("Enter the element");
			writer.flush();
			for( i=0 ; i<m ;i++) {
			for( j=0 ; j<n ; j++) {
				
				arr[i][j] = Utillity.sc.nextInt();
			}
		}
		writer.println("Integer array is");
		for( i=0 ; i<m ; i++) {
			for(j=0 ; j<n ; j++ ) {
				int iArray = arr[i][j];
				
				writer.write(String.valueOf(iArray)+"");
				writer.flush();
			}
			writer.println();
			writer.flush();
		      		
			}
		break;
		case 2 :
			 writer.write("double Array");
			 writer.flush();
			 writer.write("Enter the element");
				writer.flush();
				for( i=0 ; i<m ;i++) {
				for( j=0 ; j<n ; j++) {
					
					arr1[i][j] = Utillity.sc.nextDouble();
				}
			}
			writer.println("Integer array is");
			for( i=0 ; i<m ; i++) {
				for(j=0 ; j<n ; j++ ) {
					double iArray = arr1[i][j];
					
					writer.write(String.valueOf(iArray)+"");
					writer.flush();
				}
				writer.println();
				writer.flush();
			      		
				}
			break;
		case 3 :
			 writer.write("boolean Array");
			// writer.println();
			 writer.flush();
			 writer.write("Enter the element");
				writer.flush();
				for( i=0 ; i<m ;i++) {
				for( j=0 ; j<n ; j++) {
					
					arr2[i][j] = Utillity.sc.nextBoolean();
				}
			}
			writer.println("Integer array is");
			for( i=0 ; i<m ; i++) {
				for(j=0 ; j<n ; j++ ) {
	
					
					writer.write(arr2[i][j]+"");
					writer.flush();
				}
				writer.println();
				writer.flush();
			      		
				}
			break;
			default : writer.write("invalid choice");
			  		  writer.flush();
			  		  writer.close();
		
		
		}
		
	}

}

package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class Coupon {
	 static int num;
	 public static void main (String args[]){
		  System.out.println("Enter the how many no u want distnict");
		   num = Utillity.sc.nextInt();
		   mRandInt();
	 }
	public static int mRandom(){
	 		
		int   randno =  (int) (Math.random() * 100 + 1);
		 System.out.print(" "+randno);
		return randno;    
 
		}
			public static boolean contains(int[] arr, int item)
	{
		for (int n : arr)
		{
			if (item == n) 
			{
				return true;
			}
		}
		return false;
	}
		
		  public static void mRandInt() {
		   int size = num*2;
		   int count=0;
		   int i=0;
		   int arr[] = new int [size];	
			      
		   for(int k=0 ; k<size ; k++) {
			   int random = (int) mRandom();
			     count++;
			   if(contains(arr,random)) {
				   break;
			   }  
			   else {
				   arr[i]=random;
			   }
			   if(arr.length==num)
			   {
				   System.out.println("distnict");
				   for(int j=0;j<arr.length;j++) {
					   System.out.print(" "+arr[j]);
					   }				   
			   }
			  
		   }
		   System.out.print("count"+count);		
		 }
	}
	



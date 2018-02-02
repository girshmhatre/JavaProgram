package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class Coupon {
	/*public static int[] mRandom(int num){
	 int []randno = 
		   int p=0;
		 for(int i=0 ; i<num ; i++){
		   randno[p++] =  (int) (Math.random() * 100 + 1);
		    
		  }
  return randno;
		   
		}*/
		 public static void main(String args[]){
		   int num;
		   int count=0;
		   System.out.println("Enter the Number");
		   num = Utillity.sc.nextInt();
		   int arr[] = new int [num];
		   int j=0;
		  
		  
		   for(int i=0 ; i<num ; i++){
			   arr[j++] = (int) (Math.random() * 100 + 1);
			      count++;
			    for(int k=i+1 ; k<arr.length; k++) {
				   if(arr[j]==arr[k]) {
					   break; 
				   }
					   System.out.println("distnict");
					   for(j=0;j<arr.length;j++)
					   System.out.println(arr[j]);
				   
	
			   }
			    System.out.println("distnict");
				   //for(j=0;j<arr.length;j++)
				   System.out.println(arr[j]);
		   }
		   System.out.println("count="+count);
		    
		}
}



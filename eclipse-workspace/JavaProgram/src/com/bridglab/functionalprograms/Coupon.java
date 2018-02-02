package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class Coupon {
	public static int mRandom(){
	 		
		int   randno =  (int) (Math.random() * 100 + 1);
		 System.out.println(" "+randno);
		return randno;    
 
		}
		 public static void main(String args[]){
		   int num;
		   int count=0;
		   System.out.println("Enter the Number");
		   num = Utillity.sc.nextInt();
		   int no=0;
		   int arr[] = new int [num];
		   int j=0;
		   for(int i=0 ; i<num ; i++){
			      count++;
			      no = mRandom();
			      for(int k=0 ; k<=i ; k++) {
				   
			    	  if(no==arr[i]) {
					   break; 
			    	  }   
			    	  
			      }
			      arr[i]=no;  
				   
		   }
					   System.out.print("distnict");
					   for(j=0;j<arr.length;j++) {
					   System.out.print(" "+arr[j]);
					   }				   
	
			   
		 System.out.print("count"+count);
		 }			 
		}





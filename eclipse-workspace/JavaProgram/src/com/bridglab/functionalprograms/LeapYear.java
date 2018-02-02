package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class LeapYear {
	 public static void main(String args[]){
		 	int year ;
		 	System.out.println("Enter the Year");
			  year = Utillity.sc.nextInt();
		 	if(Integer. toString(year).length() == 4){
		   	if(year%4 == 0 || year%400 ==0 && year%100 != 0){
		     	   System.out.println(year+" Is leap year");
		     	}
		 	else{
		         System.out.println(year+" Is not leap year");
		        }
			}
			else{
		  	 System.out.println("Invalid year");
		}
		}

}

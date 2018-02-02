package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class Flip {
	 public static void main(String args[]){
		  int time;
		  int count1 = 0;
		  int count2 = 0;
		  System.out.println("how many times to flip coin");
		  time = Utillity.sc.nextInt();
		if(time >= 0){
		  for(int i = 0 ; i < time ; i++)
		   {
		 	System.out.println(Math.random());
		   if(Math.random() < 0.5){
		 	System.out.println("head");
			count1++;
			}
		   else{
			System.out.println("tail");
			count2++;
		  }
		}
		}
		int head = (count1 * 100)/time;
		int tail = (count2 * 100)/time;
		System.out.println(head+"% vs "+tail+"%");
		}

}

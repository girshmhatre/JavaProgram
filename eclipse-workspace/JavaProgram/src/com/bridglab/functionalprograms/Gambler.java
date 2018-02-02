package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class Gambler {
	public static void main(String args[]){
		System.out.println("Enter the Stake");
		   int stake  = Utillity.sc.nextInt();
		
		   System.out.println("Enter the Goal");
		   int goal = Utillity.sc.nextInt();
		
		   System.out.println("Enter the Times");
		   int times  = Utillity.sc.nextInt();
		   int won = 0,loss = 0;
		   int beat = 0;
		  

		   for(int i=0 ; i<times ; i++){
		   	 int cash = stake;
		   	 while(cash>0 && cash<goal) {
		   		 beat++;
		    	 if(Math.random()<0.5){
		     	 cash++;
		     	}
		   	 else{
		   	 cash--;
		   	 }
			}

		 if (cash==goal){
		 won++;
		 }
		 
		 loss = times-won; 
		}
		System.out.println("wins"+won);
		System.out.println("loss"+loss);
		System.out.println("Beat"+beat);
		 int wins = (won*100)/times;
		 int los =(loss*100)/times;
		System.out.println(wins+"% vs "+los+"%");
		}

}

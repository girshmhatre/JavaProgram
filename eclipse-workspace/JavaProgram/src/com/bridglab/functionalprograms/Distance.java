package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class Distance {
	public static void main(String args[]) {
		 System.out.println("enter the value of x");
		 int x = Utillity.sc.nextInt();
		 System.out.println("enter the value of y");
		 int y = Utillity.sc.nextInt();
		 double distance = Math.sqrt(x*x+y*y);
		 System.out.println("("+x+","+y+") to(0,0)"+distance);		 
	}

}

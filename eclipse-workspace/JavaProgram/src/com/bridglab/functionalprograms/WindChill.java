package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class WindChill{
	public static void main(String args[]) {
	 System.out.println("enter the Temperature");
	 double t = Utillity.sc.nextDouble();
	 System.out.println("enter the Speed");
	 double v = Utillity.sc.nextDouble();
	 double w = 35.74 + 0.6215*t + (0.4275*t + 35.75)*Math.pow(v, 0.16);
	 System.out.println("Wind Chill"+w);
}
	
}

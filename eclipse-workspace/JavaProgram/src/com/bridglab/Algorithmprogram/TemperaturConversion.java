package com.bridglab.Algorithmprogram;

import com.bridglab.utility.Utillity;

public class TemperaturConversion {
	public static void main (String arg[]) {
		System.out.println("Enter tempreature ");
		double f = Utillity.sc.nextDouble();
		double c = (f-32)*5/9;
		System.out.println("Fahrenheit"+f+"="+c+"Celsius");
		 f =  (c*9/5)+32;
		 System.out.println("Celsius"+c+"="+f+"Fahrenheit"); 
	}
}

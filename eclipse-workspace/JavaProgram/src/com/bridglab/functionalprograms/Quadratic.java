package com.bridglab.functionalprograms;
import com.bridglab.utility.Utillity;

public class Quadratic {
	public static void main(String args[]) {
		System.out.println("enter the value of a");
		int a = Utillity.sc.nextInt();
		System.out.println("enter the value of b");
		int b = Utillity.sc.nextInt();
		System.out.println("enter the value of c");
		int c = Utillity.sc.nextInt();
		
	int delta = b*b-4*a*c;
	System.out.println("Delta = "+delta);
	if(delta>0) {
		System.out.println("Root are real and unequal");
		double root1 = (-b+Math.sqrt(delta))/(2*a);
		double root2 = (-b-Math.sqrt(delta))/(2*a);
		System.out.println("First Root are = "+root1);
		System.out.println("Second Root are = "+root2);
	}
	else if(delta == 0) {
		 System.out.println("Root are real and equal");
		 double root1 = (-b+Math.sqrt(delta))/(2*a); 
		 System.out.println("Root are = "+root1);
	}
	else {
		System.out.println("Root are imaginary");
		
	}
	}

}

package Algorithmprogram;

import com.bridglab.utility.Utillity;

public class Sqrt {
	public static void main(String args[]) {
		System.out.println("Enter the value of t ");
		double c = Utillity.sc.nextDouble();
		double t=c;
		double epsilon = 1e-15;
		t=(c/t+t)/2;
		while(Math.abs(t-c/t) > epsilon*t) {
			t=(c/t+t)/2;
			
		}
		System.out.println(t);
	}

}

package com.bridglab.Algorithmprogram;



import com.bridglab.utility.Utillity;

public class Monthlypayment {
 public static void main (String args[]) {
	 System.out.println("enter the loan amount");
	 int  loan = Utillity.sc.nextInt();
	 System.out.println("enter the year");
	 int  year = Utillity.sc.nextInt();
	 System.out.println("Enter the interest");
	 int rate = Utillity.sc.nextInt();
	 double payment = Utillity.monthlyPayment(loan,rate,year);
	 System.out.println("Payment="+payment);
 }
}

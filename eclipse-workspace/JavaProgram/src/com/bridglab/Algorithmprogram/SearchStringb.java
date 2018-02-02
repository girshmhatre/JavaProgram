package com.bridglab.Algorithmprogram;

import com.bridglab.utility.Utillity;

public class SearchStringb {
	public static void main(String args[]) {
		System.out.println("enter the size");
			int n = Utillity.sc.nextInt();
			String [] str1 = new String[n];
			System.out.println("enter the string");
			for(int i=0 ; i<n; i++) {
			str1[i] = Utillity.sc.next();
			}
			System.out.println("Enter a string want you search");
             String key = Utillity.sc.next();
             
             System.out.println(Utillity.mBinaryString(str1,key));

}
}

package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class Permutation {
	public static void main(String args[]) {
		System.out.println("enter the String");
		String str = Utillity.sc.next();
		
		permuta(str,0,str.length()-1);
	}

	private static void permuta(String str, int i, int length) {
		if(i==length) {
			System.out.println(str);
		}
		else {
			   System.out.println("before swap"+str);
			for(int p=i ; p<=length ; p++) {
		    swap(str ,i,length);
		    System.out.println("after swap"+str);
			permuta(str,i+1,length);
		}

		}
	}

	private static String swap(String str, int j, int k) {
		char [] arr = str.toCharArray();
		char temp;
		temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
		 return String.valueOf(arr);
	}
}

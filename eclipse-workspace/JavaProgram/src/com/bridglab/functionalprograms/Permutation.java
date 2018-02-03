package com.bridglab.functionalprograms;

import com.bridglab.utility.Utillity;

public class Permutation {
	public static void main(String args[]) {
		System.out.println("enter the String");
		String str = Utillity.sc.next();
		char [] arr = str.toCharArray();
		permuta(arr,0);
	}

	private static void permuta(char[] str, int k) {
		
		if(str.length==k) {
		for(int i=0 ; i<str.length-1; i++){
			System.out.println(str);
			}
			System.out.println();
		}
		else {
			
			char temp;
			for(int i=0 ; i<str.length-1; i++) {
			
			temp = str[k];
			str[k] = str[i];
			str[i] = temp;
			
			permuta(str,k+1);
			
			/*temp = str[k];
			str[k] = str[i];
			str[i] = temp;*/

		}
	}

}
}
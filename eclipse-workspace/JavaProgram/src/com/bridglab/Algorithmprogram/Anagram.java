package com.bridglab.Algorithmprogram;

import com.bridglab.utility.Utillity;

public class Anagram {
	public static String mAnagram(String strr1,String strr2) { 
		int len1 = strr1.length();
		int len2 = strr2.length();
		int len = 0;
		int found = 0;
		String mAngr = "Strings are anagram";
		String nAngr = "Strings are not anagram";
		if(len1==len2) {
			len=len1;
		for(int i=0 ; i<len ; i++) {
		 for(int j=0 ; j<len ; j++) {	
			 if(strr1.charAt(i) == strr2.charAt(j)) {
				 found = 1; 
				 break;
			 }
		 }
		}
		}
		if(found==1) {
			return mAngr;
		}
		else
		{
			return nAngr;
		}
			
}

	public static void main(String args[]) {
		System.out.println("Enter the 1st String");
		String str1 = Utillity.sc.next();
		System.out.println("Enter the 2nd String");
		String str2 = Utillity.sc.next();
		System.out.println(mAnagram(str1,str2));
	}
}
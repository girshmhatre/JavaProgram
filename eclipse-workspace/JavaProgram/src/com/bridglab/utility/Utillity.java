package com.bridglab.utility;

import java.util.Scanner;

public class Utillity {
	public static Scanner sc = new Scanner(System.in);
// calculate prime number
public static int[] primeNo(int num) {
	 int count;
	   int[] arr=new int[168];
	   int p=0;
	   for(int i=2;i<=num;i++) {
		   count=0;
		   for(int j=2; j<=i/2 ; j++) {
			   if(i%j==0) {
				   count++;
			   }  
		   }
			   if (count == 0) {
				arr[p++] = i;   
			   }		   
	   }
	   return arr;
	   
	
}
//calculate the Day of Week
public static int mDayofWeek(int y,int m,int d) {
	int y1 = 0,m1,d1,x;
	y1 = y - (14 - m) / 12;
	x = y1 + y1/4 -y1/100 + y1/400;
	m1 = m + 12 * ((14 - m) / 12) - 2;
    d1 = (d+ x + 31*m1 / 12) % 7;
	return d1;
	
}
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

public static double mSqrt(double t,double c,double e) {
	t=(c/t+t)/2;
	while(Math.abs(t-c/t) > e*t) {
		t=(c/t+t)/2;	
	}
	return t;
}

public static double mTempFahrToCel(double f) {
	double c = 0; 
	 c = (f-32)*5/9;
	 return c;
}
public static double mTempCelToFahr(double c) {
	double f = 0; 
	 f =  (c*9/5)+32;
	return f;
}
public static  int[]  mBinary(int num){
 int i = 0;
 int[] mBinary = new int[8];
 while(num>0) {
	 mBinary[i++] = num%2;
	 num = num/2;
 }
 
  return mBinary;
}
public static int[] mNibble(int []temp) {
	int j=0;
	int []arr2 = temp;
	for(int i=5;i<arr2.length;i++) {
		if(j<4) {
		int temp2=0;
		temp2=arr2[j];
		arr2[j]=arr2[i];
		arr2[i]=temp2;
		j++;
		}
	}
	return arr2;
	
}
/*private static void swap(int num1, int num2) {
	int temp=0;
	temp=num1;
	num1=num2;
	num2=temp;
}*/
public static int mBinarytodec(int[]k){
	int decimal = 0;
	for(int i=0; i<k.length ; i++) {
  		 if(k[i]==1) {
  			 decimal+=Math.pow(2, i);
  	 }	

	}
	return decimal;
}
//Sort the array using Bubble sort
public static int[] mBubblesort(int[]arr) {
	for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length-1;j++) {
		if(arr[j]>arr[j+1]) {
		arr[j] = arr[j]+arr[j+1];
		arr[j+1]=arr[j]-arr[j+1];
		arr[j]=arr[j]-arr[j+1];
      }
	}
   }
	return arr;
  }
//search the element using binary search
public static boolean mBinarySe(int []arr,int key){
	int i;
	int low = 0;
	int high = arr.length-1;
	int mid = (low+high)/2;
	for(i=0;i<arr.length;i++) {
		if(key==arr[mid]) {
			return true;
		}
		else if(key<arr[mid]) {
			high = mid-1;
			mid = (low+high)/2;
		}
		else {
			low = mid+1;
			mid= (low+high)/2;
		}
	}
	 return false;
}
public static boolean mBubblString(String []str,String key){
	int i;
	int low = 0;
	int high = str.length;
	int mid = (low+high)/2;
	for(i=0;i<str.length-1;i++) {
		int num=key.compareTo(str[mid]);
		if(num==0) {
			return true;
		}
		else if(num<0) {
			high = mid-1;
			mid = (low+high)/2;
		}
		else {
			low = mid+1;
			mid= (low+high)/2;
		}
	}
	 return false;
	
}

public static String [] mInsert(String []string) {
	int i,j;
	for(j=1;j<string.length;j++)
	{
		i = j-1;  
		while(i>=0)
		{
			if(string[j].compareTo(string[i])<0)
			{
				String str;
				str = string[j];
				string[j] = string[i];
				string[i] = str;
			}
			i--;
		}
		
	} 
	
return string;
}
}




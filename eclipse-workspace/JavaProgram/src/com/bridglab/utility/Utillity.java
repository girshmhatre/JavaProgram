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
					//calcularte pallindrom no

public static int[] mPlindrom(int[] arr1){
    int num=0 ,p = 0,i;
    int array[]=arr1;
    int rev = 0;
    int arr2[] = new int[100];
	   for( i= 0 ; i<array.length ; i++) {
		num = array[i];
		while(num>0) {
				rev = rev*10;
			    rev = rev+num%10;
			    num=num/10;
		}
		 if(array[i]==rev) {
			   arr2[p++]=arr1[i];
	   }
		
		}
	return arr2;
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
	  // find the Anagram..

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
			// calculate Sqrt

public static double mSqrt(double t,double c,double e) {
	t=(c/t+t)/2;
	while(Math.abs(t-c/t) > e*t) {
		t=(c/t+t)/2;	
	}
	return t;
}
			//convert Celsius to Fahrenheit

public static double mTempFahrToCel(double f) {
	double c = 0; 
	 c = (f-32)*5/9;
	 return c;
}
			// convert Fahrenheit to Celsius

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
         //Swap the nibble

public static int[] mNibble(int []arr2) {
	int size = arr2.length;
	int i,j,temp;
	for(i=0,j=size/2;i<size/2;i++,j++)
	{
		temp = arr2[i];
		arr2[i] = arr2[j];
		arr2[j] = temp;
	}
	

	return arr2;
	
}
			//convert binary to decimal

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
		//sort the double array

public static double[] mBubblesort1(double[]arr) {
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
  		// Sort the String using Bubble sort

public static String[] mBubblesortString(String[]str2) {
	for(int i=0;i<str2.length-1;i++) {
	for(int j=0;j<str2.length-1;j++) {
		if(str2[j].compareTo(str2[j+1])>0) {
		String temp = str2[j];
		str2[j] = str2[j+1];
		str2[j+1] = temp;
      }
	}
   }
	return str2;
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
			// Search the String using binary search
public static boolean mBinaryString(String []str,String key){
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

public static String []mInsert(String []string) {
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
public static int[] mInsertInt(int [] arr) {
	
	int i=0,j;
	int temp=0;
	for(i=1;i<arr.length;i++)
	{
		j=i;
		temp =arr[i];
		while(j>0 && temp<arr[j-1]) {
			arr[j]=arr[j-1];
			j=j-1;
		}
			arr[j]=temp;
	}
	return arr;
}
public static double getElapse(long start , long end) {
	double elapse ;
	
	elapse = (end-start)*Math.pow(10,-9);
	
	return elapse;
}
public static double monthlyPayment(int loan1,int rate1, int year1) {
	int n = 12*year1;
	double r = rate1/(12*100);
	return (loan1*r)/(1-(Math.pow((1+r), -n)));
}
}



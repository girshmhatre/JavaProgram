package com.bridglab.Algorithmprogram;

public class PrimeNumber {
   public static void main(String args[]) {
	   int count;
	   int num = 1000;
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
	   for(int i=0 ; i<arr.length ; i++ ) {
		   System.out.println(arr[i]);
	   }
	   
	   
	   int arr3[] = mPlindrom(arr);
	   System.out.println("Palindrom");
	   for(int q=0 ; q<arr3.length;q++) {
		System.out.println(arr3[q]);
	}
	   
   }
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
	   
   }


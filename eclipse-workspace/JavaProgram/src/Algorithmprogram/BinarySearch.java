package Algorithmprogram;

import com.bridglab.utility.Utillity;

public class BinarySearch {
	public static void main(String arg[]) {
		System.out.println("enter the number");
		int n,N;
		n= Utillity.sc.nextInt();
		N = (int) Math.pow(2, n);
		int high = N-1;
		int low = 0;
		System.out.println("gusses the number betwwen the list");
		for(low=0;low<=high;low++) {
			System.out.print(" "+low);
		}
		found(low,high);
		
	}
		public static void found(int start,int end) {
			
			int mid=(start+end)/2;
			System.out.println("gusses the number betwwen the list");
			for(start=0;start<=end;start++) {
				System.out.print(" "+start);
			}
			
			
			if(start==mid)
				System.out.println("is "+mid+" your Number");
			else
				System.out.println("Is your Number present  between "+start+" to mid="+mid+" ?");
			try {
				if(start==end)
				{
					System.out.println("I Think "+mid+" is your Number");
					System.exit(0);
				}
					
				else if(Utillity.sc.nextBoolean()) 
					found(start, mid);
				else
					found(mid+1, end);
			}
			catch(Exception exception) {
				System.out.println("Exception:"+exception);
			}
			
	}
	
			

	

}
	



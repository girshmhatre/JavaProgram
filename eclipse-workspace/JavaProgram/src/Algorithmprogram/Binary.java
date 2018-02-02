package Algorithmprogram;
import com.bridglab.utility.Utillity;
public class Binary {
	

		public static void main(String args[]) {
			System.out.println("Enter the number");
			int n = Utillity.sc.nextInt();
			int i=0;
			int j1=0;
			int arr[] = Utillity.mBinary(n);
			 int[] temp = new int[arr.length] ;
			  int j =  arr.length;
			/*  if(32-j!=0){		
					int padding=32-j;
					while(padding!=0){       
						System.out.print(0);
						padding--;
				}
			  }*/
			  System.out.println("Binary no : ");
					   for(i=arr.length-1;i>=0;i--){
						   temp[i] = arr[i];
						   System.out.print(temp[i]);	
			}
					   
		 System.out.println("");
		 int[] mArray = Utillity.mNibble(temp);
		 System.out.println("after Swaping nibble");
		 for(j1=0;j1<mArray.length;j1++){
		   System.out.print(mArray[j1]);
	}
		 System.out.print("Decimal number"+Utillity.mBinarytodec(mArray));

}
}


package Algorithmprogram;
import com.bridglab.utility.Utillity;

public class InsertionSort {
	public static void main(String args[]) {
	System.out.println("enter the size");
		int str = Utillity.sc.nextInt();
		String [] str1 = new String[str];
		System.out.println("enter the string");
		for(int i=0 ; i<str; i++) {
		str1[i] = Utillity.sc.next();
		}
				System.out.print("sorted list");
				insSortArray(str1);	
}
	public static void insSortArray(String[] string)
	{
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
		for(i=0;i<string.length;i++)
		{
		System.out.print(string[i]+" ");
		}
}
}

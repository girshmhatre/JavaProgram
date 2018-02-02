package Algorithmprogram;

import com.bridglab.utility.Utillity;

public class DayofWeek {
	public static void main(String args[]) {
		System.out.println("Enter the Year");
		int y = Utillity.sc.nextInt();
		System.out.println("Enter the month");
		int m = Utillity.sc.nextInt();
		System.out.println("Enter the day");
		int d = Utillity.sc.nextInt();
		int y1 = 0,m1,d1,x;
		y1 = y - (14 - m) / 12;
		x = y1 + y1/4 -y1/100 + y1/400;
		m1 = m + 12 * ((14 - m) / 12) - 2;
        d1 = (d+ x + 31*m1 / 12) % 7;
    	System.out.println(d1);
	}

}

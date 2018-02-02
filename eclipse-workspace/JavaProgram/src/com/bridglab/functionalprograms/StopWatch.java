package com.bridglab.functionalprograms;

public class StopWatch {
	
  private static long start = 0;
  private static long end = 0;
  private static boolean running = false;
	public  long mStart() {
		this.start =  System.currentTimeMillis();
		this.running = true; 
		return start;
	}
	public long mEnd()
	{
		this.end =  System.currentTimeMillis();
		this.running = false;
        return end;
	}
	public static long getElapse() {
		long elapse ;
		if(running = true) {
			elapse = (System.currentTimeMillis()-start);
		}
		else {
		elapse = (end-start);
		}
		return elapse;
	}
	
public static void main(String args[]) {
   StopWatch s = new StopWatch();
   System.out.println("Time"+s.mStart());
   System.out.println("Time"+ s.mEnd());
   System.out.println("Time"+s.getElapse());
   
}
}
	
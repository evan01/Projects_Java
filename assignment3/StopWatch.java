package assignment3;

public class StopWatch {
//this is the StopWatch Class. 
	
	
	private static long startTime;
	private static long stopTime;

	public static void main(String[] args) {
		
		start();
		for (int i=0;i<100;i++){
			System.out.println("Let's see how long this takes to print 100 times");
		}
		stop();
		System.out.print(getTimeNano());

	}
	
	public static long start (){
		startTime = System.nanoTime();
		return startTime;
	}
	public static long stop () {
		stopTime=System.nanoTime();
		return stopTime;
	}
	public static long getTimeNano () {
		long nanoDifference;
		
		nanoDifference= (stopTime-startTime);
		return nanoDifference;
	}
	public static long getTimeMicro () {
		long microDifference;
		
		microDifference = getTimeNano()/1000;
		return microDifference;
	}
	public static long getTimeMilli (){
		long milliDifference;
		
		milliDifference= (getTimeNano()/1000000);
		return milliDifference;
	}
	public static long getTimeSeconds () {
		long secondDifference;
		
		secondDifference= (getTimeNano())/1000000000;
		return secondDifference;
	}

}//endStopWatch

package assignment3;
import java.util.Arrays;
import assignment3.StopWatch;
import assignment3.ArrayUtilities;

public class SearchComparison {
	
	
	public static void main(String[] args) {
		//we are going to set up our loop
	
		
		for (int n=10;n<=500000000;n*=2) {
			
			//let's declare our variables
				StopWatch myWatch = new StopWatch();
			
				long timeGenerateArray;
				long timeLinearSearch;
				long timeDuplicate;
				long timeBubbleSort;
				long timeLibrary;
				long timeBinarySearch;

			
			//first generate an array with random values of size n,store how long it takes in microseconds
				StopWatch.start();
				int [] array=ArrayUtilities.generateRandom(n);
				StopWatch.stop();
				timeGenerateArray= (StopWatch.getTimeMicro());
			
			//search for the number -1 in the array using linear search method, see how long it takes in microseconds
				StopWatch.start();
				ArrayUtilities.linearSearch(array,-1);
				StopWatch.stop();
				timeLinearSearch= (StopWatch.getTimeMicro());

			//call duplicate method,store result into new array variable, store how long this takes in microseconds
				StopWatch.start();
				int[] newArray=ArrayUtilities.copy(array);
				StopWatch.stop();
				timeDuplicate=(StopWatch.getTimeMicro());
				
			//call bubblesort method, store how long it takes in microseconds
				//Add the if statement so program won't crash as n get's too large
				if (n<100000){
					StopWatch.start();
					array=ArrayUtilities.sort(array);
					StopWatch.stop();
					timeBubbleSort=(StopWatch.getTimeMicro());
				}
				else {
					timeBubbleSort=1;
				}
			//call Arrays.sort, pass to duplicated array,store how long this method takes in microseconds
				StopWatch.start();
				Arrays.sort(newArray);
				StopWatch.stop();
				timeLibrary=(StopWatch.getTimeMicro());
				
			//call method binary search and look for -1 in sorted int[], store how long this takes in microseconds
				StopWatch.start();
				ArrayUtilities.binarySearch(array, -1);
				StopWatch.stop();
				timeBinarySearch=(StopWatch.getTimeMicro());
			
			//print all the times of various methods in order				
				System.out.println((n)+","+(timeGenerateArray)+","+(timeLinearSearch)+","+(timeDuplicate)+","+(timeBubbleSort)+","+(timeLibrary)+","+(timeBinarySearch));	
		
		}//endloop
	}//endMain
}//endSearchComparison

/*		
	Name: Evan Knox
 	course: Comp 250,(winter)
	Instructor: Precup,D.
 	Student Number: 260502120

	Question 3:
	Suppose that you are given an array of integers. Write a Java program which prints out the element or 
  	elements that occur least often in the array, and the number of times they occur. For example, 
  	for array:144343521 your algorithm should print the message:Elements: 5 2 Number of occurrences: 1
	The implementation should be done in the main method of your class.

*/

package compA1;
public class Question3_ArrayProblem {
	public static void main(String[] args) {

		//first initialize our test array
		int[] array = {0,0,0,0,0,0,0,0,0,0,1,1,2,2,3,-3,0,10};
		
		//declare variables
		int minOccurrences = 999999999;
		
	// occurrences array contains the total count for each value, summed over all locations 
		// There will be duplicated and identical values for each unique value wherever such values occur  
		int[] occurrences = new int[array.length];
		
		// duplicates stores whether a particular value has been observed before
		int[] duplicates = new int[array.length];

		for(int i=0;i<array.length;i++){
			occurrences[i]=0;
			duplicates[i]=-1;
			for(int j=0;j<array.length;j++){
				// check whole array for matches (should get at least 1 when i==j))
				if(array[i]==array[j]){
					//we have an intersection
					occurrences[i]=occurrences[i]+1;
				}
			}
			if(occurrences[i] < minOccurrences){ // we have found a new minimum number of occurrences 
				minOccurrences = occurrences[i];	
			}
		}

	// now occurrences array has been set up and we know the minimum frequency value

		//First print statement
		System.out.print("Element(s):" );	

		int duplicate_counter=0; // zero unique values so far		
		// print out the values with this minimum frequency value, but without repetition
		for(int i=0;i<array.length;i++){
			if (occurrences[i]==minOccurrences) {
				// a value of interest with the lowest frequency of occurrence in the array 
				// (could be more than one of these)

				// check to see if we've already processed this value or not
				boolean seenBefore=false; // assume not for starters
				for (int j=0; j<duplicate_counter; j++) {
					// check all previous values processed
					if ( (duplicates[j]!=-1) && (duplicates[j]==array[i]) ) {
						// valid entry which has been seen before
						seenBefore=true; // mark as seen already
					}
				}  // for j
				if (seenBefore==false) {
					// this is a new value, so remember it and print it at the same time
					duplicates[duplicate_counter]=array[i];
					duplicate_counter++;
					System.out.print(" " + array[i]);
				} 

			} // a value of interest	

		} // for i
		System.out.println("\nNumber of occurrences: " + (minOccurrences));

	}//endMain
}//endClass



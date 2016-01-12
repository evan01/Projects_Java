/*
 * 	My appoligies for this but I am going to just use integers and arrays
 * 	as I don't know how to implement all these strange objects.
 * 
 * I figured I'd also use stacks
 * 
 * 
 * 
 * 
 */


package sorting;
import java.util.*;
public class quickSort {


	public static List<Integer> quicksort(List<Integer> a){
		
		//decalre our initial variables
		int pivot;
		int median;

		//base condition, only one element in the array
		if(a.size() <= 1){
			return a;
		}

		//so we are dealing with an array at least of size 2

		//then the actual value for the median
		pivot = a.size()/2;
		//first find the  location based on median
		median = a.get(pivot);

		//partition our array based on our 
		//create two lists to store the values we want
		List<Integer> less= new ArrayList<Integer>();
		List<Integer> greater= new ArrayList<Integer>();

		//actually place the correct values into the correct lists
		for (int i = 0; i< a.size();i++) {
			if(a.get(i)<= median){
				if(i == pivot){
					continue;
				}
				less.add(a.get(i));
			}
			else{
				greater.add(a.get(i));
			}
		}
		//recursive quicksort and merge these two lists
		return merger(quicksort(less),quicksort(greater),median);
	}

	public static List<Integer> merger(List<Integer> left, List<Integer> right, int median){

		//new returning array with merged arrays
		List<Integer> Merged = new ArrayList<Integer>();

		//first fill the left side of our list
		for(int i=0; i<left.size();i++){
			Merged.add(left.get(i));
		}
		//then place the median in the list
		Merged.add(median);

		//then fill the right side up
		for(int j=0; j<right.size();j++){
			Merged.add(right.get(j));
		}

		//clean up the list
		for(int i=0;i<Merged.size();i++){
			Merged.remove(null);
		}
		return Merged;
	}
/*
 * 
 * Test main method
 * 
	public static void main(String[] args){
		//test arrayList
		List<Integer> test = new ArrayList<Integer>();

		int size=20;

		//fill it up with random values
		Random R = new Random();

		for (int i=0;i<size;i++){
			test.add(R.nextInt(30));
		}
		for(int j=0;j<size;j++){
			System.out.println(test.get(j));

		}

		//sort it
		System.out.print("our sorted array: ");

		System.out.println(quicksort(test));
	}

*/




}

package sorting;
import sorting.*;

import java.util.*;
import java.lang.*;

public class SortBenchmark {
	//this class needs to initialize an array of integer objects

	public static void main(String[] args){

		//first instantiate all of the sorting objects
		quickSort quickTest= new quickSort();
		MergeSort mergeTest= new MergeSort();
		SelectionSort selectTest = new SelectionSort();


		//System.out.println("Hi there please enter the size of your array!");
		Scanner sc = new Scanner(System.in);

		//find out the size from the user
		//int size = sc.nextInt();
		int size=5000;
		//create 3 of the same integer object
		Integer[] quick = new Integer[size];
		Integer[] merge = new Integer[size];
		Integer[] select = new Integer[size];

		//fill up new object with random values
		Random R = new Random();
		for (int i=0;i<size;i++){
			int val = R.nextInt(40);//between 0-40 for now
			quick[i]=val;
			merge[i]=val;
			select[i]=val;
		}

		System.out.println("QuickSort: " + timeQuickSort(quick));
		System.out.println("MergeSort: " + timeMergeSort(merge));
		System.out.println("SelectionSort: " + timeSelectSort(select));

	}

	public static double timeQuickSort(Integer[] quick){

		//find how long quicksort Takes

		//convert our integer object into an arrayList
		List<Integer> a= new ArrayList<Integer>();
		for(int i=0;i<quick.length;i++){
			a.add(quick[i]);
		}
		//begin timing
		double start =System.currentTimeMillis();
		quickSort.quicksort(a);


		//stop timing
		double end=System.currentTimeMillis();
		//find out how long it took
		double total = end-start;

		return total;
	}

	public static double timeMergeSort(Integer[] merge){

		//begin timing
		double start =System.currentTimeMillis();

		MergeSort.sort(merge);

		//stop timing
		double end=System.currentTimeMillis();
		//find out how long it took
		double total = end-start;

		return total;
	}

	public static double timeSelectSort(Integer[] selection){
		//begin timing
		double start =System.currentTimeMillis();

		SelectionSort.sort(selection);

		//stop timing
		double end=System.currentTimeMillis();
		//find out how long it took
		double total = end-start;

		return total;
		
	}





}

// Selection Sort algorithm; last updated January 2014 by Doina
// Code modified to allow the use of generic types

package sorting;

public class SelectionSort {

    // Wrapper method that calls the actual algorithm
    // We use a generic type T, which will be instantiated at run time
    public static <T extends Comparable<T>> void sort(T[] a) {
	selectionSort(a, a.length-1);
    }

    // Recursive implementation of Selection Sort
    // This is tail recursion, so no real O() gains
    private static <T extends Comparable<T>> void selectionSort(T[] a, int n) {
	if (n < 0) return;
	int indMax = findMaxIndex(a, n);
	swap(a, n, indMax);
	selectionSort(a, n-1);
    }
    
    // Methods for finding the index of the maximum element in the array
    private static <T extends Comparable<T>> int findMaxIndex(T[] a, int n) {
	int indMax = 0;
	for (int i = 1; i <= n; i++) {
	    if (a[indMax].compareTo(a[i]) < 0) {
		indMax = i;
	    }
	}
	return indMax;
    }
    
    // Finally, a small method to swap elements
    private static <T extends Comparable<T>> void swap(T[] a, int i, int j) {
	T tmp = a[i];
	a[i] = a[j];
	a[j] = tmp;
    }

}
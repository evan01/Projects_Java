package assignment3;
import java.util.Scanner;
import java.util.Random;

public class ArrayUtilities {

	public static void main(String[] args) {
		//TEST MAIN METHOD
		
		 * Scanner sc = new Scanner(System.in);
		int n,target;
		System.out.println("What is the size of your array?");
		n = sc.nextInt();
		
		System.out.println("What is the target or your array");
		target = sc.nextInt();
		
		generateRandom(n);
		we've created this array in the generateRandom method, somehow we need to pass it to the main method
		int [] array = new int[n];

		this will print out whether we have the target in our array USED ARRAY>LENGTH
		System.out.println(linearSearch(array,target));
		this will print out whether we have the target in our array using a binary search
		System.out.println(binarySearch(array,target));
		
	}//endmain

	public static boolean linearSearch (int[] array, int target) {
		boolean istrue=false;
		
		for (int i=0;i<array.length;i++) {
			if (array[i]==target) {
				istrue=true;
			}//endif
		}//endloop

		return istrue;
	}//end of linearSearch
	
	

	public static int[] copy(int[]array){
		
		//first declare new array
		int []arrayCopy= new int [array.length];
		
		//fill this array with the values of the old array
		for (int i=0;i<array.length;i++){		
			arrayCopy[i]=array[i];	
		}
		return arrayCopy;
	}//endofcopy
	
	public static int[] sort (int[]array){
		
		
		for(int i=0;i<(array.length-1);i++){
			for(int j=i+1;j<array.length-1;j++){
				
				if(array[i]>array[j]){
					//switch the variable at array i with the variable at array j
					int temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}//endinnerloop
		}//endouterloop
		
		return array;
	}

	public static int[] generateRandom(int n){
		//create a new array
		int [] array = new int[n];
		
		//create a random variable
		Random r = new Random(1);
		
		for ( int i=0;i<n;i++) {	
			array [i]=r.nextInt(Integer.MAX_VALUE);
	
		}
		
		return array;
	}

}//endofClassArrayUtilities

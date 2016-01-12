package compA1;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {

		int [] arrayA = {};
		int [] arrayB = {0};


		System.out.println(ListIntersection(arrayA,arrayB));

	}

	public static int ListIntersection(int[] a, int[]b){
		int intersect=0;
		int counter=0;
		Arrays.sort(a); //sort our array

		//boundary case, should not happen
		if(a.length==0){
			intersect=0;
		}

		else{
			counter=a[0];//our counter is the first element(lowest)

			for (int i=0;i<a.length;i++){
				if(a[i]!=counter || i==0){
					counter=a[i];
					//so in our sorted array don't check the same value twice	
					for(int j=0;j<b.length;j++){
						if(b[j]==a[i]){
							intersect=intersect+1;
							break;
						}
					}
				}
			}
		}
		return intersect;
	}
}

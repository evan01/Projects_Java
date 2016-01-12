package main;/*
 * Created by evanknox on 2015-10-17.
 */

public class InsertionSort {
    public static void main(String args[]){
        int myArray[] = {100,9,8,4,6,5,4,32,12,36};

        int i= 1;
        int j,temp;


        for (i=0; i< myArray.length;i++){
            j = i;

            while(j>0 && myArray[j-1]>myArray[j]){
                //We need to swap the two
                temp = myArray[j-1];
                myArray[j-1] = myArray[j];
                myArray[j]= temp;

                //Decrement j
                j--;
            }
        }

        //Then print the results
        for (int a=0; a<myArray.length;a++){
            System.out.print(myArray[a]+",");
        }
    }
}

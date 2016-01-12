package main;/*
 * Created by evanknox on 2015-10-17.
 */

public class MergeSort {

    public static void main(String args[]){
        //Create the array and then run mergesort
        int myArray[] = {100,9,8,4,6,5,4,32,12,36};

        myArray = mergeSort(myArray);
        //Then print the results
        for (int a=0; a<myArray.length;a++){
            System.out.print(myArray[a]+",");
        }
    }

    public static int[] mergeSort(int array[]) {
        //First if the array is size of 1 then just return
        if (array.length < 2) {
            return array;
        }

        //else split the array into two arrays
        int newLength = array.length/2;

        int left[] = new int[newLength];
        int right[] = new int[newLength];



        for (int i=0;i<array.length/2;i++){
                //place it in the left list
                left[i]= array[i];
        }

        int count = 0;
        for (int j =array.length/2;j<array.length;j++){
            //place it in the left list
            right[count]= array[j];
            count++;
        }

        mergeSort(left);
        mergeSort(right);

        //combine the results of mergesort of both of these using a merge method
        return merge(left,right);

    }

    public static int[] merge(int[] a, int[] b){
        int array[] = new int[a.length+b.length];

        int k = 0;
        int i = 0;
        int j = 0;

        while(i <a.length || j< b.length){
            if (a[i]<b[j]){
                //add element to the list and increment i
                array[k]=a[i];
                i++;
            }else{
                array[k]=b[j];
                j++;
            }
            k++;
        }
        //at this point we've added all the elements of 1 of our lists.

        if (i<a.length){
            //Then we haven't added all of a yet
            for (;i<a.length;i++){
                array[k]=a[i];
                k++;
            }
        }else{
            for (;j<b.length;j++){
                array[k]=b[j];
                k++;
            }
        }
        //Now array should be full!
        return array;
    }
}

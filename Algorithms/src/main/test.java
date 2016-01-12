package main;/*
 * Created by evanknox on 15-11-29.
 */

public class test {
    public static void main (String args[]){
        int array[] =  {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Length = " + array.length);
        for (int i = array.length-1;i>-1;i--){
            System.out.print(array[i]+",");
        }
    }
}

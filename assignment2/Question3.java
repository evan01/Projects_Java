package assignment2;
import java.util.Scanner;
import java.io.*;

public class Question3 {
	public static void main(String[] args) {
		
		      int x,y,radiusA,radiusB;
		      Scanner sc = new Scanner (System.in);
		 
		     //We will first get all the variables we need	
				System.out.println("Hi there this program will draw you an ellipse");
				
				System.out.println("Please enter the x position of the origin");
				x=sc.nextInt();
				System.out.println("Please enter the y position of the origin");
				y=sc.nextInt();
				System.out.println("Please enter the radius A/Horizontal radius");
				radiusA=sc.nextInt();
				System.out.println("Please enter the radius B/Vertical radius");
				radiusB=sc.nextInt();
			

		    //Calling the method DrayMeAnEllipse
		       DrawMeAnEllipse(x, y, radiusA, radiusB);
		   
	}//EndOfMain
	
	public static void DrawMeAnEllipse (int posX, int posY, int radiusA, int radiusB){
		
		double ActualResult,RadA=radiusA,RadB=radiusB;
		//I used a threshold to form a more perfect ellipse, I scaled this with the function values to find what I thought was the best.
		//this is a crude way of doing this but for our purposes it works
		final double THRESHOLD=15/(1+(Math.pow(radiusA+radiusB, 2)));
		final double GRID=100;
		double RoundedResult;
		
//create the multidimensional array
		char graph [][]= new char [100][100];
		
//let's fill in our array with #'s if they satisfy our conditions
		for (int y=0;y<GRID;y++){
			for (int x=0;x<GRID;x++){
				
				ActualResult=(((Math.pow(((x-posX)/RadB),2))+Math.pow(((y-posY)/RadA),2)));
				
				if (ActualResult<=1+THRESHOLD && ActualResult>=1-THRESHOLD){
							graph [x][y] = '#';
				}
				else{
					graph [x][y] = ' ';
				}
			}//endloop
		}//endloop
		
//let's print out each row
			for (int row=0;row<GRID;row++){
				System.out.print("\n");
					for (int column=0;column<GRID;column++){
						System.out.print(graph [row][column]);
					}
				}	

	}//endofDrawMeAnEllipse
	
}//endofclass

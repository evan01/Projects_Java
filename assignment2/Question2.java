package assignment2;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int posX,posY,radius;
		
		
		//We will first get all the variables we need	
			System.out.println("Hi there this program will draw you a circle");
		
			System.out.println("Please enter the x position of the origin");
			posX=sc.nextInt();
			System.out.println("Please enter the y position of the origin");
			posY=sc.nextInt();
			System.out.println("Please enter the radius");
			radius=sc.nextInt();
		
			DrawMeACircle (posX,posY,radius);	
		}//end of main
	
	public static void DrawMeACircle(int posX,int posY, int radius){
				double ActualDistance;
				long RoundedDistance;
				
				//	first let's create a Multidimensional array
		char graph [][]= new char [100][100];
	//let's evaluate this array for x and y values with #'s or " "'s
		
		for (int y=0;y<100;y++){
			for (int x=0;x<100;x++){
				
				ActualDistance =  Math.sqrt((Math.pow((x-posX),2) + Math.pow(y-posY,2)));
				RoundedDistance = Math.round(ActualDistance);
				
				
				//System.out.println("\nx=" + x + " y=" + y + " Actual =" + ActualDistance + " Rounded =" + RoundedDistance);
				if (RoundedDistance == radius){
				//if ((Math.pow((x-posX),2) + Math.pow(y-posY,2)==RoundedDistance)){
					graph [x][y] = '#';
				}//endif
				else {
					graph [x][y] = ' ';
				}	

			}//endloop
		}//endloop
		
		//let's print out each row
		for (int row=0;row<100;row++){
			System.out.print("\n");
			for (int column=0;column<100;column++){
				System.out.print(graph [row][column]);
			}
		}	
	}//end of DrawMeACircle method
}//end of class

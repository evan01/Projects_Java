/*	
 * 		This class prints Pascals triangle!
 * 
 * 		Author: Evan Knox
 * 		Date: Thursday March 13th, 2014
 * 		Course: Comp 250
 * 		Instructor: D Precup
 * 
 * Good news is that pascals triangle is based heavily on factorials. To return the 
 * right number, given parameters n and m.  You can use recursion to find the correct
 * value.
 * 
 *		Formula for P(n,m)=P((n-1),m)+P((n-1),m-1)
 * 
 * Now according to the assignment there is an issue with the example that was given because
 * I'm assuming that our prof meant for the nth row and the mth position. I'll base my program
 * on the assumption that 
 * 
 * 
 * */


package assignment3;
import java.util.Scanner;
public class Pascal {

	public static void main(String[] args) {
		int row;
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a row you want to compute up to");
		row=sc.nextInt();

		for (int i=0;i<row;i++){
			//print each row
			for (int j=0;j<(i+1);j++){
				//print each position
				System.out.print(pascalTriangle(i,j) + " ");
			}
			System.out.println("");//new line after each iteration
		}
	}

	public static int pascalTriangle (int n,int m){

		if(m==0 || m==-1 || m==n){
			//at the end of the row
			return 1;
		}

		if(n==0){
			//top of triangle
			return 1;
		}

		else{
			//our recursive call again
			return pascalTriangle((n-1),m)+pascalTriangle((n-1),(m-1));

		}

	}
}

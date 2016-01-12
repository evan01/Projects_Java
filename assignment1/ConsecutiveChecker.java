package assignment1;

import java.util.Scanner;

public class ConsecutiveChecker {
	public static void main(String[] args) {
		int number,a,b,c,d;
		boolean eval1dig,eval2dig,eval3dig,eval4dig,evaluation;
		
		//let's declare our variables
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a 4 digit or less consecutive number");
		number=sc.nextInt();
		
		//first we will break up the number into all of its different parts
			a=number/1000;
			number=number%1000;
			b=number/100;
			number=number%100;
			c=number/10;
			number=number%10;
			d=number;
		
		//now we should figure out how many digits are in this number,without if statements... this is difficult
		//we also need to evaluate 1-4 digit numbers
			eval1dig = (10>d && c==0 && b==0 && a==0);//this makes sure that it is a 1 digit consecutive number
			eval2dig = ((c==(d+1) || c==(d-1)) && (a==0 && b==0));//this makes sure that it is a 2 digit consecutive number 
			eval3dig = (((b==(c+1) && c==(d+1)) || (b==(c-1) && c==(d-1))) && a==0);	//this makes sure it's a 3 digit consecutive number	
			eval4dig =((a==(b+1) && b==(c+1) && c==(d+1)) || (a==(b-1) && b==(c-1) && c==(d-1)));//this makes sure it's a 4 digit consecutive number
		
		
		//final expression, any of these must be true
			evaluation= (eval1dig || eval2dig || eval3dig || eval4dig);
		
		System.out.println("The number is consecutive: " + (evaluation));
		
		//perhaps the code would have been better had I used the absolute value function, this seems fine though.
	}

}

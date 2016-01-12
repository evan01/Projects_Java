/*Write, in Java, a recursive method countBinaryStrings that has one integer parameter n 
 * and returns the number of binary strings of length n that do not have two consecutive 0s. 
 * 
 * From careful observation, (manually finding out how many there were up to n=5.) 
 * I realized that what we are looking at is the Fibbonacci sequence.  Why, not sure but looking
 * at the theory, we will always have n-1 combinations for a binary number ending in 1 and n-2 if it ends in zero.

 Name:Evan Knox (260502120)
 Course:Comp 250, McGill
 Date: Tues Feb(11th)
 Teacher: DPrecup

 */

package recursion;
import java.lang.Integer;

public class Recursion {

	public static int countBinaryStrings(int n) {
		// this is the standard recursive code for the fibonacci sequence.
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		} else {
			// the idea is that each number in the sequence is the sum of those
			// two before it
			return (countBinaryStrings(n - 1) + countBinaryStrings(n - 2));
		}
	}

	public static void main(String[] args) {
		//first define our variables
		int n;
		//read a number from the command line
		if (args.length > 0) {
			try {
				n = Integer.parseInt(args[0]);//turn our string into an int

				//start executing our recursive code
				if (n == 0) {
					System.out.println("No can do, length of zero");
				}
				if (n == 1) {
					System.out.println("1 Digit, so I suppose 1");
				} 
				else{
					//run the fibonacci code
					System.out.println("The number of consecutive 0s is: "+countBinaryStrings(n + 2));
				}
			} catch (NumberFormatException e) {
				System.err.println("Argument" + " must be an integer");

			}
		}


	}

}

package assignment1;
import java.util.Scanner;
public class CellComparison {
	public static void main(String[] args) {
		double months,minutes,plan1,plan2;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("How many months will you use the phone?");
		months=sc.nextInt();
		
		System.out.println("How many minutes will you talk per month?");
		minutes=sc.nextInt();		
		
		//let's compute the 2 plans then
			plan1=((50*months)+(.10*minutes));
			plan2=(500+25*months+.05*minutes);
		
		System.out.println("Under the first plan, you will pay $"+(plan1));
		System.out.println("Under the second plan, you will pay $"+(plan2));

		//really the only thing that could be changed would be to use int instead of double but I felt double was better
	}
    
}

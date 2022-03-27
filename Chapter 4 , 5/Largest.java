import java.util.Scanner;

public class Largest{
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		int number = 2;
		int largestNumber= 0;
		
	    for(int counter = 1; counter <= 10; counter++){
		
			System.out.print("Enter number");
			int grade = input.nextInt();
			if(grade > largestNumber){
				largestNumber = grade;
			}
		   // System.out.println(counter);
		 }
		
		System.out.println(largestNumber);
	}
} 
import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("enter a number");
		int number = input.nextInt();
		if(number % 2 == 0){
		System.out.printf("number is even %d%n", number);
		}
		else {
			System.out.printf("number is odd %d%n", number);
		}
	}
}
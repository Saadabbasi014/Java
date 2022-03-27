import java.util.Scanner;

public class Decimal{
	
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter binary number :");
		
		int binary = 0;
		int decimal = 0;
		int counter = 1;
		
		binary = input.nextInt();
		
		while(binary != 0){
			
            decimal	+= binary % 10 * Math.pow(2, counter);
			binary /= 10;
			counter++;
		}
		System.out.print(decimal);
	}
}
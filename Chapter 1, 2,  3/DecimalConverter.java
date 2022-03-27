import java.util.Scanner;
public class DecimalConverter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the binery number: ");
		int binery = 0;
		int counter = 0;
		int decimal = 0;
		binery = input.nextInt();
		while(binery >= 1){
			decimal += binery % 10 * Math.pow(2, counter);
			binery /= 10;
			counter++;
		}// end of while loop
		System.out.print(decimal);
	}// end of main method
}//end of class DecimalConverter
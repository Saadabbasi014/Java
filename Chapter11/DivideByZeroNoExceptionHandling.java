import java.util. Scanner;
public class  DivideByZeroNoExceptionHandling{
	
	public static int quotient(int nominator, int denominator){
		
		return nominator / denominator; // possible division by zero
	}
	
		public static void main(String[] args){
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Please enter a nominator");
			int nominator = scanner.nextInt();
			System.out.print("Please enter a denominator");
			int denominator = scanner.nextInt();
			int result = quotient(nominator , denominator);
			
			System.out.printf("%nResult: %d / %d = %d%n", nominator, denominator, result);
		}
}
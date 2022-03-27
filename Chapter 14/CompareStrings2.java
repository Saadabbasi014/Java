import java.util.Scanner;

public class CompareStrings2
{
	public static void main(String[] args)
	{
		// String first,second;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first string: ");
		// first = input.nextLine();
		
		char[] first = input.next().toCharArray();
		System.out.println("Enter second string: ");
		char[] second = input.next().toCharArray();
		
		if (first.equals(second))
		// if (first.equalsIgnoreCase(second))
			System.out.println("first equals second");
		else
			System.out.println("first does not equal second");
	}
}
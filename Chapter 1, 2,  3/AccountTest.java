/*
import java.util.Scanner;
public class AccountTest
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		Account myAccount = new Account();
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
	    System.out.println("Please inter the name: ");
		String theName = input.nextLine();
		myAccount.setName(theName);
		System.out.println();
		System.out.printf("Name in object myAccount is: %n%s%n",
		myAccount.getName());
	}
}
*/

public class AccountTest{
	public static void main(String [] args){
	Account myAccount = new Account();
	myAccount.setName("Saad Abbasi");
	System.out.print(myAccount.getName());
	}
}






















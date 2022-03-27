
/*
import java.util.Scanner;
public class Separate
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);//prompt
		System.out.print("Please enter a number");
		int Numbers;
		Numbers = input.nextInt();
		System.out.printf("%d%s", (Numbers / 10000)," ");
		Numbers = Numbers%10000;
		System.out.printf("%d%s", (Numbers / 1000), " ");
		Numbers = Numbers%1000;
		System.out.printf("%d%s", (Numbers / 100), " ");
		Numbers = Numbers%100;
		System.out.printf("%d%s", (Numbers / 10), " ");
		Numbers = Numbers%10;
		System.out.print(Numbers);
	}     
}

*/


import java.util.Scanner;
  public class Separate{
     public static void main(String [] args){
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a number");
		 int number;
		 number = input.nextInt();
		 System.out.printf("%d%s", (number / 10000)," ");
         number = number%10000;
		 System.out.printf("%d%s", (number / 1000), " ");
		 number = number%1000;
         System.out.printf("%d%s", (number / 100), " ");
		 number = number%100;
		 System.out.printf("%d%s", (number / 10), " ");
		 number = number%1000;
		 System.out.print(number);
	 }
  }


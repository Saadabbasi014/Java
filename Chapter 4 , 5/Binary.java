import java.util.Scanner;

  public class Binary{
	  
	  public static void main(String [] args){
		  
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter a number : ");
		  int number = input.nextInt();
		  int mode;
		  while(number != 0){
		  mode = number % 2;
		  number /= 2;
		 
		  System.out.print(mode);
		  }
	  }
  }
import java.util.Scanner;
  
  public class Tabular{
	  
	  public static void main(String [] args){
		  
		 // Scanner input = new Scanner(System.in);
		   System.out.printf("%s%10s%10%s10s%n","Num","Num*10","Num*100", "Num*1000");

		  //int num = 0;
		  
		  for(int num = 1; num <= 5; num++){
			  System.out.printf("%d%10d%13d%16d%n", num, num*10 , num*100 , num*1000);

			 //   System.out.print("enter a number");
		     //   num = input.nextInt();
				
			 // System.out.printf("%3d%5d%7d%n",i  , num,   num*num);
		  }
		 
	  }
  }
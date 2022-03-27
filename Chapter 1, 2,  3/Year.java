import java.util.Scanner;
    public class Year{
		public static void main(String [] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Enter year: ");
			int number = 0;
			for(int num = 1; num<500; num++){
				number = input.nextInt();
				if (number < 1995){
					System.out.print("Enter year: ");
				}
				else{
				break;
				}
		    } 
			System.out.println(number);
	    }
	}		 
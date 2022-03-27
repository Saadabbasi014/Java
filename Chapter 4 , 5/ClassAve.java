import java.util.Scanner;
  
  public class ClassAve{
	  
	  public static void main(String [] args){
		  
		  Scanner input = new Scanner(System.in);
		  
		  int total = 0;
		  int counter = 1;
		  
		  System.out.print("Enter grade or -1 to quit");
		  int grade = input.nextInt();
		  
		  while (grade != -1){
			  total = total + grade;
			  counter = counter + 1;
			  
			  System.out.print("Enter grade or -1 to quite");
			  grade = input.nextInt();
			  
		  }
		  
		    if(grade != 0){
				double average = (double) total / counter;
				System.out.printf("%nTotal of the %d grade enterd is%d%n", counter, total);
				System.out.printf("Class average is %.2f%n", average);
			}
			
			else 
				System.out.println("No grade were enterd");
	  }
  }
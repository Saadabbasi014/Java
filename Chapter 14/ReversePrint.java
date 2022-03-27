import java.util.Scanner;
public class ReversePrint{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
			System.out.println("please write a sentence");
		
			String line[] = new String[4]; 
			// String line = new String(); 
	
			for(int i=0; i<4; i++){ 
				line[i] = sc.nextLine(); 
			}
			
		// for(int i=0; i<4; i++)
		// System.out.println(line[i]);
		System.out.println("revese sentence is: ");  

		for(int i = line.length - 1; i >= 0; i--)
		
		System.out.println(line[i]);
	}
}
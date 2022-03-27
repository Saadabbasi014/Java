import java.util.Scanner;  
public class InputTest{  
	public static void main(String[] args){   
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the sentence ");  
		// creates an array in the memory of length 10  
		char[] array = new char[4];  
		
		
		// System.out.println("Enter the elements of the array: ");  
		
		for(int i=0; i<1; i++)  {  
			array[i]=sc.next().toCharArray(i);  
		}  
		
		
		// System.out.println("revese sentence is: ");  
		// for (int i=0; i<1; i++){  
			// System.out.println(array[i]);  
		// }  
		for (int i=array.length; i>=1; i--)   
			System.out.println(array[i]);  

	} 
} 
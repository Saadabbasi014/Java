
public class StringMiscellaneous{
	
	public static void main(String[] args){
		
		String s1 = "hello there";
		char[] charArray = new char[5];
		
		System.out.printf("s1: %s",s1);
		
	System.out.printf("%nLength of s1: %d", s1.length());

	
	System.out.println("the string reversed is");
	
	for(int count = s1.length()-1; count >= 0; count--)
		System.out.printf("%c ", s1.charAt(count));
	
	// copy characters from string into charArray 
    System.out.printf("%nThe character array is: ");

    for (char character : charArray)
    System.out.print(character);

    System.out.println();

	}
}
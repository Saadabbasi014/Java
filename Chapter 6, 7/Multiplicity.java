// Exercise 6.16 Solution: Multiplicity.java
// Determines if the second number entered is a multiple of the first.
import java.util.Scanner;

public class Multiplicity
{
   // checks if the second number is a multiple of the first
    public void checkMultiples()
 // public static void main(String[] args)
   {
      Scanner input = new Scanner( System.in );

      int first; // the first number
      int second; // the second number 
      
      System.out.print( "Enter first number (0 to exit): " );
      first = input.nextInt();
      
      // use 0 as the sentinel value, since we cannot divide by zero
      while ( first != 0 )
      {
         System.out.print( "Enter second number: " );
         second = input.nextInt();

         if ( multiple( first, second ) )
            System.out.printf( "%d is a multiple of %d\n",
               second, first );
         else
            System.out.printf( "%d is not a multiple of %d\n",
               second, first );
         
         System.out.print( "Enter first number (0 to exit): " );
         first = input.nextInt();
      } // end while loop
   } // end method checkMultiples

   // determine if first int is a multiple of the second
   public boolean multiple( int firstNumber, int secondNumber )
   {
      return secondNumber % firstNumber == 0;
   } // end method multiple
} // end class Multiplicity


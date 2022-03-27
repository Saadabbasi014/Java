import java.util.Scanner;
public class Demo {
   public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      System.out.println("First add some characters...");
      char[] a = s.next().toCharArray();
      System.out.println("Elements = ");
      for (int i = a.length; i >=0; i--) 
         System.out.println(a[i]);
   }
}
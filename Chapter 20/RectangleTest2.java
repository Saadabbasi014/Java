import java.util.*;
public class RectangleTest2
{
	public static void main(String[] args)
	{
		
		ArrayList<Rectangle2> myList = new ArrayList<Rectangle2>();
		
		 Rectangle2 r1 = new Rectangle2(6, 7);  
		 Rectangle2 r2 = new Rectangle2(4, 5);
		//Rectangle r3 = new Rectangle(3, 9);
		//Rectangle r4 = new Rectangle(7, 4);
		
		 myList.add(r1);
		 myList.add(r2);
		// myList.add(r3);
		//myList.add(e4);

		
		 System.out.printf("There are currently %d elements in myList: %n%n", myList.size());
		
		 for(Rectangle2 rt: myList)
			  System.out.printf("\nRectangles:%n %d\n", rt.getArea());
	
					
		 // Collections.sort(myList);
		 // System.out.printf("\n Here is sorted list of Recatangle: %s\n", myList);
		
		//Collections.sort(myList, Collections.reverseOrder(new Rectangle2()));
//System.out.printf("\n Here is Area based sorted list %s\n", myList);
					
		//System.out.printf("Rectangle one: %n%d", r1.getArea());
	}
}
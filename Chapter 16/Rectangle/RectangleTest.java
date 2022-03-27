import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RectangleTest{
	
	public static void main(String[] args){
		
		List<Rectangle> list = new ArrayList<>();
		Rectangle r1 = new Rectangle(6, 7);  
		Rectangle r2 = new Rectangle(10, 5);
		
		list.add(r1);
		list.add(r2);
		
		//list.add(new Rectangle(6,4));
		//list.add(new Rectangle(5,7));
		
		System.out.printf("Unsorted array elements:%n%s%n", list);
		
		Collections.sort(list,Collections.reverseOrder( new AreaComparator()));
		
		System.out.printf("Sorted list elements:%n%s%n", list);
		
	//	Collections.sort(list, new AreaComparator());
		
		System.out.printf("Sorted list elements:%n%s%n", list);
	}
}
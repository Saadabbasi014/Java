// Fig. 16.2: CollectionTest.java
// Collection interface demonstrated via an ArrayList object.
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest{
	
	public static void main(String[] args){
			
		String[] colors = {"White", "Black", "Blue", "Red", "Green"};
		List<String> list = new ArrayList<String>();
		
		for(String color : colors)
			list.add(color);
		
		String removeColors = {"Red", "White", "Blue"};
		List<String> removeString = new ArrayList<String>();
		
		for(String color : removeColors)
			removeList.add(color);
		
		System.out.pritnln("Array list");
		
		for(int count = 0; count <= list.size(); count++)
			System.out.println("%s",list.get(count));
		
		removeColors(list, removeList);
		System.out.printf("%n%nArrayList after calling removeColors:%n");
		
		for(String color : list)
			System.out.printf("%s", color);
	}
	
	private static void removeColors(Collection<String> collection1,
		Collection<String> collection1){
			
			Iterator<String> iterator = collection1.iterator();
			
			while(iterator.hasNext())
				if (collection2.contains(iterator.next())) iterator.remove();
				
		}
}
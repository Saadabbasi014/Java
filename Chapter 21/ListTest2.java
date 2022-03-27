import com.deitel.datastructures.List;
import com.deitel.datastructures.EmptyListException;

public class ListTest {
	public static void main(String[] args){
		
		List<Fruit> list = new List<>();
		
			// insert integers in list
			list.insertAtFront(0); 
			list.print(); 
			list.insertAtFront(-1); 
			list.print(); 
			list.insertAtFront(-2); 
			list.print(); 
			list.insertAtFront(-3); 
			list.print(); 
			
			list.insertAtBack(1); 
			list.print(); 
			list.insertAtBack(2); 
			list.print();list.insertAtBack(3); 
			list.print(); 
			list.insertAtBack(4); 
			list.print(); 
		
		try{
		
		int removedItem = list.removeFromFront();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromFront();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromFront();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromFront();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();

		}	
		
		catch (EmptyListException emptyListException){
			emptyListException.printStackTrace();
		} 
	}	
}
import java.util.ArrayList;

public class Stack<Fruit>{
	
	private final ArrayList<Fruit> elements;
	
	public Stack(){
		this(10);
	}
	
	public Stack(int capacity){
		
		int initCapacity = capacity > 0 ? capacity : 10;
		elements = new ArrayList<Fruit>(initCapacity);
	}
	
	public void push(Fruit pushValue){
		
		elements.add(pushValue);
	}
	
	public Fruit pop(){
		
		if (elements.isEmpty()) // if stack is empty
		throw new EmptyStackException("Stack is empty, cannot pop");
		return elements.remove(elements.size() - 1); 
	}
}
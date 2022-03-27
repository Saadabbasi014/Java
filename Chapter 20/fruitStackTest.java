import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.ArrayList;


public class fruitStackTest{

	public static void main(String[] args){
		
		Fruit[] Fruits = new Fruit[4];	
		Fruits[0] = new Kinu(3,5);
		Fruits[1] = new Malta(3,4); 
		Fruits[2] = new Kharbuza(2,7);
		Fruits[3] = new Tarbooz(13,2);
		
		Stack<Fruit> FruitStack = new Stack<>(4); 
		
		testPushFruit(FruitStack, Fruits); 
		testPopFruit(FruitStack);
		
	}
	
	private static void testPushFruit(
		Stack<Fruit> stack, Fruit[] values){
	
		System.out.printf("%nPushing elements into FruitStack%n");
		
		for (Fruit value : values){
			System.out.printf("%s ", value);
			stack.push(value);
		}
	}	
	private static void testPopFruit(Stack<Fruit> stack){
	
		try{
			System.out.printf("%nPopping elements from FruitStack%n");
			Fruit popValue;
			
			while (true){
				popValue = stack.pop(); 
				System.out.printf("%s ", popValue);
			}
		}
		
		catch(EmptyStackException emptyStackException){
			
			System.err.println();
			emptyStackException.printStackTrace();
		}
	}
}
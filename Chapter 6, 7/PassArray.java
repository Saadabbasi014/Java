public class PassArray{
	
	public static void main(String[] args){
		
		int array[] = {1,2,3,4,5};
		
		System.out.printf("Effect of passing reference to the entire array:%n" +
		"The value of the orignal array are: %n");
		
		for(int value : array)
			System.out.printf("%3d", value);
		
		modifyArray(array);
		System.out.printf("%n%n The value of the modified array are:%n");
		
		for(int value : array)
			System.out.printf("%3d", value);
		
		System.out.printf("%n%nEffects of passing array element value:%n" +
            "array[3] before modifyElement: %d%n", array[3]);
			
			modifyElement(array[3]);
			System.out.printf("array[3] after modifyElement: %d%n", array[3]);
	
	}
	
	public static void modifyArray(int[] array2){
	for(int counter = 0; counter < array2.length; counter++)
		array2[counter] *= 2;
	}
	
	public static void modifyElement(int element){
		element *= 2;
		System.out.printf("value of element in modifyElement is: %d%n",element);
	}
	
	
	
	
	
	
	
	
	
}
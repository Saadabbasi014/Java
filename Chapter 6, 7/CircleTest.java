public class CircleTest{
	public static void main(String [] args){
	
	
	//   Circle c1 = new Circle();
	//   Circle c2 = new Circle();
		
    
	//	if(args.length != 3){ 
	
				int arrayLength = Integer.parseInt(args[0]);
				int array[] = new int [arrayLength];
				
				double area = Double.parseDouble(args[1]);
				double circumference = Double.parseDouble(args[2]); 
				
				//for(int counter = 0; counter < array.length; counter++)
				//	array[counter] = initialValue + increment * counter;
			
				
				for(int counter = 0; counter < array.length; counter++)
					System.out.printf("%5d%8d%n", arrayLength, circumference);

	
		// System.out.printf("Area %s",c1.getArea());
		// System.out.printf("%n");
		// System.out.printf("Circumference: %s ",c2.getCircleference());
		
	}

}
public class ShapeTest{
	
	public static void main(String[] args){
		
		double totalArea = 0;
	//	double totalPeremeter = 0; 
		
		Shape[] shapes = new Shape[6];	
		shapes[0] = new Circle(5); 
		shapes[1] = new Triangle(5,4,6); 
		shapes[2] = new Rectangle(3,5);
		shapes[3] = new Cube(3,7,2);
		shapes[4] = new Sphere(4);	
		shapes[5] = new Tetrahedron(7);
		
		System.out.printf("2D Shapes Areas are follwing:%n%n");
		
			
		 for (Shape currentShape : shapes){
			System.out.println(currentShape);
			totalArea += currentShape.getArea();
			// totalPeremeter += currentShape.getParameter();
				
		}
		
		System.out.println("Total Area: " + totalArea);
		// System.out.println("Total Parameter: " + totalPeremeter);
		
		// totalArea = totalPeremeter = 0;
		// for (Shape currentShape : shapes){
		
			// if(currentShape instanceof Circle){
				// Circle circle = (Circle) currentShape;
				// circle.setRadius(.5 * circle.getRadius() + circle.getRadius());	
			// }			
			
			// System.out.println(currentShape);
			// totalArea += currentShape.getArea();
			// totalPeremeter += currentShape.getParameter();
		// }
		// System.out.println("Total Area: " + totalArea);
		// System.out.println("Total Parameter: " + totalPeremeter);
		
	}   
}  
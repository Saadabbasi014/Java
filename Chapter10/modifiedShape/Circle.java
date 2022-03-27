public class Circle extends Shape{
	
	private double radius; 
	private final static double  pai = 3.14; 

	public Circle(double radius){
	super();
	this.radius = radius;
	} 
	
	public void setRadius(double radius){
	this.radius = radius;
	} 

	public double getRadius(){
	return radius;
	} 
	
	
	@Override 
	public double getArea(){
	return  pai*(double)(Math.pow(radius, 2));
	}
	
	public double getParameter(){	
	return 2*((double)pai * radius);
	
	}

	public String toString(){
		return String.format("Circle%n\tArea %.2f%n\tParameter %.2f",  getArea(), getParameter());
	}
}
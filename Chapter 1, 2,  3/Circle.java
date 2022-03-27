
public class Circle{
	private double radius;
	
	
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	
	public void setRadius(double radius){
		if(radius > 0.0)
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double getArea(){
		double area = 3.14 * radius * radius;
		return area;
	}
	
	public double getCircleference(){
		double circleference = 2 * 3.14 * radius;
		return circleference;
	} 
}
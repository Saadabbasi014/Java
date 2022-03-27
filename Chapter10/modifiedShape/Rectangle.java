public class Rectangle extends Shape{
	
	private double length;
	private double width;

	public Rectangle(double length, double width){
		
		super(); 
		this.length = length;
		this.width = width;
		
	}

	public void setLength(double length){
		this.length = length;
	} 

	public double getLength(){
		return length;
	}
	
	public void setWidth(double width){
		this.width = width;
	} 

	public double getWidth(){
		return width;
	}
	
	@Override 
	public double getArea(){
		return length * width;
	}
	
	public double getParameter(){
		return 2 * (length + width);
	} 
	
	public String toString(){
		return String.format("Rectangle%n\tArea %.2f%n\tParameter %.2f", getArea(), getParameter());
	}
} 

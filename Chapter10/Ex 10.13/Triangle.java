public class Triangle extends Shape{
	
	private double width;
	private double height;
	private double length;
	
	public Triangle(double width, double height, double length){
		
	super();
	
	this.width = width;
	this.height = height;
	this.length = length;
	} 

	public void setwidth(double width){
		this.width = width;
	} 

	public double getwidth(){
	return width;
	} 
	
	public void setHeight(double height){
		this.height = height;
	} 

	public double getHeight(){
	return height;
	}
	
	public void setLength(double length){
		this.length = length;
	} 

	public double getLength(){
	return length;
	}
	
	@Override 
	public double getArea(){	
	return (width * height) / 2;
	}
	
	public double getParameter(){
	return (width + height + length);
	}
	
	public String toString(){
		return String.format("Triangle%n\tArea %.2f%n\tParameter %.2f", getArea(), getParameter());
	}
}  
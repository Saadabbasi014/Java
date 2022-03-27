public class Cube extends Shape{
	
	private double width;
	private double height;
	private double length;
	
	
	public Cube(double width, double height, double length){
		
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
		return length * height * width;
	}
	
	// @Override
	public double getVolume(){
		return 6 * height * width;
	}
	
	@Override
	public String toString(){
		return String.format("Cube%n\tArea %.2f%n\tVolume %.2f", getArea(), getVolume());
	}
}
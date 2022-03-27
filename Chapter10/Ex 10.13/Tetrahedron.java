import java.io.*;
public class Tetrahedron extends Shape{
	
	private double side;
	
	public Tetrahedron(double side){
		this.side = side;
	}
	
	public void setSide(double side){
		this.side = side;
	}
	
	public double getSide(){
		return side;
	}
	
	
	@Override
	public double getArea(){
		return (Math.sqrt(3)*(side*side));
		
	}
	
	// @Override
	public double getVolume(){
		return (Math.pow(side,3) / (6 * Math.sqrt(2)));
	}
	
	@Override
	public String toString(){
		return String.format("Tetrahedron %n\tArea %.2f%n\tVolume %.2f", getArea(), getVolume());
	}
}
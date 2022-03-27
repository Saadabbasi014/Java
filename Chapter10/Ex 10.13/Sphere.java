public class Sphere extends Shape{
	
	private double radius;
	private final static double  pai = 3.14; 
	
	public Sphere(double radius){
		
		this.radius = radius;
	}
	
	public void setRaius(double radius){
		this.radius = radius;
	}
	
	public double gerRadius(){
		return radius;
	}
	
	@Override
	public double getArea(){
		return 4*pai*(radius*radius);
		
	}
	
	// @Override
	public double getVolume(){
		return (4.0/3.0)*pai *(radius * radius * radius);
	}
	
	@Override
	public String toString(){
		return String.format("Sphere%n\tArea %.2f%n\tVolume %.2f", getArea(), getVolume());
	}
}
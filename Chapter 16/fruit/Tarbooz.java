public class Tarbooz extends Melon{
	
		
	public Tarbooz(double weight, double antiOxidentAmount){
		super(weight, antiOxidentAmount);
		
	}
	
	
	public String toString(){
		// return String.format("Tarbooz%n\tWeight %s%s",  super.toString());
		return String.format("Tarbooz%nWeight%n",  super.toString());
	}
}
public class Kinu extends Citrus{
	
	
	public Kinu(double weight, double vitCAmount){
		super(weight, vitCAmount);
		
	}
	
	
	public String toString(){
		// return String.format("Kinu%n\tWeight %s%s",   super.toString());
		return String.format("Kinu%nWeight %s%n",   super.toString());
	

	}
}
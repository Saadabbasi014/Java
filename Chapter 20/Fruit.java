public abstract class Fruit{
	
	private double weight;
	public Fruit(double weight){
		this.weight = weight;
	}
	
	
	public double getWeight(){
		return weight;
	}	
	
	
	public String toString(){
		return String.format("My weight is %.2f",getWeight());
	 }
}
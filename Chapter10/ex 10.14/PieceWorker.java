public class PieceWorker extends Employee{
	
	private double wage;
	private int piece;
	
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, int piece){
		
	super(firstName, lastName, socialSecurityNumber);
	this.wage = wage;
	this.piece = piece;
	}
	
	public void setWage(double wage){
		this.wage = wage;
	}
	
	public double getWage(){
		return wage;
	}
	
	public void setPiece(int piece){
		this.piece = piece;
	}
	
	public int getPiece(){
		return piece;
	}
	
	// @Override 
	public double earnings() {  
	return getWage() * getPiece();
	}
	
	// @Override 
	public String toString(){ 
		return String.format("Piece Worker: %s%n%s: $%,.2f; %s: %d",super.toString(), "wage",getWage(), "piece", getPiece());
	}
}
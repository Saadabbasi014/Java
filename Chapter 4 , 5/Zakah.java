public class Zakah{
	
	public static void main(String [] args){
		
		int principal = 1000000;
		double rate = 0.025;
		double amount;
		double sum = 0;
	
		System.out.printf("%s%20s%n", "  Year", "          Amount    Remaining    Sum");
		
		for(int year = 1; year <= 10; year++){
			amount = principal * rate;
			principal -= amount;
			sum += amount;
	
		System.out.printf("%4d%,20.2f,%9d,%12.2f%n", year, amount,principal,sum);
		// System.out.printf("%44.2f",sum);
		
		}
		 System.out.printf("%47.2f",sum);
		 
	}
}  
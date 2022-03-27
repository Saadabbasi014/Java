import java.security.SecureRandom;

public class Craps{
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private enum status{CONTINUE, WON, LOST};
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;
	
	static int firstTimePlayerWin = 0;
	static int firstTimeCasinoWin = 0;
	static int secondTimePlayerWin = 0;
	static int secondTimeCasinoWin = 0;
	
	public static void main(String[] args){
	
    for(int roll = 0; roll < 60; roll++){
		 int myPoint = 0;
		status gameStatus;
		
		int sumOfDice = rollDice();
		
		switch(sumOfDice){
			case SEVEN:
			case YO_LEVEN:
			  gameStatus = status.WON;
			  firstTimePlayerWin += 1;
			  break;
			  
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
			  gameStatus = status.LOST;
			  firstTimeCasinoWin +=1;
			  break;
			default:
			  gameStatus = status.CONTINUE;
			  myPoint = sumOfDice;
			  System.out.printf("Point is %d%n", myPoint);
			  break;
		}
		
		while(gameStatus == status.CONTINUE){
			sumOfDice = rollDice();
			
			if(sumOfDice == myPoint){
				gameStatus = status.WON;
			    secondTimePlayerWin+=1;
			}
			else{ 
				if(sumOfDice == SEVEN)
					gameStatus = status.LOST;
	                secondTimeCasinoWin+=1;
				}
	    }
		
		//if(gameStatus == status.WON)
		//	System.out.println("Player Win");
		//else 
		//	System.out.println("Casino Loses");
	}
    	
		int totalPlayerWin = firstTimePlayerWin + secondTimePlayerWin;
		int totalCasinoWin = firstTimeCasinoWin + secondTimeCasinoWin;
		int totalAmountCasinoWin =totalCasinoWin*80;
		int totalAmountPlayerWin = totalPlayerWin*80;
		
		System.out.printf("firstTimePlayerWin:%d%n", firstTimePlayerWin);
		System.out.printf("firstTimeCasinoWin: %d%n", firstTimeCasinoWin);
		System.out.printf("secondTimePlayerWin:%d%n", secondTimePlayerWin);
		System.out.printf("secondTimeCasinoWin: %d%n", secondTimeCasinoWin);
		System.out.printf("totalPlayerWin:%d%n", totalPlayerWin);
		System.out.printf("totalCasinoWin: %d%n", totalPlayerWin);
		System.out.printf("totalAmountCasinoWin:%d%n", totalAmountCasinoWin );
		System.out.printf("totalAmountPlayerWin: %d%n", totalAmountPlayerWin);
	
	}
	    public static int rollDice(){
		
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		//System.out.printf("Player Rolled %d + %d = %d %n", die1, die2, sum);
		
		return sum;
		}
}
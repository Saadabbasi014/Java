
import java.security.SecureRandom;

public class DeckOfCards{
	
	
	private Card[] deck;
	public int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	private String[] face = {"Ace", "Duce", "Three", "Four", "Five", "Six", "Seven",
		"Eight", "Nine", "Ten", "Jack", "King", "Queen"};
	private String[] suit = {"Heaarts", "Diamonds", "Clubs", "Fades"};
	
	
	 // public String getcurrentCard(){
	 // return ;
	 // }
	
	public DeckOfCards(){
		
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		
		for(int count = 0; count < deck.length; count++){
			deck[count] = new Card(face[count % 13], suit[count / 13]);
		}
	}
	
	public void shuffle(){
		
		currentCard = 0;
		
		for(int first = 0; first < deck.length; first++){
			
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	
	public String dealCard(){
	 // if(deck[currentCard].toString()  == deck[currentCard +1].toString){

		if(currentCard < deck.length){
			return deck[currentCard++].toString();
//System.out.printf("%s%s%s",currentCard, currentCard + 1, currentCard + 2);
	}	
		else 
		    return null ;
	}
}
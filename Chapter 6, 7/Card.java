// Fig. 7.9: Card.java
// Card class represents a playing card.

public class Card{
	
	private  final String face; //(ace, duce, three)
	private  final String suit; //(hearts, dimonds)
	
	// two-argument constructor initializes card's face and suit
	public Card(String cardFace, String cardSuit){
    
		this.face = cardFace; // initialize face of card
		this.suit = cardSuit; // initialize suit of card
	}
	// return String representation of Card
	
	// public String currentFace(){
		// return face;
	// }
	public String toString(){
		return face + "of" + suit;
	}
}
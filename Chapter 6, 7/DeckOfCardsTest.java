public class DeckOfCardsTest{
	
	public static void main(String[] args){
		// for(int j = 0; j < 10; j++){
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();
		
		
		for(int i = 1; i <= 52; i++){
		//	if(myDeckOfCards.dealCard() == myDeckOfCards.dealCard()){
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			if(i % 4 == 0)
            System.out.println();

		else
	    myDeckOfCards.shuffle();
	
		 }
		
		
	}
}
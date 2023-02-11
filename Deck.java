package week6CodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>(); 
	
	
	
	Deck (){
	
		String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String [] numbers = {"Two", "Three","Four", "Five","Six", "Seven", "Eigth", "Nine", "Ten", "Jack","Queen","King","Ace"};
		for (int i=0 ; i<13; i++) {
			int count =2;
			count += i;
			for(int b=0; b<4;b++) {
				Card card = new Card(numbers[i],suits[b], count);
				cards.add(card);
					
			}
		}
		
	}


	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	
	// the  method below shows all the information about the cards in the deck using cards.describe() 
     
    public void describe () {
    	
    	int i =0;
    	for (Card card : cards){
    		i++;
    		card.describe();
    		System.out.println(i);		
    	}
    }
	
	public void shuffle () {
		Collections.shuffle(cards);	
	}
	
	public Card draw(){
		Card card = cards.remove(0);
		return card;
		
	}
}


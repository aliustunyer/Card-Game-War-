package week6CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>(); 
	int score =0;
	String name ;
	
	Player (String name){
		this.name =name;	
		
	}
	
	Player (List<Card> hand, String name, int score){
		this.hand = hand;
		this.name = name;
		this.score = score;
		
	}
	
	public List<Card> gethand() {
		return hand;
	}
	public void sethand(List<Card> hand) {
		this.hand = hand;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//the  method below is defined to show information for each player, their score,name, 
	//and the cards in their hands by using the card.describe(),
     
    public void describe() {
    	
    	int i = 1;
    	System.out.println( "============================================");
    	System.out.println( "Player Name : " + name + " == " + "Score :  " + score );
    	System.out.println( "============================================");
    	for (Card card : hand) {
    	System.out.println(i);
    	card.describe();
    	i++;	
}
	
}
    public Card flip () {
    	
    	Card card = hand.remove(0);
    	return card;	
}


    public void draw (Deck deck) {
    	
    	Card card = deck.draw();
    	hand.add(card);	
}

    public void incrementScore () {
	
    	score++;	
}
    public void progression() {
	
    	System.out.println(  "Total Score >>> " +name + " : " + score );
	
	
}
}

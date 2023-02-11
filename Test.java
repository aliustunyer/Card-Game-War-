package week6CodingAssignment;

import java.util.Scanner;

public class Test {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
				
				String player1Name;
				String player2Name;
				System.out.print("Enter the name of the first player :");
				player1Name = scanner.next();
				System.out.print("Enter the name of the second player :");
				player2Name = scanner.next();
				
				
				//(a)
		
			    Deck deck = new Deck();
			    
			    Player player1= new Player(player1Name);
			    Player player2= new Player(player2Name);
			    
			    deck.shuffle();
			    deck.describe();
			    
			    //(b)
			    
			    for (int i=1 ; i<=26; i++) {
			    	player1.draw(deck);
			    	player2.draw(deck);
			    
			    }
			   player1.describe();
			   player2.describe();
			    
			    // (c)
			    
			    for (int i =1; i<=26; i++) {
			    	
			    System.out.println("Turn Number : " + i);
			    System.out.println("---------------------------------------------");
			    	
			    	
			    Card player1Hand = player1.flip();
			    System.out.print (player1.getName() +"'s hand: ");
			    	player1Hand.describe();
			    	   
			    Card player2Hand = player2.flip();
			    System.out.print (player2.getName() +"'s hand: ");
			        player2Hand.describe();
			    
			     if (player1Hand.getValue()> player2Hand.getValue()) {
			    	 player1.incrementScore();
			    System.out.println("        "+player1.getName()+" wins this turn!!!        ");
			     }
			     else if (player1Hand.getValue()< player2Hand.getValue()) {
			    	 player2.incrementScore();
			    System.out.println("        "+player2.getName()+" wins this turn!!!        ");
			     }
			     else {
			    	 System.out.println("           !!!draw!!!      ");
			     }
			     player1.progression();
			     player2.progression();
			    
			     System.out.println("=============================================");
			       
			    	
			    	
			    }
			    
			    System.out.println("=============END OF GAME=====================");
			    System.out.println("=============================================");
			    System.out.print("Final Score for "+ player1.getName()+ ": ");
			    System.out.println(player1.getScore());
			    System.out.print("Final Score for "+ player2.getName()+ ": ");
			    System.out.println(player2.getScore());
			    
			    if (player1.getScore()> player2.getScore()) {
			    	
			    System.out.println("=============================================");
			    System.out.println("           "+player1.getName()+" WINS!!!     ");
			    System.out.println("=============================================");
			    	
			    	
			    	
			    } else if (player1.getScore()< player2.getScore()) {
			    	
			    System.out.println("=============================================");
			    System.out.println("            "+player2.getName()+" WINS!!!    ");
			    System.out.println("=============================================");
			    
			    } else {
			    	
			    System.out.println("============================================");
				System.out.println("               !!!DRAW!!!                   ");
				System.out.println("============================================");
			    	
			    }
		
				
				
			} 
			
			
	}



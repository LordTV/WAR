
public class App 
{

	public static void main(String[] args) 
	{
		
		// Instantiating a deck and 2 players
		Deck deck = new Deck();
		Player player1 = new Player("player1");
		Player player2 = new Player("player2");
	
		//shuffle the deck
		deck.shuffle();
		
		
		//each player draws 26 cards
		for(int i = 1; i <= 52; i++) 
		{
			if(i % 2 == 0) 
			{
				player1.draw(deck);
			}
			else 
			{
				player2.draw(deck);
			}
		}
		
		//26 turns happen
		for(int i = 1; i <= 26; i++) 
		{
			Card a = player1.flip();
			Card b = player2.flip();
			a.describe();
			b.describe();
			if(a.getValue() > b.getValue()) 
			{
				player1.incrementScore();
			}
			else if(a.getValue() < b.getValue()) 
			{
				player2.incrementScore();
			}
			
			//prints score each turn
			System.out.println("_______");
			System.out.println("Score:");
			System.out.println("player1: " + player1.getScore());
			System.out.println("player2: " + player2.getScore());
			System.out.println("_______");
		}
		
		//final score printed out
		System.out.println("Final Score");
		System.out.println(player1.getScore() + " to "+ player2.getScore());
		
		//decides winner
		if(player1.getScore() > player2.getScore()) 
		{
			System.out.println("player1 wins");
		}
		else if(player1.getScore() < player2.getScore()) 
		{
			System.out.println("player2 wins");
		}
		else 
		{
			System.out.println("Draw");
		}
	}

}

import java.util.List;
import java.util.ArrayList;


public class Player 
{
	
	//properties
	List<Card> hand = new ArrayList<>();
	int score;
	String name;
	
	//constructor
	public Player(String name)
	{
		this.score = 0;
		this.name = name;
	}
	
	//prints information to terminal
	public void describe() 
	
	{
		System.out.println("Name: " + this.name);
		System.out.println("Score: " + this.score);
		for(Card c : hand) 
		{
			c.describe();
		}
	}
	
	//plays top card of hand
	public Card flip() 
	{
		Card c = hand.get(0);
		hand.remove(0);
		return c;
	}
	
	//draws from a deck
	public void draw(Deck d) 
	{
		hand.add(d.draw());
	}	
	
	//increases score
	public void incrementScore() 
	{
		this.score += 1;
	}
	
	//getter for score
	public int getScore() 
	{
		return(this.score);
	}
	
}

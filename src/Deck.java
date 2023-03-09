import java.util.List;
import java.util.ArrayList;
import java.util.Random;



public class Deck {
	
	//constructor
	public Deck() 
	{
		build();
	}
	
	//array of suits
	String[] suits = {"Spades","Hearts","Diamonds","Clubs"};
	
	//list of cards
	List<Card> cards = new ArrayList<>();

	//builds the deck with the standard 52 cards
	public void build() 
	{
		for(String n : suits) 
		{
			for(int i = 2; i <= 14; i++) 
			{
				Card card = new Card(i,n);
				cards.add(card);
			}
		}
	}
	
	//shuffles the deck
	public void shuffle() 
	{
		Random rand = new Random();
		for(int i = 0; i < 52; i++) 
		{ 
			int r = rand.nextInt(51);
			Card c = cards.get(i);
			cards.set(i, cards.get(r));
			cards.set(r, c);
		}
		
	}
	
	//draws from the deck
	public Card draw() 
	{
		Card d = cards.get(0);
		cards.remove(0);
		return(d);
	}
	
}

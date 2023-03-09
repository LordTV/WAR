
public class Card {
	
	//properties
	int value;
	String name;
	
	
	//Constructor 
	public Card(Integer cardNum, String cardName) 
	{
		setValue(cardNum);
		setName(cardNum+ " of " +cardName);
	}
	
	
	//get/set value
	public int getValue()
	{
		return (this.value);
	}
	
	public void setValue(int value) 
	{
		this.value = value;
	}

	
	// get/set name
	public String getName()
	{
		return (this.name);
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	//prints card details to termiunal
	public void describe() 
	{
		System.out.println(this.name);
	}
	
}

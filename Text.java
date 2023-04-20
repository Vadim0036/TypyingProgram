import java.util.Random;

public class Text 
{
	private Random random;
	private String typyingText;
	private String usersInput;
	
	
	public Text()
	{
		this.random = new Random();
		this.typyingText = "";
		this.usersInput = "";
		setTypyingText();
	}
	
	public String getTypyingText()
	{
		return this.typyingText;
	}

	public char getTypyingTextCharAt( int i )
	{
		return this.typyingText.charAt( i );
	}
	
	public String getUsersInput() 
	{
		return this.usersInput;
	}
	
	public int getLength()
	{
		return this.typyingText.length();
	}
	
	public int getLengthUserInput()
	{
		return this.usersInput.length();
	}
	
	private String getRandomWord()
	{
		String[] words = new String[] {
				
                "apple", "banana", "cherry", "date", "elderberry",
                "fig", "grape", "kiwi", "lemon", "mango",
                "orange", "pear", "quince", "raspberry", "strawberry",
                "watermelon", "avocado", "blueberry", "coconut", "dragonfruit",
                "guava", "jackfruit", "kiwifruit", "lychee", "mangosteen",
                "nectarine", "papaya", "passion fruit", "pineapple", "pomegranate",
                "apricot", "blackberry", "cantaloupe", "cucumber", "durian",
                "grapefruit", "lime", "longan", "lychee", "melon",
                "mulberry", "olive", "peach", "plum", "pumpkin",
                "rambutan", "starfruit", "tangerine", "tomato", "ugli fruit",
                "zucchini", "artichoke", "asparagus", "beetroot", "bell pepper",
                "broccoli", "cabbage", "carrot", "cauliflower", "celery",
                "chard", "chili pepper", "corn", "cucumber", "eggplant",
                "garlic", "ginger", "kale", "leek", "lettuce",
                "mushroom", "onion", "parsley", "pea", "potato",
                "radish", "spinach", "squash", "sweet potato", "tomato",
                "turnip", "watercress", "watermelon", "zucchini", "almond",
                "cashew", "chestnut", "coconut", "hazelnut", "macadamia nut",
                "peanut", "pecan", "pine nut", "pistachio", "walnut"
                
		};
		return words[this.random.nextInt(95)];
	}
	
	private void setTypyingText()
	{
		for(int i = 0; i < 11; i++) 
		{
			this.typyingText = this.typyingText + getRandomWord() + " ";
		}
	}
	
	public void addChar(char usersInput) 
	{
		this.usersInput = this.usersInput + usersInput;
	}
	
	public boolean isCharCorrect(int position) 
	{
		try {
			if(this.usersInput.charAt(position) == this.typyingText.charAt(position)) return true;
			else return false;
		} 
		catch(NullPointerException | StringIndexOutOfBoundsException e){
			return false;
		}
	}
}

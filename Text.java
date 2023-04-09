import java.util.ArrayList;
import java.util.Random;

public class Text 
{
	
	ArrayList<String> text = new ArrayList();
	Random random = new Random();
	
	
	public Text()
	{
		setTextArray();
	}
	
	
	private void setTextArray()
	{
		for(int i = 0; i < 15; i++)
		{
			this.text.add(getWord());
		}
	}
	
	private String getWord() 
	{
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};	
		String word = ""; 
		
		int random_num = this.random.nextInt(7) + 2;
		for(int i = 0; i < random_num; i++) 
		{
			int num = this.random.nextInt(26);
			word = word + letters[num];
		}
		return word;
	}

	
	public ArrayList<String> getText()
	{
		return this.text;
	}
	
	
}

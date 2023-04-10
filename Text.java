
import java.util.ArrayList;
import java.util.Random;

public class Text 
{
	private ArrayList<String> text = new ArrayList<String>();
	private Random random = new Random();
	
	public Text()
	{
		setTextArray();
	}
	
	private String getRandomString()
	{
		char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','q','r','s','t','u','v','w','x','y','z'};
		int random_num = this.random.nextInt(6) + 2;
		String random_string = "";
		for(int i = 0; i < random_num; i++) 	
		{
			int num = this.random.nextInt(25);
			random_string = random_string + letters[num];
		}
		return random_string + " ";
	}
	
	private void setTextArray()
	{
		for(int i = 0; i< 30; i++)
		{
			this.text.add(getRandomString());
		}
	}
	
	public String getString() 
	{
	    StringBuilder string = new StringBuilder();
	    int wordCount = 0; 
	    for (int i = 0; i < this.text.size(); i++) 
	    {   
	        string.append(this.text.get(i));
	        wordCount++;
	        
	        if (wordCount % 6 == 0) string.append("\n"); 
	        else string.append(" ");     
	    }
	    return string.toString();
	}
}

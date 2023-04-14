
public class TypyingProgram 
{
	private Text typyingText;
	private TypyingWindow window;
	
	private char current_char; 
	private int current_index; 
	
	
	public TypyingProgram()
	{
		this.typyingText = new Text();
		this.window = new TypyingWindow(this);
		
		this.current_index = 0;
		this.current_char = this.typyingText.getTypyingText().charAt(this.current_index);
	}
	
	
	public void runProgram()
	{
		this.window.runProgram();
	}
	
	
	public boolean checkInput(char given_char)
	{
		if(current_char == given_char)
		{
			this.current_index ++;
			this.current_char = this.typyingText.getTypyingText().charAt(this.current_index);
			this.typyingText.addChar(given_char);
			return true;
		}
		else 
		{
			return false;
		}
	}
}

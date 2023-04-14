public class TypingProgram 
{
	private Text typyingText;
	private TypingWindow window;
	
	private int current_index; 
	
	
	public TypingProgram()
	{
		this.typyingText = new Text();
		this.window = new TypingWindow( this );
		
		this.current_index = 0;
	}
	
	public void runProgram()
	{
		this.window.runProgram();
		this.window.setText(this.typyingText);
	}
	
	public boolean checkInput(char given_char)
	{
		char current_char = this.typyingText.getTypyingTextCharAt(this.current_index);
		if(current_char == given_char)
		{
			System.out.println( "CORRECT" );
			this.current_index ++;
			this.typyingText.addChar(given_char);
			this.window.setText( this.typyingText );
			return true;
		}
		else 
		{
			return false;
		}
	}
}

public class TypingProgram 
{
	private char current_char; 
	private int current_index; 
	private Text text;
	
	private TypingWindow window;
	
	
	public TypingProgram()
	{
		this.window = new TypingWindow( this );
		this.text = new Text();
		
		this.current_index = 0; 
		this.current_char = text.getString().charAt(current_index);
	}
	
	public void runProgram()
	{
		this.window.setUpTextPanel(this.text);
		this.window.runProgram();
	}
	
	public void checkInput(char given_char)
	{
		if(this.current_char == given_char)
		{
			this.window.changeColor( this.current_index, this.text );
			this.current_index ++;
			this.current_char = text.getString().charAt(current_index); 
			System.out.println("Correct");
		}
		else {
			System.out.println("Wrong");
		}
		if(isEnd()) 
		{
			this.window.showResult( 0, 0 );
			System.out.println("Game is over ");	
		}
	}
	
	private boolean isEnd()
	{
		if (this.current_index >= this.text.getNumberOfChar()) return true;
		else return false;
	}	
}


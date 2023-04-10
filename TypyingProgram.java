public class TypyingProgram 
{
	private char current_char; 
	private int current_index; 
	private Text text;
	
	private TypyingWindow window;
	
	
	public TypyingProgram()
	{
		this.window = new TypyingWindow();
		this.text = new Text();
		
		this.current_index = 0; 
		this.current_char = text.getString().charAt(current_index);
	}
	
	public void runProgram()
	{
		this.window.setUpTextPanel(this.text);
		this.window.runProgram();
	}
	
	private void checkInput(char given_char)
	{
		if(isEnd())
		{
			this.window.showResult( 0, 0 );
		}
		else if(this.current_char == given_char) 
		{
			this.window.changeColor( this.current_index, this.text );
			this.current_index ++;
			this.current_char = text.getString().charAt(current_index); 
		}
	}
	
	private boolean isEnd()
	{
		if (this.current_index == this.text.getString().length()) return true;
		else return false;
	}	
}


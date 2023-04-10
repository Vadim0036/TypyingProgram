public class TypyingProgram 
{
	private char current_char; 
	private int current_index; 
	private TypyingWindow window;
	
	
	public TypyingProgram()
	{
		this.window = new TypyingWindow();
	}
	
	
	public void runProgram()
	{
		this.window.runProgram();
	}
}


public class TypingProgram 
{
	private Text typyingText;
	private TypingWindow window;
	private Timer timer;
	
	private int speed;
	private int accuracy;
	
	private int current_index; 
	
	
	public TypingProgram()
	{
		this.typyingText = new Text();
		this.window = new TypingWindow( this );
		
		this.current_index = 0;
		this.timer = new Timer();
	}
	
	public void runProgram()
	{
		this.window.runProgram();
		this.window.setText(this.typyingText);
	}
	
	public boolean checkInput(char given_char)
	{
		char current_char = this.typyingText.getTypyingTextCharAt(this.current_index);
		boolean x = false;
		
		if(current_char == given_char)
		{
			this.current_index ++;
			this.typyingText.addChar(given_char);
			this.window.setText( this.typyingText );
			x = true;
		}
		if(isEnd())
		{
			showResult();
			x = false;
		}
		return x;
	}
	
	public void showResult()
	{
		System.out.println("game is over");
	}
	
	public boolean isEnd()
	{
		if(this.current_index >= this.typyingText.getLength()-1) return true;
		else return false;
	}
}

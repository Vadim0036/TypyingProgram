public class TypingProgram 
{
	private Text typyingText;
	private TypingWindow window;
	private Timer timer;
	
	private int mistakes;
	private double key_pressed;
	private boolean is_incorrect;
	
	private int current_index; 
	
	
	public TypingProgram()
	{
		this.typyingText = new Text();
		this.window = new TypingWindow( this );
		this.timer = new Timer();
		
		this.mistakes = 0;
		this.key_pressed = 0;
		this.current_index = 0;
		this.is_incorrect = false;
		
		this.timer.start();
	}
	
	public void runProgram()
	{
		this.window.runProgram();
		this.window.setText(this.typyingText);
	}
	
	public boolean checkInput(char given_char)
	{
		boolean x = false;
		char current_char = this.typyingText.getTypyingTextCharAt(this.current_index);
		this.key_pressed += 1;
		 
		if(current_char == given_char)
		{
			this.current_index ++;
			this.typyingText.addChar(given_char);
			this.window.setText( this.typyingText );
			this.is_incorrect = false;
			x = true;
		}
		else if(current_char != given_char)
		{	
			if(this.is_incorrect == false) {
				this.mistakes +=1;
				this.is_incorrect = true;
			}
		}
		if(isEnd())
		{
			this.timer.stop();
			showResult();
			x = false;
		}
		return x;
	}
	
	private void showResult()
	{
		this.window.setResult(calcSpeed(), calcAccuracy());
	}
	
	private boolean isEnd()
	{
		if(this.current_index >= this.typyingText.getLength()-1) return true;
		else return false;
	}
	
	private double calcAccuracy()
	{	
		double accuracy = ((this.typyingText.getLength()-this.mistakes) / this.key_pressed)*100;
		if (accuracy > 100) return 100.0;
		else return Math.round(accuracy);
	}
	
	private int calcSpeed()
	{
		double final_time =  Math.round(this.timer.getFinalTime() - 2);
		
		int speed = (int)((60.0 / final_time) * this.typyingText.getLength());
		
		return speed;
	}
}

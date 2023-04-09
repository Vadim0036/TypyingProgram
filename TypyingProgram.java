import java.awt.Color;
import javax.swing.JFrame;

public class TypyingProgram 
{
	
	private JFrame window;
	
	
	public TypyingProgram()
	{
		this.window = new JFrame();
		setWindow();
	}
	
	
	public void start()
	{
		this.window.setVisible(true);
	}
	
	
	private void setWindow()
	{
		this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.window.setLayout(null);
		this.window.setSize(600, 500);
		this.window.setBackground(Color.BLUE);
	}
	
	
}

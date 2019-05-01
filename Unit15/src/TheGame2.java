import javax.swing.JFrame;
import java.awt.Component;

public class TheGame2 extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	
	public TheGame2()
	{
		super("PONG 2");
		setSize(WIDTH, HEIGHT);
		
		Pong2 game = new Pong2();
		
		((Component)game).setFocusable(true);
		getContentPane().add(game);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		TheGame2 run = new TheGame2();
	}
}

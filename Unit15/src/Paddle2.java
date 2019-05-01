import java.awt.Color;
import java.awt.Graphics;

public class Paddle2 extends Paddle
{
	public Paddle2()
	{
		super();
	}
	public Paddle2(int x, int y)
	{
		super(x,y);
		super.setSpeed(5);
	}
	public Paddle2(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		super.setSpeed(5);
	}
	public Paddle2(int x, int y, int spd)
	{
		super(x,y);
		super.setSpeed(spd);
	}
	public Paddle2(int x, int y, int w, int h, int spd)
	{
		super(x,y,w,h);
		super.setSpeed(spd);
	}
	public Paddle2(int x, int y, int w, int h, Color col, int spd)
	{
		super(x,y,w,h,col,spd);
	}
	public void moveRightAndDraw(Graphics window)
	{
		draw(window, Color.WHITE);
		setX(getX()+super.getSpeed());
		draw(window);
	}
	public void moveLeftAndDraw(Graphics window)
	{
		draw(window, Color.WHITE);
		setX(getX()-super.getSpeed());
		draw(window);
	}
}

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private boolean alive;

	public Alien()
	{
		this(0,0,30,30,0);
		alive = true;
	}

	public Alien(int x, int y)
	{
		this.setX(x);
		this.setY(y);
		alive = true;
	}

	public Alien(int x, int y, int s)
	{
		this.setX(x);
		this.setY(y);
		setSpeed(s);
		alive = true;
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		alive = true;
		try
		{
			URL url = getClass().getResource("/images/alien.jpg");
			image = ImageIO.read(new File("H:\\APCSA Units\\Unit17Students\\Unit17_Assignments-starfighter\\Alien.jpg"));
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}
	
	public void setAlive(boolean s)
	{
	   alive = s;
	}

	public boolean getAlive()
	{
	   return alive;
	}

   public void move(String direction)
	{
		if (direction.equals("UP")) {
			this.setY(this.getY() - 1);
		}
		
		if (direction.equals("DOWN")) {
			this.setY(this.getY() + 1);
		}
		
		if (direction.equals("LEFT")) {
			this.setX(this.getX() - 1);
		}
		
		if (direction.equals("RIGHT")) {
			this.setX(this.getX() + 1);
		}

	}
   
	public void move2( String direction, Graphics window)
	{
		if (direction.equals("UP")) {
			this.draw2 (window, Color.BLACK);
			this.setY(this.getY() - 1);
			this.draw(window);
		}
		
		if (direction.equals("DOWN")) {
			this.draw2 (window, Color.BLACK);
			this.setY(this.getY() + 20);
			this.draw(window);
		}
		
		if (direction.equals("LEFT")) {
			this.draw2 (window, Color.BLACK);
			this.setX(this.getX() - 1);
			this.draw(window);
		}
		
		if (direction.equals("RIGHT")) {
			this.draw2 (window, Color.BLACK);
			this.setX(this.getX() + 1);
			this.draw(window);
		}
	}
	
	public void draw2( Graphics window, Color col )
	{
		window.setColor(col);
		window.fillRect(this.getX() + 40,this.getY(), 40, 40);
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
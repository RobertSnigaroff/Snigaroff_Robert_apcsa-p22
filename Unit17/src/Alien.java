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
	private boolean dead;

	public Alien()
	{
		this(0,0,30,30,0);
		dead = false;
	}

	public Alien(int x, int y)
	{
		super(x, y);
		dead = false;
	}

	public Alien(int x, int y, int s)
	{
		super(x, y);
		speed = s;
		dead = false;
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s;
		dead = false;
		try
		{
			image = ImageIO.read(new File("H:\\APCSA Units\\Unit17Students\\Unit17_Assignments-starfighter\\alien.jpg"));
		}
		catch(Exception e)
		{
			System.out.print(e);
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
	
	public void setDead(boolean bool)
	{
		dead = bool;
	}
	
	public boolean getDead()
	{
		return dead;
	}

   public void move(String direction)
	{
	    if (direction.equals("UP")) {
			setY(this.getY() - 1);
		}
		if (direction.equals("DOWN")) {
			setY(this.getY() + 1);
		}
		if (direction.equals("LEFT")) {
			setX(this.getX() - 1);
		}
		if (direction.equals("RIGHT")) {
			setX(this.getX() + 1);
		}
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

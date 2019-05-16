import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(10,10,10,10,10);
	}

	public Ship(int x, int y)
	{
	   this.setX(x);
	   this.setY(y);
	}

	public Ship(int x, int y, int s)
	{
	   this.setX(x);
	   this.setY(y);
	   speed = s;
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			image = ImageIO.read(new File("H:\\APCSA Units\\Unit17Students\\Unit17_Assignments-starfighter\\ship.jpg"));
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

	public void move(String direction)
	{
		if (direction.equals("UP")) {
			setY(this.getY() - speed);
		}
		
		if (direction.equals("DOWN")) {
			setY(this.getY() + speed);
		}
		
		if (direction.equals("LEFT")) {
			setX(this.getX() - speed);
		}
		
		if (direction.equals("RIGHT")) {
			setX(this.getX() + speed);
		}

	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
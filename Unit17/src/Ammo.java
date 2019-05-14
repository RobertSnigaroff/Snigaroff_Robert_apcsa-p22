//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;

public class Ammo extends MovingThing
{
	private int speed;
	private boolean visible;

	public Ammo()
	{
		this(0,0,0);
		visible = false;
	}

	public Ammo(int x, int y)
	{
		this.setX(x);
		this.setY(y);
	}

	public Ammo(int x, int y, int s)
	{
		this.setX(x);
		this.setY(y);
		speed = s;
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void draw( Graphics window)
	{
		window.setColor(Color.YELLOW);
		window.fillRect(this.getX() +20,this.getY(), 10, 10);
	}
	
	public void draw2( Graphics window, Color col )
	{
		window.setColor(col);
		window.fillRect(this.getX() +20,this.getY(), 10, 10);
	}
	
	public void setVisible(boolean s) {
		visible = s;
	}
	
	public boolean getVisible() {
		return visible;
	}
	
	public void move2( String direction, Graphics window)
	{
		if (direction.equals("UP")) {
			draw2 (window, Color.BLACK);
			this.setY(this.getY() - speed);
			draw2(window, Color.YELLOW);
		}
		
		if (direction.equals("DOWN")) {
			draw2 (window, Color.BLACK);
			this.setY(this.getY() + speed);
			draw2(window, Color.YELLOW);
		}
		
		if (direction.equals("LEFT")) {
			draw2 (window, Color.BLACK);
			this.setX(this.getX() - speed);
			draw2(window, Color.YELLOW);
		}
		
		if (direction.equals("RIGHT")) {
			draw2 (window, Color.BLACK);
			this.setX(this.getX() + speed);
			draw2(window, Color.YELLOW);
		}
	}
	
	public void move( String direction)
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


	public String toString()
	{
		return "";
	}
}
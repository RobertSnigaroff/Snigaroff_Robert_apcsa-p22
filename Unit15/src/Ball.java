//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y, int xspd, int yspd)
	{
		super(x, y);
		xSpeed = xspd;
		ySpeed = yspd;
	}
	
	public Ball(int x, int y, int w, int xspd, int yspd)
	{
		super(x, y, w);
		xSpeed = xspd;
		ySpeed = yspd;
	}
	
	public Ball(int x, int y, int w, int h, int xspd, int yspd)
	{
		super(x, y, w, h);
		xSpeed = xspd;
		ySpeed = yspd;
	}
	
	public Ball(int x, int y, int w, int h, Color col, int xspd, int yspd)
	{
		super(x, y, w, h, col);
		xSpeed = xspd;
		ySpeed = yspd;
	}
	
	   
   //add the set methods
	public void setXSpeed(int xspd)
	{
		xSpeed = xspd;
	}
	
	public void setYSpeed(int yspd)
	{
		ySpeed = yspd;
	}
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location
	   draw(window, Color.WHITE);
	   setX(getX() + xSpeed);
	   setY(getY() + ySpeed);
	   draw(window);

		//draw the ball at its new location
	   
   }
   
	public boolean equals(Ball obj)
	{
		if (getX() == obj.getX() && getY() == obj.getY() && getWidth() == obj.getWidth() && getHeight() == obj.getHeight() && getColor() == obj.getColor()) {
			return true;
		}
		return false;
	}   

   //add the get methods
	public int getXSpeed()
	{
		return xSpeed;
	}
	
	public int getYSpeed()
	{
		return ySpeed;
	}
	
	public boolean didCollideLeft(Object obj) {
		Paddle paddle = (Paddle)obj;
		if (getX()<=paddle.getX()+paddle.getWidth()&&getX()>paddle.getX()&&(getY()>=paddle.getY() && getY()<=paddle.getY()+paddle.getHeight())){
			return true;
		}
		return false;
	}

	public boolean didCollideRight(Object obj) {
		Paddle paddle = (Paddle)obj;
		if (getX()+getWidth()>=paddle.getX()&&getX()<paddle.getX()&&(getY()>=paddle.getY() && getY()<=paddle.getY()+paddle.getHeight())){
			return true;
		}
		return false;
	}

	public boolean didCollideTop(Object obj) {
		Paddle paddle = (Paddle)obj;
		if (getY()+getHeight()>=paddle.getY() && getY() < paddle.getY()+paddle.getHeight() && (getX()>=paddle.getX() && getX()+getWidth()<=paddle.getX()+paddle.getWidth())){
			return true;
		}
		return false;
	}

	public boolean didCollideBottom(Object obj) {
		Paddle paddle = (Paddle) obj;
		if (getY()+getHeight()>paddle.getY() && getY() <= paddle.getY()+paddle.getHeight() && (getX()>=paddle.getX() && getX()+getWidth()<=paddle.getX()+paddle.getWidth())){
					return true;			
				}
		return false;
	}

   //add a toString() method
	public String toString()
	{
		String output = "" + super.toString() + " " + getXSpeed() + " " + getYSpeed();
		return output;
	}
}
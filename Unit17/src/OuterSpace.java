//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	private Alien alienOne;
	private Alien alienTwo;
    private AlienHorde horde;
	private Bullets shots;
	private boolean bulletexist;
	private boolean[] keys;
	private BufferedImage back;
	private String direction;

	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];
		
		//INSTANTIATING EVERYTHING
		ship = new Ship(400,300,50,50,10);
		alienOne = new Alien(200,100,30,30,2);
		alienTwo = new Alien(300,100,30,30,2);
		shots = new Bullets();
		horde = new AlienHorde();
		direction = "RIGHT";

		//makes the alien horde
		for (int i = 5; i < 800; i+=100) {
			for (int j = 25; j < 126; j+= 50) {
				horde.add(new Alien(i,j, 40, 40, 2));
			}
		}
		
		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		
		
		
		//draws the aliens and the ship
		ship.draw(graphToBack);
		horde.drawEmAll(graphToBack);
		
		
		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship

		if (bulletexist == true && shots.get(0).getY() <= 0) {
			shots.get(0).setVisible(false);
			shots.remove(0);
			bulletexist = false;
		}
		
		if (bulletexist == true && shots.get(0).isVisible() == true && shots.get(0).getY() > 0) {
			shots.get(0).move2("UP", graphToBack);
		}
		
		
		
		//moves aliens
		horde.moveEmAll(direction, graphToBack);
		
		if (horde.get(horde.getSize()-1).getX() + horde.get(horde.getSize()-1).getWidth() >= 785) {
			direction = "DOWN";
			horde.moveEmAll(direction, graphToBack);
			direction = "LEFT";
		}
		if (horde.get(0).getX() + horde.get(0).getWidth() <= 30) {
			direction = "DOWN";
			horde.moveEmAll(direction, graphToBack);
			direction = "RIGHT";
		}
		
		if (ship.getX() >= 745) {
			ship.setX(745);
		}
		if (ship.getX()  <-10) {
			ship.setX(-10);
		}
		if (ship.getY() >= 510) {
			ship.setY(510);
		}
		if (ship.getY() < 0) {
			ship.setY(0);
		}
		
		
		
		
		//KEYS TO MOVE THE SHIP
		if(keys[0] == true)
		{
			ship.move("LEFT");
			System.out.println(ship.getX() + " " + ship.getY());
		}

		if(keys[1] == true)
		{
			ship.move("RIGHT");
			System.out.println(ship.getX() + " " + ship.getY());
		}

		if(keys[2] == true)
		{
			ship.move("UP");
			System.out.println(ship.getX() + " " + ship.getY());
		}

		if(keys[3] == true)
		{
			ship.move("DOWN");
			System.out.println(ship.getX() + " " + ship.getY());
		}
		if(keys[4] == true)
		{
			bulletexist = true;
			shots.add(new Ammo(ship.getX(), ship.getY()));
			shots.get(0).setVisible(true);
			shots.cleanEmUp2();
		}
		
		//collision detection
		for (Alien a : horde.getAliens()) {
			if (lCollide(a)) {
				a.setAlive(false);
			}
			if (rCollide(a)) {
				a.setAlive(false);
			}
			if (bCollide(a)) {
				a.setAlive(false);
			}
		}
		
		horde.removeDeadOnes();
		
		twoDGraph.drawImage(back, null, 0, 0);
		
	}

	
	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
   
 //COLLISION DETECTIONS
 //X AND Y ARE IN TOP LEFT AND DRAWS RIGHT AND DOWN!!!
 public boolean lCollide (MovingThing n) {
 	   if(shots.get(0).getX() + 2*shots.get(0).getSpeed() >= n.getX() && shots.get(0).getX() < n.getX() + n.getWidth() /2 && shots.get(0).getY() >= n.getY() && shots.get(0).getY() <=  n.getY() + n.getHeight())
 			return true;
 	   else
 		   return false;
 }

 public boolean rCollide (MovingThing n){
 	   if(shots.get(0).getX() + 2*shots.get(0).getSpeed() <= n.getX() + n.getWidth() && shots.get(0).getX() >= n.getX() + n.getWidth()/2 && shots.get(0).getY() >= n.getY() && shots.get(0).getY() <=  n.getY() + n.getHeight())
 			return true;
 	   else
 		   return false;
 }

 public boolean tCollide(MovingThing n){
 	   if(shots.get(0).getY() + 2*shots.get(0).getSpeed() >= n.getY() && shots.get(0).getY() <= n.getY() + n.getHeight()/2 && shots.get(0).getX() >= n.getX() && shots.get(0).getX() <=  n.getX() + n.getWidth())
 			return true;
 	   else
 		   return false;
 }

 public boolean bCollide(MovingThing n){
 	   if(shots.get(0).getY() + 2*shots.get(0).getSpeed() <= n.getY() + n.getHeight() && shots.get(0).getY() >= n.getY() + n.getHeight()/2 && shots.get(0).getX() >= n.getX() && shots.get(0).getX() <=  n.getX() + n.getWidth())
 			return true;
 	   else
 		   return false;
 }
 
}
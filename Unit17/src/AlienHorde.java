//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde()
	{
		aliens = new ArrayList<Alien>();
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}
	
	public void remove(Alien al)
	{
		aliens.remove(al);
	}
	
	public void removeAll()
	{
		for (Alien a : aliens) {
			aliens.remove(a);
		}
	}
	
	public int getSize()
	{
		return aliens.size();
	}

	public void drawEmAll(Graphics window)
	{
		for (Alien a : aliens) {
			a.draw(window);
		}
	}
	
	public Alien get(int i)
	{
		return aliens.get(i);
	}

	public void moveEmAll(String direction, Graphics window)
	{
		for (Alien a : aliens) {
			a.move2(direction, window);
		}
	}

	public void removeDeadOnes()
	{
		for (Alien a : aliens) {
			if (a.getAlive() == false) {
				aliens.remove(a);
			}
		}
	}
	
	public List<Alien> getAliens()
	{
		return aliens;
	}

	public String toString()
	{
		return "";
	}
}
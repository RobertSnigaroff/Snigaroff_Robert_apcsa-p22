import java.awt.Color;
import java.awt.Graphics;

public class Tile extends Block
{
	private boolean visible;
	private String name;
	
	public Tile()
	{
		super();
		setWidth(80);
		setHeight(40);
		setColor(Color.BLUE);
	}
	public Tile(int x, int y)
	{
		super(x,y);
		setColor(Color.BLUE);
	}
	public Tile(int x, int y, int w)
	{
		super(x,y,w);
		setColor(Color.BLUE);
	}
	public Tile(int x, int y, int w, int h)
	{
		super(x,y,w,h);
		setColor(Color.BLUE);
	}
	public Tile(int x, int y, int w, int h, Color col)
	{
		super(x,y,w,h,col);
	}
	public void setName(String newName)
	{
		name = newName;
	}
	public String getname()
	{
		return name;
	}
	
}

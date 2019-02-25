//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		one = 0;
		two = 0;
		three = 0;
		four = 0;
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double[] array = {one,two,three,four};
		double biggest = array[0];
		for (int i = 0;i<array.length;i++) {
			if (array[i]>biggest) {
				biggest = array[i];
			}
		}
		return biggest;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four + "\n" + "biggest = " + getBiggest();
	}
}
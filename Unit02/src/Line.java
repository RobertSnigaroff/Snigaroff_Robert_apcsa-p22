//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Robert Snigaroff
//Date - 02/04/19

public class Line
{
	public static double getSlope( double x1, double y1, double x2, double y2 )
	{
		double S =  0;
		S = (y2 - y1)/(x2 - x1);
		return S;
	}

}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Robert Snigaroff
//Date - 02/07/19

public class AvgLen
{
   public static double go( String a, String b )
	{
	   double aLength = a.length();
	   double bLength = b.length();
	   double avgLength = (aLength + bLength)/2;
	   return avgLength;
	}
}
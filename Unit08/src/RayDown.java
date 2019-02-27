//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Robert Snigaroff
//Date - 02/27/19

public class RayDown
{
	private int[] array;
	
	public RayDown()
	{
		setArray(null);
	}
	public RayDown(int[] numArray)
	{
		setArray(numArray);
	}
	public void setArray(int[] numArray)
	{
		array = numArray;
	}
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		for (int i=0;i<numArray.length-1;i++) {
			if (numArray[i] <= numArray[i+1]) {
				return false;
			}
		}
		return true;
	}	
}
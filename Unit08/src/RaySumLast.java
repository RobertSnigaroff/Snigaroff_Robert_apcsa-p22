//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Robert Snigaroff
//Date - 02/25/19

public class RaySumLast
{
	private int[] array;
	
	public void setRay(int[] ray)
	{
		array = ray;
	}
	public int go(int[] ray)
	{
		int sum = 0;
		for (int i=0;i<array.length;i++) {
			if (array[i] > array[array.length-1]) {
				sum = sum + array[i];
			}
		}
		if (sum == 0) {
			return -1;
		}
		return sum;
	}
	public String toString()
	{
		return "" + go(array);
	}
}
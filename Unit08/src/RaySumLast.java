//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Robert Snigaroff
//Date - 02/25/19

public class RaySumLast
{
	private int arrayLength;
	private int[] array;
	
	public RaySumLast() 
	{
		arrayLength = 0;
	}
	public RaySumLast(int l, int[] ray) 
	{
		setLength(0);
		setNums(ray);
	}
	public void setLength(int l)
	{
		arrayLength = l;
	}
	public void setNums(int[] ray)
	{
		array = ray;
	}
	public int go(int[] ray)
	{
		int sum = 0;
		for (int i=0;i<ray.length;i++) {
			if (ray[i] > ray[ray.length-1]) {
				sum = sum + ray[i];
			}
		}
		if (sum == 0) {
			return -1;
		}
		return sum;
	}
	public String toString()
	{
		return go();
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Robert Snigaroff
//Date - 02/25/19

public class RaySumLast
{
	private int[] array;
	
	public RaySumLast()
	{
		setRay(null);
	}
	public RaySumLast(int[] ray)
	{
		setRay(ray);
	}
	public void setRay(int[] ray)
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
		return "" + go(array);
	}
}
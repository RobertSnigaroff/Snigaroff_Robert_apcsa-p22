//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	private int[] array;
	public RayOddToEven() 
	{
		setRay(null);
	}
	public RayOddToEven(int[] ray)
	{
		setRay(ray);
	}
	public void setRay(int[] ray)
	{
		array = ray;
	}
	public int go(int[] ray)
	{
		for (int i=0;i<ray.length;i++) {
			if (ray[i]%2 != 0) {
				for (int j=i;j<ray.length;j++) {
					if (ray[j]%2 == 0) {
						return j - i;
					}
				}
			}
		}
		return -1;
	}
}
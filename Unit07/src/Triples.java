//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		number = 0;
	}

	public Triples(int num)
	{
		setNum(0);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcd = 0;
		int min = Math.min(a, b);
		min = Math.min(min, c);
		
		for (int i=min;i>=1;i--) {
			if ((a%i==0) && (b%i==0) && (c%i==0)) {
				gcd = i;
				break;
			}
		}
		
		return gcd;
	}

	public String findNumbers() {
		int[] sums = new int[18];
		
		for (int a=1;a<number;a++) {
			for (int b=1;b<number;b++) {
				for (int c=1;c<number;c++) {
					if (a*a + b*b == c*c) {
						
						if (a%2 == 0 && b%2 != 0 && c%2 != 0) {
							if (greatestCommonFactor(a,b,c)<=1) {
								if (b>a) {
									
									System.out.println(a + " " + b + " " + c);
								}	
									
								
							}
							
						}
						else if (a%2 != 0 && b%2 == 0 && c%2 != 0) {
							if (greatestCommonFactor(a,b,c)<=1) {
								if (b>a) {
								
									System.out.println(a + " " + b + " " + c);
								
								}
							}
							
						}
						
					}
					
				}
			}
		}

		return "";
	}

	public String toString()
	{
		return findNumbers();
	}
}
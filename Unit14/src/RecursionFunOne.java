//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	private static int evenCount = 0;

	public static int countOddDigits(int num)
	{
		String number = "" + num;
		
		if ((int)number.charAt(0) > 0) {
			if ((int)number.charAt(0) % 2 != 0) {
				evenCount++;
			}
			if (number.length() > 2) {
				String str = number.substring(1, number.length()+1);
				countOddDigits(Integer.parseInt(str));
			}
			String str = number.substring(1, number.length()+1);
			countOddDigits(Integer.parseInt(str));
		}
		
		return evenCount;
	}
}
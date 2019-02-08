//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Robert Snigaroff
//Date - 02/08/19
//Class - APCSA
//Lab  - Odd or Even String

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		
		StringOddOrEven test = new StringOddOrEven();
		
		System.out.print("Enter a word :: ");
		String s = keyboard.next();
		test.setString(s);
		System.out.println(test);
	}
}
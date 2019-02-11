//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		StringEquality check = new StringEquality();
		
		check.setWords("hello","goodbye");
		System.out.print(check);
		
		check.setWords("one","two");
		System.out.print(check);
		
		check.setWords("three","four");
		System.out.print(check);
		
		check.setWords("TCEA","UIL");
		System.out.print(check);
		
		check.setWords("State","Champions");
		System.out.print(check);
		
		check.setWords("ABC","ABC");
		System.out.print(check);
		
		check.setWords("ABC","CBA");
		System.out.print(check);
		
		check.setWords("Same","Same");
		System.out.print(check);
	}
}
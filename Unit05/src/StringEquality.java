//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringEquality
{
	private String wordOne, wordTwo;
	private int compare;

	public StringEquality()
	{
		wordOne = "";
		wordTwo = "";
		compare = 0;
	}

	public StringEquality(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
		compare = 0;
	}

	public void checkEquality( )
	{
		 compare = wordOne.compareTo(wordTwo);
	}

	public String toString()
	{
		checkEquality();
		if (compare == 0) {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
		else {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
	}
}
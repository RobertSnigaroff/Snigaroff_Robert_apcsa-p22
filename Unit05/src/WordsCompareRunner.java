//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Robert Snigaroff
//Date - 02/08/19
//Class - APCSA
//Lab  - Dictionary

import static java.lang.System.*;

public class WordsCompareRunner
{
	public static void main( String args[] )
	{
		//add compare cases
	  
	   WordsCompare compare = new WordsCompare();
	   
	   compare.setWords("abe","ape");
	   System.out.print(compare);

	   compare.setWords("giraffe","gorilla");
	   System.out.print(compare);

	   compare.setWords("one","two");
	   System.out.print(compare);
	   
	   compare.setWords("fun","funny");
	   System.out.print(compare);
	   
	   compare.setWords("123","19");
	   System.out.print(compare);

	   compare.setWords("193","1910");
	   System.out.print(compare);

	   compare.setWords("goofy","godfather");
	   System.out.print(compare);

	   compare.setWords("funnel","fun");
	   System.out.print(compare);

	}
}
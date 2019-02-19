//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover(String s, char rem)
	{
		//call set
		setRemover("",'0');
	}

	//add in second constructor
	public LetterRemover()
	{
		sentence = "";
		lookFor = '\u0000';
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		while (cleaned.indexOf(lookFor) > -1) {
			cleaned.replace(lookFor, '\u0000');
		}
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters();
	}
}
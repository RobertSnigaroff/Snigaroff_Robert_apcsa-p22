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
		setRemover("",'\u0000');
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
		String cleaned = "";
		for (int i = 0;i<sentence.length();i++) {
			if (sentence.charAt(i)!=lookFor) {
				cleaned = cleaned + sentence.charAt(i);
			}
		}
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor + "\n" + removeLetters() + "\n\n";
	}
}
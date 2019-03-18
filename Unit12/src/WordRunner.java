//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));
		
		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<Word> words = new ArrayList<Word>();

		for (int i=0;i<size;i++) {
			Word word = new Word(file.next());
			words.add(word);
		}
		
		Word bigWord = words.get(0);
		for (int i=0;i<size;i++) {
			if (words.get(i).compareTo(bigWord) > 0) {
				bigWord = words.get(i);
			}
		}
		
		for (int i=0;i<size;i++) {
			System.out.println(words.get(i).getWord());
		}
	}
}
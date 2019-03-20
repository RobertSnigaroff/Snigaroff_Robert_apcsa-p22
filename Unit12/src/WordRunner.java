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
		
		ArrayList<Word> wordsInOrder = new ArrayList<Word>();
		int listSize = words.size();
		for (int i=0;i<listSize;i++) {
			Word bigWord = new Word("");
			int bigIndex = 0;
			for (int j=0;j<words.size();j++) {
				if (words.get(j).compareTo(bigWord) == 0) {
					if (words.get(j).getWord().compareTo(bigWord.getWord()) > 0) {
						bigWord = words.get(j);
						bigIndex = j;
					}
					
				} 
				else if (words.get(j).compareTo(bigWord) == 1) {
					bigWord = words.get(j);
					bigIndex = j;
				}
			
			}
			words.remove(bigIndex);
			wordsInOrder.add(0,bigWord);			
		}
		
		for (int i=0;i<wordsInOrder.size();i++) {
			System.out.println(wordsInOrder.get(i).getWord());
		}
	}
}
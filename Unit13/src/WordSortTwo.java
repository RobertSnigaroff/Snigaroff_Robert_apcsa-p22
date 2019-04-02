//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for (int k=0;k<wordRay.length;k++) {
			for (int n=k+1;n<wordRay.length;n++) {
				if (wordRay[k].compareTo(wordRay[n]) > 0) {
					String temp = wordRay[k];
					wordRay[k] = wordRay[n];
					wordRay[n] = temp;
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		for (String str : wordRay) {
			output = output + "\n" + str;
		}
		return output+"\n\n";
	}
}
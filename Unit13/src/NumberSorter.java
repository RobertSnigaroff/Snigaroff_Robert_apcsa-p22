//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int[] newSorted = new int[getNumDigits(number)];
		int num = number;
		for (int i=0;i<sorted.length;i++) {
			sorted[i] = num % 10;
			num = num / 10;
		}
		for (int k=0;k<sorted.length;k++) {
			int small = sorted[k];
			for (int n=0;n<sorted.length;n++) {
				if (sorted[n] < small) {
					small = sorted[n];
				}
			}
			newSorted[k] = small;
		}
		return newSorted;
	}
}
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
		int num = number;
		for (int i=0;i<sorted.length;i++) {
			int newNumber = num % 10;
			sorted[i] = newNumber;
			num = num / 10;
		}
		for (int k=0;k<sorted.length;k++) {
			for (int n=k+1;n<sorted.length;n++) {
				if (sorted[k] > sorted[n]) {
					int temp = sorted[k];
					sorted[k] = sorted[n];
					sorted[n] = temp;
					
				}
			}
		}
		return sorted;
	}
}
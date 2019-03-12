//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		for (int i=0;i<word.length();i++) {
			for (int j=0;j<=i+1;j++) {
				for (int k=i;k<j;k++) {
					for (int n=0;n<i+1;n++) {
						System.out.print(word.substring(0,j));
					}
				}
				
			}
			System.out.print("\n");
		}
	}
}
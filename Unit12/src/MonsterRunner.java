//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		out.print("Enter 1st monster's name : ");
		String name1 = keyboard.next();
		out.print("Enter 1st monster's size : ");
		int size1 = keyboard.nextInt();
		out.print("Enter 2nd monster's name : ");
		String name2 = keyboard.next();
		out.print("Enter 2nd monster's size : ");
		int size2 = keyboard.nextInt();
		
		//instantiate monsters
		Skeleton first = new Skeleton(name1, size1);
		Skeleton second = new Skeleton(name2, size2);
		
		System.out.println("\nMonster 1 - " + first);
		System.out.println("Monster 2 - " + second);
		
		if (first.isBigger(second) == true) {
			System.out.println("\nMonster one is bigger than Monster two.");
		}
		else {
			System.out.println("\nMonster one is smaller than Monster two");
		}
		
		if (first.namesTheSame(second) == true) {
			System.out.println("Monster one has the same name as Monster two");
		}
		else {
			System.out.println("Monster one does not have the same name as Monster two");
		}
	}
}
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test = new ToyStore();
		
		test.loadToys("Sorry");
		test.loadToys("Bat");
		test.loadToys("Sorry");
		test.loadToys("Sorry");
		test.loadToys("Sorry");
		test.loadToys("Train");
		test.loadToys("Train");
		test.loadToys("Teddy");
		test.loadToys("Teddy");
		test.loadToys("Ball");
		test.loadToys("Ball");
		
		out.print(test);
	}
}
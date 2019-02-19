//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		Word test = new Word();
		
		test.setString("Hello");
		out.print(test);
		
		out.print("\n\n");
		
		test.setString("World");
		out.print(test);
		
		out.print("\n\n");
		
		test.setString("JukeBox");
		out.print(test);
		
		out.print("\n\n");
		
		test.setString("TCEA");
		out.print(test);
		
		out.print("\n\n");
		
		test.setString("UIL");
		out.print(test);
	}
}
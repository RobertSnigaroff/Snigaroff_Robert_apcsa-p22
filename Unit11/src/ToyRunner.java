//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy test = new Toy();
		
		test.setCount(1);
		test.setName("sorry");
		out.print(test);
		
		out.print("\n\n");
		
		test.setCount(5);
		test.setName("gi joe");
		out.print(test);
	}
}
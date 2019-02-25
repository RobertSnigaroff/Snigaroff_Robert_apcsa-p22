//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = '\u0000';
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		setLetter('\u0000');
		setAmount(0);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	public String letterArranger() {
		for (int i = amount;i>0;i--) {
			for (int j = 0;j<i;j++) {
				for (int k = amount-j;k>0;k--) {
					int lettervalue = letter + j;
					if (lettervalue>90) {
						System.out.print((char)(letter+j-26));
					}
					else {
						System.out.print((char)(letter+j));
					}
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		return "";
	}

	public String toString()
	{
		return letterArranger();
	}
}
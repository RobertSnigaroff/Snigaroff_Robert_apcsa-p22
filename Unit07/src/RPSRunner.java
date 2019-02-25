//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		do {
			out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			
			//read in the player value
		
			RockPaperScissors game = new RockPaperScissors();		
			
			game.setPlayers(keyboard.next().charAt(0));
			
			out.print(game + "\n" + "\n" + "Do you want to play again? y/n" + "\n");
			response = keyboard.next().charAt(0);
			
		} while (response == 'y');
	}
}




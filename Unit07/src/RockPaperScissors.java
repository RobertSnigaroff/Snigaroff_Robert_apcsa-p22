//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private char playChoice;
	private char compChoice;

	public RockPaperScissors()
	{
		playChoice = '\u0000';
		compChoice = '\u0000';
	}

	public RockPaperScissors(String player)
	{
		setPlayers('\u0000');
	}

	public void setPlayers(char player)
	{
		playChoice = player;
		int rand = (int)(3*Math.random());
		switch(rand) {
		case 0: compChoice = 'R';
			break;
		case 1: compChoice = 'P';
			break;
		case 2: compChoice = 'S';
			break;
		}
	}

	public String determineWinner()
	{
		String winner="";
		
		if (playChoice == 'R' && compChoice == 'R') {
			winner = "none";
		}
		else if (playChoice == 'R' && compChoice == 'P') {
			winner = "computer";
		}
		else if (playChoice == 'R' && compChoice == 'S') {
			winner = "player";
		}
		else if (playChoice == 'P' && compChoice == 'R') {
			winner = "player";
		}
		else if (playChoice == 'P' && compChoice == 'P') {
			winner = "none";
		}
		else if (playChoice == 'P' && compChoice == 'S') {
			winner = "computer";
		}
		else if (playChoice == 'S' && compChoice == 'R') {
			winner = "computer";
		}
		else if (playChoice == 'S' && compChoice == 'P') {
			winner = "player";
		}
		else if (playChoice == 'S' && compChoice == 'S') {
			winner = "none";
		}
		return winner;
	}

	public String toString()
	{
		String output="";
		if (determineWinner() == "none") {
			output = "!Draw Game!";
		}
		else if (determineWinner() == "player") {
			String extra = "";
			if (playChoice == 'R') {
				extra = "<<Rock Breaks Scissors>>!";
			}
			else if (playChoice == 'P') {
				extra = "<<Paper Covers Rock>>!";
			}
			else if (playChoice == 'S') {
				extra = "<<Scissors Cuts Paper>>!";
			}
			output = "!Player wins " + extra;
		}
		else if (determineWinner() == "computer") {
			String extra = "";
			if (playChoice == 'R') {
				extra = "<<Paper Covers Rock>>!";
			}
			else if (playChoice == 'P') {
				extra = "<<Scissors Cuts Paper>>!";
			}
			else if (playChoice == 'S') {
				extra = "<<Rock Breaks Scissors>>!";
			}
			output = "!Computer wins " + extra;
		}
		return "player had " + playChoice + "\n" + "computer had " + compChoice + "\n" + output;
	}
}
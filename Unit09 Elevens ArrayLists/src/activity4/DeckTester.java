package activity4;

import activity2.Deck;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck one = new Deck(new String[] {"A","B","C"}, new String[] {"Giraffes","Lions"}, new int[] {2,1,6});
		Deck two = new Deck(new String[] {"A","B","C"}, new String[] {"Giraffes","Lions"}, new int[] {2,1,6});
		Deck three = new Deck(new String[] {"A","B","C"}, new String[] {"Giraffes","Lions"}, new int[] {2,1,6});
		
		System.out.println(one.isEmpty());
		System.out.println(one.size());
		System.out.println(one.deal());
		
		System.out.println(two.isEmpty());
		System.out.println(two.size());
		System.out.println(two.deal());
		
		System.out.println(three.isEmpty());
		System.out.println(three.size());
		System.out.println(three.deal());
		
		Deck standard = new Deck(new String[] {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"}, new String[] {"Spades","Diamonds","Clubs","Hearts"}, new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13});
		
		standard.shuffle();
		standard.printCards();
	}
}

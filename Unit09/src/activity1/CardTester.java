package activity1;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("Eight", "Clubs", 8);
		Card card2 = new Card("Ace", "Diamonds", 1);
		Card card3 = new Card("Ace", "Clubs", 1);
		
		System.out.println(card1.matches(card1));
		System.out.println(card1.matches(card2));
		System.out.println(card1.matches(card3));
		System.out.println(card2.matches(card1));
		System.out.println(card2.matches(card2));
		System.out.println(card2.matches(card3));
		System.out.println(card3.matches(card1));
		System.out.println(card3.matches(card2));
		System.out.println(card3.matches(card3));
		
		System.out.println(card1);
		System.out.println(card2);
		System.out.println(card3);
	}
}

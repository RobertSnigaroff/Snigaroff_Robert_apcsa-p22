package activity9;
import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	/**
	 * cards contains all the cards in the deck.
	 */
	private Card[] cards;

	/**
	 * size is the number of not-yet-dealt cards.
	 * Cards are dealt from the top (highest index) down.
	 * The next card to be dealt is at size - 1.
	 */
	private int size;


	/**
	 * Creates a new <code>Deck</code> instance.<BR>
	 * It pairs each element of ranks with each element of suits,
	 * and produces one of the corresponding card.
	 * @param ranks is an array containing all of the card ranks.
	 * @param suits is an array containing all of the card suits.
	 * @param values is an array containing all of the card point values.
	 */
	public Deck(String[] ranks, String[] suits, int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		cards = new Card[ranks.length*suits.length];
		for (int i = 0; i < ranks.length; i++) {
			for (int k = 0; k < suits.length; k++) {
				cards[i*suits.length+k] = new Card(ranks[i], suits[k], values[i]);
			}
		}
		size = cards.length;
		shuffle();
//		Card[] outputlist = new Card[ranks.length * suits.length];
//		int deckloc = 0;
//		for (int i=0;i<ranks.length;i++) {
//			String inputRank = ranks[i];
//			int inputValues = values[i];
//			
//			for (int j=0;j<suits.length;j++) {
//				String inputSuit = suits[j];
//				outputlist[deckloc] = new Card(inputRank,inputSuit,inputValues);
//				deckloc++;
//			}
//		}
//		cards = outputlist;
	}


	/**
	 * Determines if this deck is empty (no undealt cards).
	 * @return true if this deck is empty, false otherwise.
	 */
	public boolean isEmpty() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size > 0) {
			return false;
		}
		return true;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */
	public int size() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		return size;
	}

	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		size = cards.length;
		for (int k = cards.length-1; k >= 1; k--) {
			int r = (int) Math.round(Math.random() * k);
			Card temp = cards[k];
			cards[k] = cards[r];
			cards[r] = temp;
		}
//		for (int i = size()-1; i > 0; i--){
//			int r = (int)(Math.floor(size() * Math.random()));
//			
//			Card card1Temp = cards[i];
//			Card card2Temp = cards[r];
//			cards[i] = card2Temp;
//			cards[r] = card1Temp;
//		
//		}
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		if (size > 0) {
			size--;
			return cards[size];
		}
		else {
			return null;
		}
//		if (cards.length == 0) {
//			return null;
//		}
//		else {
//			Card[] newCards = new Card[cards.length - 1];
//			Card holder = cards[0];
//			for (int i = 0; i < newCards.length; i++) {
//				newCards[i] = cards[i+1];
//			}
//			cards = newCards;
//			return holder;
//		}
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}

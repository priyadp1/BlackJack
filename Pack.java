package apcsa.blackjack;
import java.util.ArrayList;

public class Pack {
	ArrayList<Card> cards = new ArrayList<Card>(52);
	public static final String SPADE = "Spade";
	public static final String HEART = "Heart";
	public static final String DIAMOND = "Diamond";
	public static final String CLUB = "Club";
	public static final String KING = "King";
	public static final String QUEEN = "Queen";
	public static final String JACK = "Jack";
	public static final String ACE = "ACE";

	String [] suits = {SPADE , HEART , DIAMOND , CLUB};
	public String [] labels = {ACE , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9", "10" , QUEEN , JACK , KING};

	public Pack() {
		resetPack();
	}
	
	public void resetPack() {
		cards = new ArrayList<Card>();
		for(String suit : suits) {
			for(String val : labels) {
				Card c1 = new Card(suit , val);
				cards.add(c1);
			}
		}
	}
	public ArrayList <Card> getAllCards() {
		return cards;
	}

}

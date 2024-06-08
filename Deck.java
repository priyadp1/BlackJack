package apcsa.blackjack;
import java.util.ArrayList;

import apcsa.Player;

public class Deck {
public static final String SPADE = "Spade";
public static final String HEART = "Heart";
public static final String DIAMOND = "Diamond";
public static final String CLUB = "Club";
public static final int KING = 13;
public static final int QUEEN = 11;
public static final int JACK = 12;
public static final int ACE = 1;
String [] suits = {SPADE , HEART , DIAMOND , CLUB};
int [] values = {ACE , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9, 10 , QUEEN , JACK , KING};

ArrayList<Card> cards = new ArrayList<Card>();

public Deck(int numberOfPacks) {
	ArrayList<Card> cardsInAPack = (new Pack()).getAllCards();
	for(int i = 1; i <= numberOfPacks; i++) {
		cards.addAll(cardsInAPack);
		
	}
}
public Card drawACard() {
	int pos = (int) (Math.floor(Math.random() * cards.size()) + 0);
	//System.out.println(pos);
	Card x = cards.get(pos);
	cards.remove(pos);
	return x;
}


	

}

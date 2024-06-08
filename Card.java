package apcsa.blackjack;

public class Card {
	
public static final String SPADE = "Spade";
public static final String HEART = "Heart";
public static final String DIAMOND = "Diamond";
public static final String CLUB = "Club";

private String suit;
private String label;

public Card(String suit , String label) {
	this.suit = suit;
	this.label = label;
}

public String toString() {
	return suit + ":" + label;
}
public String getLabel() {
	return label;
}
}

package apcsa.blackjack;

import java.util.ArrayList;

public class BlackJackPlayer {
	String name;
	ArrayList<Card> hand = new ArrayList<Card>();

	
	public BlackJackPlayer(String aName) {
		name = aName;
		
	}
	public void addHand(Card c) {
		hand.add(c);
	}
	public void displayHand() {
		for(Card c1 : hand) {
			System.out.println(name + ": " + c1.toString());
		}
	}
	public void display1stCard() {
		System.out.println(hand.get(0).toString());
	}
	public ArrayList<Card> getHands() {
		return hand;
	}
	public String getName() {
		return name;
	}
}

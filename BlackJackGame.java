package apcsa.blackjack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BlackJackGame {

	private BlackJackPlayer dealer;
	public ArrayList<BlackJackPlayer> blackJackPlayers = new ArrayList<>();
	Deck d2 = new Deck(4);

	BlackJackGame(BlackJackPlayer dealer, ArrayList<BlackJackPlayer> player ) {
		this.blackJackPlayers = player;
		this.dealer = dealer;

	}
	public int getValueofPlayerHand(BlackJackPlayer player) {
		int handValue = 0;
		for(Card d : player.getHands()) {
			handValue = handValue + getCardValue(d);	
		}
		return handValue;
	}
	public int getCardValue(Card card) {
		String label;
		switch(card.getLabel()) {
		case "1": return 1;
		case "2": return 2;
		case "3": return 3;
		case "4": return 4;
		case "5": return 5;
		case "6": return 6;
		case "7": return 7;
		case "8": return 8;
		case "9": return 9;
		case "10": return 10;
		case Pack.ACE: return 1;

		default: return 10;


		}

	}
	public String whoWins(BlackJackPlayer player) {

		if(getValueofPlayerHand(player) > getValueofPlayerHand(dealer) && getValueofPlayerHand(player) <= 21) {
			return player.getName() +  " wins!";
		}
		else if(getValueofPlayerHand(dealer) > getValueofPlayerHand(player) && getValueofPlayerHand(dealer) <= 21) {
			return "Dealer wins!";
		}
		else if(getValueofPlayerHand(player) > 21) {
			return "Dealer wins!";
		}
		else if(getValueofPlayerHand(dealer) > 21 && getValueofPlayerHand(player) < 21) {
			return player.getName() + " wins!";
		}
		return "Dealer wins!";
	}

	public static void main(String[] args) {	
		ArrayList<BlackJackPlayer> blackJackPlayers = new ArrayList<>();
		Deck d2 = new Deck(4);
		BlackJackPlayer dealer = new BlackJackPlayer("Dealer");
		BlackJackGame b1 = new BlackJackGame(dealer , blackJackPlayers);
	

		Scanner s1 = new Scanner(System.in);
		System.out.print("Number of players: ");
		String inputString = s1.nextLine();
		int numbOfPlayers = Integer.parseInt(inputString);
		for(int i = 0; i < numbOfPlayers; i ++) {
			System.out.print("Enter Player name:");
			String playerName = s1.nextLine();
			BlackJackPlayer p1 = new BlackJackPlayer(playerName);
			blackJackPlayers.add(p1);

		}
		for(BlackJackPlayer player : blackJackPlayers ) {
			player.addHand(d2.drawACard());

		}
		dealer.addHand(d2.drawACard());
		for(BlackJackPlayer player : blackJackPlayers ) {
			player.addHand(d2.drawACard());

		}
		dealer.addHand(d2.drawACard());
		dealer.display1stCard();

		for(BlackJackPlayer player : blackJackPlayers) {
			player.displayHand();
			System.out.print(player.getName()+ " Would you like to hit or stand? 0 for hit, and 1 for stand:");
			String inputAnswer = s1.nextLine();
			if(inputAnswer.equals("0")) {
				player.addHand(d2.drawACard());
				player.displayHand();
			}
			else {
				player.displayHand();
			}
		}
		if(b1.getValueofPlayerHand(dealer) <= 16) {
			dealer.addHand(d2.drawACard());
		}

		dealer.displayHand();
		for(BlackJackPlayer player : blackJackPlayers) {
			System.out.println(b1.whoWins(player));
		}
		s1.close();
	}

}







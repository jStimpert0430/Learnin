//Joshua Stimpert - Fall 2020 - Lab 4
import java.util.ArrayList;
import java.util.List;

public class CardPlayer {
	private List<Card> playerHand = new ArrayList<>();
	
	public void getCards(int cardToDraw, Deck targetDeck) {
		System.out.println("Player is drawing " + cardToDraw + " cards.");
		for(int i = 0; i < cardToDraw; i++)
		playerHand.add(targetDeck.deal());
	}
	
	public void showCards() {
		System.out.println("\nCurrent cards in this player's hand: ");
		for(Card currentCard : playerHand) {
			System.out.println(currentCard.toString());
		}
		
	}
	
	public int getHandSize() {
		return playerHand.size();
	}
}

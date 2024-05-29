//Joshua Stimpert - Fall 2020 - Lab 4
import java.util.Collections;
import java.util.Stack;

public class Deck {
	private Stack<Card> currentDeck = new Stack<>(); 
	
	public Deck(){
		fillDeck();
		shuffle();
	}
	
	public void fillDeck() {
		System.out.println("Populating deck...");
		if(!currentDeck.isEmpty())
			currentDeck.clear();
		
		for(int suite = 0; suite < 4; suite++) {
			for(int rank = 0; rank < 13; rank++) {
				currentDeck.push(new Card(rank, suite));
			}
		}
	}
	
	public void shuffle() {
		System.out.println("Shuffling Deck...");
		Collections.shuffle(currentDeck);
	}
	
	public Card deal() {
		return currentDeck.pop();
	}
	
	public int size() {
		return currentDeck.size();
	}
}

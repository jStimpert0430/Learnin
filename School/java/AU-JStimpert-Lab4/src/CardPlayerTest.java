//Joshua Stimpert - Fall 2020 - Lab 4
import static org.junit.Assert.*;

import org.junit.Test;

public class CardPlayerTest {

	@Test
	public void testGetCards() {
		CardPlayer testPlayer = new CardPlayer();
		Deck testDeck = new Deck();
		testPlayer.getCards(5, testDeck);
		assertEquals(5, testPlayer.getHandSize());
	}

	@Test
	public void testShowCards() {
		//How would I test this? It's basically just a toString method for what the player has in his hand -- and would be random each time
	}

}

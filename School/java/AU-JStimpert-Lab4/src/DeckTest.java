//Joshua Stimpert - Fall 2020 - Lab 4
import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void testDeck() {
		Deck testDeck = new Deck();
		System.out.println(testDeck.size());
		assertEquals(52, testDeck.size());
	}

	@Test
	public void testFillDeck() {
		Deck testDeck = new Deck();
		testDeck.fillDeck();
		assertEquals(52, testDeck.size());
	}

	@Test
	public void testShuffle() {
		Deck testDeck = new Deck();
		testDeck.shuffle();
		//I realize this may fail occasionally due to random chance, but I couldn't think of another way to test it.
		assertNotEquals("1 of Hearts", testDeck.deal().toString());
	}

	@Test
	public void testDeal() {
		Deck testDeck = new Deck();
		assertNotNull(testDeck.deal());
	}

}

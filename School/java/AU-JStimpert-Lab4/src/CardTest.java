//Joshua Stimpert - Fall 2020 - Lab 4
import static org.junit.Assert.*;

import org.junit.Test;

public class CardTest {

	@Test
	public void testCard() {
		Card testCard = new Card();
		Card testCard2 = new Card(1, 1);
		assertEquals("Ace of Hearts", testCard.toString());
		assertEquals("1 of Clubs", testCard2.toString());
	}

}

//Joshua Stimpert - Fall 2020 - Lab 4
public class lab4Tester {

	public static void main(String[] args) {
		Deck myDeck = new Deck();
		CardPlayer player1 = new CardPlayer();
		
		player1.getCards(5, myDeck);
		player1.showCards();

	}

}

//Joshua Stimpert - Fall 2020 - Lab 4
public class Card {
	private static String ranks[] = new String[] {"Ace", "2", "3", "4", "5", "6", "7", "8", "8", "10", "Jack", "Queen", "King"};
	private static String suites[] = new String[] {"Hearts", "Clubs", "Spades", "Diamonds"};
	private int cardRank;
	private int cardSuite;
	
	
	public Card() {
		cardRank = 0;
		cardSuite = 0;
	}
	
	public Card(int newRank, int newSuite) {
		if((newRank >= 0 && newRank < ranks.length) && (newSuite >= 0 && newSuite < suites.length)) {
			cardRank = newRank;
			cardSuite = newSuite;
		}
		else {
			cardRank = 0;
			cardSuite = 0;
		}
		//System.out.println("Creating new card of Suite: " + getSuite() + " and Rank: " + getRank());
	}
	
	public String getSuite() {
		return suites[cardSuite];
	}
	
	public String getRank() {
		return ranks[cardRank];
	}
	
	public String toString() {
		return getRank() + " of " + getSuite(); 
	}
}


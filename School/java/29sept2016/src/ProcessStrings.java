import java.util.Scanner;
import java.util.InputMismatchException;

public class ProcessStrings {

	public static void main(String[] args) {
		String player01 = enterName("Player 1");
		String player02 = enterName("Player 2");
		int p1HighScore = enterHighScore(player01);
		int p2HighScore = enterHighScore(player02);
		
		// player01 == player02 checks address instead of string.
		if(player01.equalsIgnoreCase(player02)){
			System.out.println("same player entered twice!!!!");
		}
		else{
			System.out.println("Good, two different players...");
		}
	}

	public static String enterName(String playerNum){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a name for " + playerNum);
		String player = input.nextLine();
		System.out.println("Welcome to the game " + player);
		return player;
	} // end enterName
	
	public static int enterHighScore(String playerName){
		Scanner input = new Scanner(System.in);
		do{
			try{
				System.out.println("Please input " + playerName + "'s High score");
				int highScore = input.nextInt();
				System.out.println("The player's high score is " + highScore);
				input.nextLine();
				return highScore;
			}
			catch(InputMismatchException ex){
				System.out.println("Input error " + ex);
				input.nextLine();
			}
		}while(true);
	}// end enterHighScore
} // end Main

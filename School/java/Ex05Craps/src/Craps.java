import java.util.Random;
import java.util.Scanner;
public class Craps {

	private static final Random randomNumbers = new Random();
	private enum status {CONTINUE, WON, LOST};
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVIN = 11;
	private static final int BOX_CARS = 12;
	
	public static void main(String[] args){
		int myPoint = 0;
		status gameStatus;
		do{
			int sumOfDice = rollDice();
			switch(sumOfDice){
			case SEVEN:
			case YO_LEVIN:
				gameStatus = status.WON;
				break;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = status.LOST;
				break;
			default: 
				gameStatus = status.CONTINUE;
				myPoint = sumOfDice;
				System.out.printf("Point is %d\n", myPoint);
				break;
			}
			Scanner input = new Scanner(System.in);
			while(gameStatus == status.CONTINUE){
				System.out.println("Press enter to roll again.");
				input.nextLine();
				sumOfDice = rollDice();
				if(sumOfDice == myPoint)
					gameStatus = gameStatus.WON;
				else if(sumOfDice == SEVEN)
					gameStatus = gameStatus.LOST;
			}
			if(gameStatus == status.WON)
				System.out.println("Player wins");
			else
				System.out.println("Player loses");
			System.out.println("Would you like to play again?");
			String choice = input.nextLine();
			if(choice.equalsIgnoreCase("no"))
					break;
		}while(true);
		System.out.println("Thank you for playing.");
	}
	
	public static int rollDice(){
		int a = 1 + randomNumbers.nextInt(6);
		int b = 1 + randomNumbers.nextInt(6);
		int sum = a+b;
		System.out.println("Dice 1 is " + a + ". Dice 2 is " + b + ". the total of the roll is " + sum + "." );
		return a + b;
	}
}

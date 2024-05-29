import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class jStimpert_craps {

		//Create random number generator for use in method rollDice
		private static final Random randomNumbers = new Random();

		//enumeration with constants that represent the game status
		private enum Status {CONTINUE, WON, LOST};

		//constants that represent common rolls of the dice
		private static final int SNAKE_EYES = 2;
		private static final int TREY = 3;
		private static final int SEVEN = 7;
		private static final int YO_LEVEN = 11;
		private static final int BOX_CARS = 12;

		//plays one game of craps
		public static void main(String[] args) {
			int numberOfGames = 0;
			int numberOfWins = 0;
			int wager = 0;
			int bank = 1000; 
			int myPoint = 0;   //point if no win or loss on first roll
			Status gameStatus; //can contain CONTINUE, WON, or LOST
			
	        do{
	        	wager = captureWager("Please enter a wage for this game: ", bank);
	        	System.out.println(printChatter());
				int sumOfDice = rollDice(); //first roll of the dice
		
				//determine game status and point based on first roll
				switch (sumOfDice){
					case SEVEN:       //win with 7 on the first roll
					case YO_LEVEN:    //win with 11 on the first roll
						gameStatus = Status.WON;
						break;
					case SNAKE_EYES:  //lose with 2 on the first roll
					case TREY:        //lose with 3 on first roll
					case BOX_CARS:    //lose with 12 on first roll
						gameStatus = Status.LOST;
		                break;
					default: 	  //did not win or lose, so remember point
						//System.out.println(printChatter());
						gameStatus = Status.CONTINUE;
						myPoint = sumOfDice;    //remember the point
						System.out.printf("Point is %d\n", myPoint);
						break;    //optional at end of switch
				} //end switch
				
				Scanner input = new Scanner(System.in);
				//while the game is not complete
				while (gameStatus == Status.CONTINUE) {//not WON or LOST
					System.out.println("Press enter to roll again.");
					input.nextLine();
					sumOfDice = rollDice(); //roll dice again
		
					//determine game status
					if (sumOfDice == myPoint) //win by making point
						gameStatus = Status.WON;
					else
						if (sumOfDice == SEVEN) //lose by rolling 7 before point
							gameStatus = Status.LOST;
					//System.out.println(printChatter());
				} //end while
				
				numberOfGames++;
				//display won or lost message
				if (gameStatus == Status.WON){
					System.out.println("Player WINS\n");
					numberOfWins++;
					bank += wager;
				}
				else{
					System.out.println("Player LOSES\n");
					bank -= wager;
				}
				System.out.println("Bank Total: " + bank);
				System.out.println("Wins:  " + numberOfWins );
				System.out.println("Loses:  " + (numberOfGames - numberOfWins) );
			
				double winPercent = (double) numberOfWins / numberOfGames * 100;
				System.out.printf("Winning Percent :  %.3f%n%n", winPercent );

				if(bank < 1){
					System.out.println("Sorry! You've busted. Game over.");
					break;
				}
				System.out.println(printChatter());
				System.out.println("PLay Again... Yes or No");
				String playAgain  = input.nextLine();
				if (playAgain.equalsIgnoreCase("NO") || playAgain.equalsIgnoreCase("N"))
					break;
	        }while(true);//end of main do loop
	        
	        System.out.println("Thanks for playing...Y'all come back");
		} //end main

		
		//Method to return random string from chatter array
		public static String printChatter(){
			String[] chatter = {"Oh, You're going for broke, huh?\n",
					"Aw, c'mon, take a chance!\n",
					"You're up big, now is the time to cash in your chips!\n",
					"I have a good feeling about the next game",
					"Bet big to win big!",
					"Don't bust!"};
			return chatter[randomNumbers.nextInt(6)];
		}
		
		
		//roll dice, calculate sum and display results
		public static int rollDice() {
			//pick random die values
			int die1 = 1 + randomNumbers.nextInt(6); //first die roll
			int die2 = 1 + randomNumbers.nextInt(6); //second die roll

			int sum = die1 + die2; //sum of die values

			//display results of this roll
			System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);

			return sum; //return sum of dice
		} //end method rollDice
		
		
		//Capture method to capture a valid wager
		public static int captureWager(String prompt, int bank){
			int wager;
			Scanner intIn = new Scanner(System.in);
			do{//loop to obtain valid number
				try{//Try catch to avoid crashes
					System.out.println(prompt);
					wager = intIn.nextInt();
					if(wager <= bank && wager > 0)//if wager is less than bank and bigger than 0, accept wager and break
						break;
					else if(wager < 1) //if wager is 0 or less, output error
						System.out.println("You must make a wager, please enter your bet again. \n");
					else//only remaining option is a wager larger than bank
						System.out.println("Your wager is larger than your remaining bank, please enter your bet again.\n");
				}
				catch(InputMismatchException ex){//error handling
					System.out.println("Invalid input, please enter a number less than your total bank: " + ex + "\n");
					intIn.nextLine();//clear input stream on invalid entry
				}
			}while(true);
			intIn.nextLine();//clear input stream on successful entry
			return wager;
		}//end captureWager method

	}//end class Craps

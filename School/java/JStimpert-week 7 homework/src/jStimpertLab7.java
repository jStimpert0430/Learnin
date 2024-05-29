//Joshua Stimpert
//Lab week 7 - pseudo code
//Oct 12 2016
import java.util.InputMismatchException;
import java.util.Scanner;

public class jStimpertLab7 {

	public static void main(String[] args) {
		String colorCode = "";
		int colorAmount = 255;
		System.out.println("Welcome, User. This is the color editing program.\n");
		colorCode = captureString("Please pick a color you would like to edit (Red, Blue or Green): ");
		colorAmount = captureInt("Please enter a number for the amount of color to be used(0-255): ");
		System.out.println("Setting the " + colorCode.toUpperCase() + " color to " + colorAmount + "."
				+ "\n\nTerminating program...");
	}
	
	//Method to capture string
	public static String captureString(String prompt){
		String strCapture;
		Scanner stringInput = new Scanner(System.in);
		do{//loop to capture valid string
			System.out.println(prompt);
			strCapture = stringInput.nextLine();
			if(strCapture.equalsIgnoreCase("red") || strCapture.equalsIgnoreCase("blue") || strCapture.equalsIgnoreCase("green"))
				break;// break out of loop on valid entry
			System.out.println("Invalid color, please try again.\n");
		}while(true);
		return strCapture;
	}
	
	//Method to capture int
	public static int captureInt(String prompt){
		int numCapture;
		Scanner intIn = new Scanner(System.in);
		do{//loop to obtain valid number within range
			try{//Try catch to avoid crashes
				System.out.println(prompt);
				numCapture = intIn.nextInt();
				if(numCapture > -1 && numCapture < 256)
					break;//break once a valid number has been entered
				System.out.println("Invalid number, please try again.\n");
			}
			catch(InputMismatchException ex){//error handling
				System.out.println("Invalid input, please enter a number " + ex + "\n");
				intIn.nextLine();//clear input stream on invalid entry
			}
		}while(true);
		intIn.nextLine();//clear input stream on successful entry
		return numCapture;
	}


}

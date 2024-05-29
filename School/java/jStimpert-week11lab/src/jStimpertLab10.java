//Joshua Stimpert
//Lab 10 - odd or even
//Nov 10 2016
import java.util.InputMismatchException;
import java.util.Scanner;

public class jStimpertLab10 {

	public static void main(String[] args) {
		int input;
		System.out.println("Welcome to the even or odd program.\n\n");
		do{//main program loop
			input = captureInt("Please enter a whole number or -999 to quit: ");
			if(input != -999)
				System.out.println("The number '" + input +"' is an " + oddOrEven(input) + " number.\n");
			else
				break;
		}while(true);
		System.out.println("\nThank you for using this program.\nExiting...");
	}
	
	//Method to find even or odd number and return appropriate string
	public static String oddOrEven(int input){
		if((input % 2) == 0)
			return "even";
		else
			return "odd";
	}
	
	//generic method to capture valid int
	public static int captureInt(String prompt){
		int numCapture;
		Scanner intIn = new Scanner(System.in);
		do{//loop to obtain valid number
			try{//Try catch to avoid crashes
				System.out.println(prompt);
				numCapture = intIn.nextInt();
				break;//break once a valid number has been entered
			}
			catch(InputMismatchException ex){//error handling
				System.out.println("Invalid input, please enter an integer: " + ex + "\n");
				intIn.nextLine();//clear input stream on invalid entry
			}
		}while(true);
		intIn.nextLine();//clear input stream on successful entry
		return numCapture;
	}

}

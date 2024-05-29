//Joshua Stimpert
//Week 5 lab
//Oct 1, 2016
import java.util.Scanner;
import java.util.InputMismatchException;
public class HeartRatesDriver {

	//Program mainline
	public static void main(String[] args) {
		String fName, lName;
		int birthYear;
		System.out.println("-Welcome to the Heart Rate Calculator program-\n----------------------------------------------");//program header
		fName = enterName("first");
		lName = enterName("last");
		birthYear = enterYear();
		HeartRates HeartRates01 = new HeartRates(fName,lName,birthYear);
		System.out.println(HeartRates01.toString());
		System.out.println("\n\nThank you for using this program.");
	}//end of main
	
	//Input Methods
	public static String enterName(String msg){
		String input;
		Scanner nameInput = new Scanner(System.in);
		System.out.println("Please enter your " + msg + " name: ");
		input = nameInput.nextLine();
		return input;
	}//end enterName
	
	public static int enterYear(){
		int birthYear;
		Scanner ageInput = new Scanner(System.in);
		do{//Loop to obtain a valid input
			try{
				System.out.println("Please enter your birth year: ");
				birthYear = ageInput.nextInt();
				if(birthYear > 1900)
					break;//once a valid year is obtained, break out of the loop
				System.out.println("\nInvalid year, Please enter a year greater than 1900\n");
			}
			catch(InputMismatchException ex){
				System.out.println("\nInvalid input, please enter the year in the form of a number. " + ex + "\n");
				ageInput.nextLine();//Clear input stream
			}
		}while(true);
		ageInput.nextLine();//Clear input stream
		return birthYear;
	}//end enterYear
	
}//end of class

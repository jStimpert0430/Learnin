//Joshua Stimpert
//Week 10 lab
//Nov 5 2016
import java.util.InputMismatchException;
import java.util.Scanner;

public class jStimpert_labWk10 {

	public static void main(String[] args) {
		System.out.println("Welcome, This is a program that will calculate the area of a rectangle.\n");
		//Method calls
		int width = captureInt("Please enter the width of the rectangle.(Greater than 0)", true);
		int length = captureInt("Please enter the length of the rectangle.(Greater than 0)", true);
		int area = rectangleArea(width, length);
		double ratio = rectangleRatio(width, length);
		//output
		System.out.println("\nRectangle Width: " + width + "\nRectangle Length: " + length);
		System.out.println("Rectangle Area: " + area);
		System.out.printf("%s%.3f", "Rectangle Ratio: ", ratio);
		System.out.println("\n\nThank you for using this program.\nExiting...");
		
	}
	
	public static int captureInt(String prompt, boolean validate){
		int numCapture;
		Scanner intIn = new Scanner(System.in);
		do{//loop to obtain valid number within range
			try{//Try catch to avoid crashes
				System.out.println(prompt);
				numCapture = intIn.nextInt();
				if(numCapture > 0 || validate == false)
					break;//break once a valid number has been entered
				System.out.println("Invalid number, please try again.\n");
			}
			catch(InputMismatchException ex){//error handling
				System.out.println("Invalid input, please enter an integer " + ex + "\n");
				intIn.nextLine();//clear input stream on invalid entry
			}
		}while(true);
		intIn.nextLine();//clear input stream on successful entry
		return numCapture;
	}//end of captureInt
	
	public static int rectangleArea(int width, int length){ //Method to calculate area
		int area = width * length;
		return area;
	}
	
	public static double rectangleRatio(int width, int length){
		double ratio = (double)width / length;
		return ratio;
	}
	
	

}

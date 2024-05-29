import java.util.Random;
import java.util.Scanner;
public class ExArrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//array1(input);
		//array2(input);
		//array3();
		array4();
	}

	public static void array1(Scanner input){
		int counter = 5;
		int myNumber[] = new int[counter];
		for(int i = 0; i < counter; i++){
			System.out.println("Please enter a number.");
			myNumber[i] = input.nextInt();
		}
		
		for(int i = myNumber.length - 1; i > -1; i--)
		System.out.println("my number "+ (i+1) + ": " + myNumber[i]);
	}
	
	public static void array2(Scanner input){
		Random randomNumbers = new Random();
		int counter = 5;
		String myString[] = new String[5];
		for(int i = 0; i < counter; i++){
			System.out.println("Please enter a string.");
			myString[i] = input.nextLine();
			//input.nextLine();
		}
		int msgNbr = randomNumbers.nextInt(5);
		System.out.println(myString[randomNumbers.nextInt(4)]);
		
		//for(int i = myString.length - 1; i > -1; i--)
		//System.out.println("The string in slot "+ (i+1) + " is: " + myString[i]);
	}
	public static void array3(){
		Random randomNumber = new Random();
		int[] myNumber = {1,2,3,4,5};
		for(int i = 0; i < myNumber.length; i++){
			System.out.println("The number in slot "+ (i+1) + " is: " + myNumber[i]);
		}

	}
	public static void array4(){
		Random randomNumber = new Random();
		String[] myString = {"Wooooow", "okay...", "hmmmm"};
		for(int i = 0; i < myString.length; i++){
			System.out.println("The String in slot "+ (i+1) + " is: " + myString[i]);
		}

	}
		
}

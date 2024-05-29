import java.util.Scanner;

public class inputVariables {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String myName = "";
		int myInt, myInt2, myInt3;
		/*
		System.out.print("Please enter your name: ");
		myName = input.nextLine();
		System.out.println("The name entered was: " + myName);
		
		System.out.print("Please enter a number between 1 and 10: ");
		myInt = input.nextInt();
		System.out.println("The number entered was: " + myInt);
		input.nextLine(); // dummy read to clear input stream
		
		System.out.print("Please enter your best friend's name: ");
		myName = input.nextLine();
		System.out.println("Your best friend's name was: " + myName);
		
		System.out.print("Please enter a number another between 1 and 10: ");
		myInt2 = input.nextInt();
		System.out.println("The number entered was: " + myInt2);
		input.nextLine(); // dummy read to clear input stream
		
		myInt3 = myInt + myInt2;
		System.out.println("The sum of the numbers input is: " + myInt3);
		*/
		
		//this will show how to catch input errors.
		try {
			System.out.print("Please enter a number between 1 and 10: ");
			myInt = input.nextInt();
			System.out.println("The number entered was: " + myInt);
		} 
		catch (Exception ex){
			System.out.println("Bad input: " + ex);
		}
		input.nextLine(); // dummy read to clear input stream
		System.out.printf("%S", "Thanks for entering your data!");
	}

}

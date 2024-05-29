import java.util.Scanner;
public class simpleInputs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to this computer. What is your name?");
		String newName = input.next();
		System.out.println("Hello " + newName + "! Come back soon!");
		int number = 0;
		System.out.println("Please enter a number.");
		number = input.nextInt();
		System.out.println("Your number is: " + number);
	}

}

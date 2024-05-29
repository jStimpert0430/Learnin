import java.util.Scanner;

public class jStimpert_lab2 {

	public static void main(String[] args) {
		String userName;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Welcome to this computer. What is your name? ");
		userName = input.nextLine();
		System.out.println();
		System.out.println("Hello " + userName + ".");
		System.out.println();
		
		System.out.println("I will count to five in two different ways");
		System.out.println();
		System.out.println("1\n2\n3\n4\n5");
		System.out.println();
		System.out.print("1 2 3 4 5\n");
		System.out.println();
		
		System.out.printf("%,.1f%n", 1.0);
		System.out.printf("%,.1f%n", 2.0);
		System.out.println();
		
		System.out.println("Good bye " + userName);
		System.out.println();
		System.out.println("Thank you for using this program.");
		
	}

}

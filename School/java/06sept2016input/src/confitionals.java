import java.util.Scanner;

public class confitionals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 0, num2 = 0, answer;
		double num3 = 0, answerD;
			
		try {
			System.out.println("Please enter an integer.: ");
			num1 = input.nextInt();
			System.out.printf("%n%s%d%n","You have entered: ", num1);
			System.out.println("Please enter another number.: ");
			num2 = input.nextInt();
			System.out.printf("%n%s%d%n", "You have entered: ", num2);
			//System.out.println("Please enter a decimal: ");
			//num3 = input.nextDouble();
			//System.out.printf("%n%s%.2f%n", "You have entered: ", num3);
		}
		catch (Exception ex) {
			System.out.println("Incorrect datatype error: " + ex);
			System.exit(-1);
		}
		//standalone ifs
		/*
		if(num1 == num2) {
			System.out.println("These numbers are equal.");
		}
		else if(num1 > num2) {
			System.out.println("num1 is greater than num2");
		}
		else {
			System.out.println("num 2 is greater than num1");
		}
		
		if(num1 == num2) {
			System.out.println("These numbers are equal.");
		}
		else if(num1 > num2) {
			System.out.println("num1 is greater than num2");
		}
		else {
			System.out.println("num 2 is greater than num1");
		}
		*/
		
		//Is my number even or odd?
		if ((num1 % 2) == 0) {
			System.out.println("Your number is even.");
		}
		else{
			System.out.println("Your number is odd.");
		}
	}
}

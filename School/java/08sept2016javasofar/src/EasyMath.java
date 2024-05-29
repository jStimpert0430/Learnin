// Joshua Stimpert
// Class to Demo Easy Math
// Sept 08, 2016
import java.util.Scanner;
public class EasyMath {

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
			System.out.println("Please enter a decimal: ");
			num3 = input.nextDouble();
			System.out.printf("%n%s%.2f%n", "You have entered: ", num3);
		}
		catch (Exception ex){
			System.out.println("Incorrect datatype error: " + ex);
			System.exit(-1);
		}
		
		answer = num1 + num2;
		System.out.println("\nThe sum of " + num1 + " and " + num2 + " is: " + answer);
		answer = num1 - num2;
		System.out.println(num1 + " minus " + num2 + " equals: " + answer);
		answer = num1 * num2;
		System.out.println("The product of " + num1 + " and " + num2 +" is: " + answer);
		answer = num1 / num2;
		System.out.println(num1 + " divided by " + num2 + " equals " + answer);
		answerD = num1 / num3;
		System.out.printf(num1 + " divided by " + num3 + " equals %.2f%n", answerD);
		answer = num1 % num2;
		System.out.println(num1 + " mod " + num2 + " equals " + answer);
	}
}

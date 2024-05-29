import java.util.Scanner;

public class MathUtilityTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers seperated by a space: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		//int sum = MathUtility.add(num1,num2);
		System.out.println(num1 + " + " + num2 + " = " + MathUtility.add(num1, num2));
		System.out.println("The product of " + num1 + " and " + num2 + " is: " + MathUtility.product(num1, num2));
		System.out.println(num1 + " / " + num2 + " = " + MathUtility.intDivision(num1, num2) + " r:" + MathUtility.remainder(num1, num2));
		System.out.printf("Full Division of %d and %d is %.5f\n", num1, num2, MathUtility.fullDivision(num1, num2));
		System.out.println(num1 + " ^ " + num2 + " = " + MathUtility.powers(num1, num2));
	}

}

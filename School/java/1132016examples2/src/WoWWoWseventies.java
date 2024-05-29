import java.util.Scanner;
public class WoWWoWseventies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 3 floating-point values seperated by spaces: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		System.out.println("Maximum is : " + maximum(number1, number2, number3));
		System.out.println("Minimum is : " + minimum(number1, number2, number3));

	}
	
	public static double maximum(double num1, double num2, double num3){
		double maximumValue = num1;
		if(num2>maximumValue)
			maximumValue = num2;
		if(num3>maximumValue)
			maximumValue = num3;
		return maximumValue;
	}
	
	public static double minimum(double num1, double num2, double num3){
		double minimumValue = num1;
		if(num2<minimumValue)
			minimumValue = num2;
		if(num3<minimumValue)
			minimumValue = num3;
		return minimumValue;
	}

}

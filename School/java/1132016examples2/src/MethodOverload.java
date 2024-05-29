
public class MethodOverload {

	public static void main(String[] args) {
		System.out.println("Welcome to overloaded methods");
		System.out.printf("%npower with int argument '7': %d%n", power(7));
		System.out.printf("%npower with int argument '7.5': %f%n", power(7.5));
		System.out.printf("%npower with int argument '7.0 7.5': %f%n", power(7.0, 7.5));

	}
	
	public static int power(int num){
		return (int)Math.pow(num,2);
	}
	
	public static double power(double num){
		return Math.pow(num,2);
	}
	
	public static double power(double num1, double num2){
		return Math.pow(num1,num2);
	}

}

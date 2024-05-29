
public class MathUtility {
	public static int add(int num1, int num2){
		return num1 + num2;
	}
	public static int product(int num1, int num2){
		return num1 * num2;
	}
	public static int intDivision(int num1, int num2){
		return num1 / num2;
	}
	public static int remainder(int num1, int num2){
		return num1 % num2;
	}
	public static double fullDivision(int num1, int num2){
		return (double)num1 / num2;
	}
	public static int powers(int num1, int num2){
		/*int base = 1;
		for(int i = 0; i < num2; i++){
			base *= num1;
		}
		return base;*/
		return (int)Math.pow(num1, num2);
	}

}

import java.util.Scanner;
public class PizzaDriver {

	public static void main(String[] args) {
		Scanner pizzaInput = new Scanner(System.in);
		/*Pizza pizza01 = new Pizza();
		Pizza pizza02 = new Pizza("MEDIUM", 1, 2, 3);
		System.out.println("\n-Pizza 1-\n" + pizza01.toString());
		System.out.printf("%S$%.2f", "\nPrice of pizza : ",pizza01.calcCost());
		System.out.println("\n-Pizza 2-\n" + pizza02.toString());
		System.out.printf("%S$%.2f", "\nPrice of pizza : ",pizza02.calcCost());
		*/
		
		// pizza ordering app
		String size;
		int cheese = 0;
		int meat = 0;
		int veggie= 0;
		System.out.println("Welcome to pizza shop my dude.\n");
		size = readString();
		cheese = readInt("cheese");
		meat = readInt("meat");
		veggie = readInt("veggie");
		/*do{
			try {
				System.out.println("How many cheese toppings would you like? ");
				cheese = pizzaInput.nextInt();
				System.out.println("How many meat toppings would you like?");
				meat = pizzaInput.nextInt();
				System.out.println("How many veggie toppings would you like?");
				veggie = pizzaInput.nextInt();
				break;
			}
			catch(Exception ex){
				System.out.println("Bad Data" + ex);
				pizzaInput.nextLine();
			}
		} while(true);*/
		
		/*do{
			try {
				System.out.println("How many cheese toppings would you like? ");
				cheese = pizzaInput.nextInt();
				break;
			}
			catch(Exception ex){
				System.out.println("Bad Data" + ex);
				pizzaInput.nextLine();
			}
		} while(true);
		do{
			try {
				System.out.println("How many meat toppings would you like? ");
				meat = pizzaInput.nextInt();
				break;
			}
			catch(Exception ex){
				System.out.println("Bad Data" + ex);
				pizzaInput.nextLine();
			}
		} while(true);
		do{
			try {
				System.out.println("How many veggie toppings would you like? ");
				veggie = pizzaInput.nextInt();
				break;
			}
			catch(Exception ex){
				System.out.println("Bad Data" + ex);
				pizzaInput.nextLine();
			}
		} while(true);*/
		
		Pizza pizza03 = new Pizza(size, cheese, meat, veggie);
		System.out.println("\n-Pizza 3-\n" + pizza03.toString());
		System.out.printf("%S$%.2f", "\nPrice of pizza : ",pizza03.calcCost());
	}//end main
	public static int readInt(String msg){
		int topping;
		Scanner pizzaInput = new Scanner(System.in);
		do{
			try {
				System.out.println("How many "+ msg +" toppings would you like? ");
				topping = pizzaInput.nextInt();
				if(topping > -1 && topping < 4)
					break;
					System.out.println("Your input of " + topping + " is invalid. \nPlease retry with a value greater than -1 and less than 4.\n\n");
			}
			catch(Exception ex){
				System.out.println("Bad Data" + ex);
				pizzaInput.nextLine();
			}
		} while(true);
		return topping;
	}
	
	public static String readString(){
		String size;
		Scanner pizzaInput = new Scanner(System.in);
		//forcing input via do
		do{
			System.out.println("What sized pizza would you like? SMALL, MEDIUM, LARGE");
			size = pizzaInput.nextLine();
			if(size.equalsIgnoreCase("SMALL")){
				break;
			}
			else if(size.equalsIgnoreCase("Medium")){
				break;
			}
			else if(size.equalsIgnoreCase("large")){
				break;
			}
		}while(true);
		
		return size;
	}
}

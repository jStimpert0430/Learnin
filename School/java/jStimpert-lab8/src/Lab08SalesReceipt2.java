//Joshua Stimpert
//Creates sales object and reciept
//25 oct 2016

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab08SalesReceipt2 {
	static double orderTotal = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int selection, quantity;
		
		System.out.println("Welcome to the sales object program.\n\n");
		do{//Main program do loop	
			System.out.println("The items for sale are as follows--\n"
					+ "Product 1: Tent - $298.00\n"
					+ "Product 2: Cot - $45.00\n"
					+ "Product 3: Blanket - $19.98\n"
					+ "Product 4: Canteen - $14.49\n"
					+ "Product 5: Compass - $16.87\n"
					+ "Product 6: Hat - $13.33");
			selection = captureInt("Please enter the product code of the item you would like to order or enter a 7 if you are finished shopping", true);
			
			if(selection < 7)// if selection is valid, continue with program; other wise break and end.
				quantity = captureInt("Please enter the quantity of the item you would like to order", false);
			else
				break;
			
			SalesItem newItem = null;//instantiate sales item as null
			switch(selection){//switch statement to create correct salesItem
				case 1:
					newItem = new SalesItem("Tent", quantity, 298.00);
					break;
				case 2:
					newItem = new SalesItem("Cot", quantity, 45.00);
					break;
				case 3:
					newItem = new SalesItem("Blanket", quantity, 19.98);
					break;
				case 4:
					newItem = new SalesItem("Canteen", quantity, 14.49);
					break;
				case 5:
					newItem = new SalesItem("Compass", quantity, 16.87);
					break;
				case 6:
					newItem = new SalesItem("Hat", quantity, 13.33);
			}
			printSales(newItem);
		}while(true);//end of outer do loop
		
		System.out.println("Thank you for using this program.");
	}//end of main
	
	
	public static int captureInt(String prompt, boolean validate){
		int numCapture;
		Scanner intIn = new Scanner(System.in);
		do{//loop to obtain valid number within range
			try{//Try catch to avoid crashes
				System.out.println(prompt);
				numCapture = intIn.nextInt();
				if(numCapture > 0 && numCapture < 8 || numCapture > -1 && validate == false)
					break;//break once a valid number has been entered
				System.out.println("Invalid number, please try again.\n");
			}
			catch(InputMismatchException ex){//error handling
				System.out.println("Invalid input, please enter a number " + ex + "\n");
				intIn.nextLine();//clear input stream on invalid entry
			}
		}while(true);
		intIn.nextLine();//clear input stream on successful entry
		return numCapture;
	}//end of captureInt
	
	public static void printSales(SalesItem newItem){
		double extendedPrice = newItem.calcExtendedPrice();
		orderTotal += extendedPrice;
		System.out.printf("%s%s%.2f%n",newItem.toString(), "\nExtended price: $", extendedPrice);
		System.out.printf("%s%.2f%n%n","Order total: $", orderTotal);
	}//end of printSales

}//end of class

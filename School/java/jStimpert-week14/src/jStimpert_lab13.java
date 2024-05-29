//Joshua Stimpert
//lab 13 - sales tax calc
//Dec 2, 2016
import java.util.InputMismatchException;
import java.util.Scanner;
public class jStimpert_lab13 {

	public static void main(String[] args) {
		int receiptSize = 4;
		double taxRate = 0.05;
		double totalSalesTax = 0;
		double subTotal = 0;
		double giftPrice[] = new double[receiptSize];
		
		System.out.println("Welcome to the Sales Tax Calculator(Current tax rate is: " + (taxRate * 100) + "%).\n\n");
		for(int i = 0; i < giftPrice.length; i++){//for loop to fill array
			giftPrice[i] = captureDouble("Enter a gift price: ");//capture valid input for each price
			subTotal += giftPrice[i];//add each price entered to the subtotal
		}
		totalSalesTax = salesTax(giftPrice, taxRate);//call to salesTax method
		
		//output
		System.out.printf("%n$%.2f%s%n", subTotal, " subtotal");
		System.out.printf("$%.2f%s%n", totalSalesTax, " tax");
		System.out.printf("$%.2f%s%n", (subTotal + totalSalesTax), " total due");
		System.out.println("\nThank you for using this program.\nNow exiting...");
	}
	
	
	//method to calculate and return sales tax for prices entered
	public static double salesTax(double[] myArray, double taxRate){
		double totalSalesTax = 0;
		System.out.println("\nSales Tax on gift items:");
		for(double currentGiftIndex: myArray){// enhanced for loop for adding sales tax of each item into total sales tax
			totalSalesTax += (currentGiftIndex * taxRate);// add data in current index to total sales tax after calculation
			System.out.printf("$%.2f%n",(currentGiftIndex * taxRate));//output sales tax for current item
		}
		return totalSalesTax;//return total
	}
	
	
	//generic method to capture valid double
	public static double captureDouble(String prompt){
		double numCapture;
		Scanner doubleIn = new Scanner(System.in);
		do{//loop to obtain valid number
			try{//Try catch to avoid crashes
				System.out.print(prompt);
				numCapture = doubleIn.nextDouble();
				if(numCapture > 0.0)
					break;//break once a valid number has been entered
				System.out.println("Please enter a positive number.");
			}
			catch(InputMismatchException ex){//error handling
				System.out.println("Invalid input, please enter a price. - " + ex + "\n");
				doubleIn.nextLine();//clear input stream on invalid entry
			}
		}while(true);
		doubleIn.nextLine();//clear input stream on successful entry
		return numCapture;
	}

}//end of class

import java.util.Scanner;

public class MonthDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Joshua Stimpert\nLab 1\nJava II - Fall 2020\n-Month Class Demo-\n");
		System.out.println("-Enter the names or numbers of two months to demonstrate the month class created for this lab-");
		
		System.out.println("\n1st Month:");
		Month testerMonth = captureMonth(input);
		
		System.out.println("\n2nd Month:");
		Month testerMonth2 = captureMonth(input);
		
		input.close();
		
		compareMonths(testerMonth, testerMonth2);
	}
	
	public static Month captureMonth(Scanner input) {
		Month newMonth = new Month();
		String month;
		
		do {
			System.out.print("Please enter the name of a month or its numerical value to create a new month object: ");
			month = input.nextLine();
			
			if(isNumeric(month) && month.length() > 0) 
				newMonth = new Month(Integer.parseInt(month));
			else 
				newMonth = new Month(month);
			
			if(newMonth.getMonthNumber() == 13)
				System.out.println("\nInvalid month, please try another input...\n");
			else 
				break;
		}while(true);
		
		System.out.println("You have entered the month: " + newMonth.toString());
		
		return newMonth;
	}
	
	public static void compareMonths(Month month1, Month month2) {
		System.out.println("\nDemonstrating Month class comparison methods...\n\t____________________________");
		System.out.println("\nChecking if both months are the same using the 'equals' method...\n\t" + month1.equals(month2) + " | Month 1: " + month1 + " -- Month 2: " + month2);
		System.out.println("\nChecking if month 1 is later than month 2 using the 'greater than' method...\n\t" + month1.greaterThan(month2) + " | Month 1: " + month1 + " -- Month 2: " + month2);
		System.out.println("\nChecking if month 1 is earlier than month 2 using the 'less than' method...\n\t" + month1.lessThan(month2) + " | Month 1: " + month1 + " -- Month 2: " + month2);
	}
	
	
	//found this method on stackExchange - link
	public static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}

}

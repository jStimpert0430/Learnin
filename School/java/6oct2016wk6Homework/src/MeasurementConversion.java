//Joshua Stimpert
//lab wk6 - Measurement Conversion
//Oct 6 2016
import java.util.InputMismatchException;
import java.util.Scanner;

public class MeasurementConversion {

	public static void main(String[] args) {
		String conversionType;
		String terminalString;
		double numInput;
		System.out.println("Welcome to the measurement conversion program!\n");
		do{//main program loop
			numInput = captureNum();
			conversionType = captureString("Please enter the two letter conversion code for the type of conversion requested:"
											+ "\n(Gallons to liters = GL)"
											+ "\n(Inch to centimeter = IC)"
											+ "\n(Pound to Kilogram = PK)"
											+ "\n(Mile to kilometer = MK)", true);
			conversionBranch(conversionType, numInput);
			terminalString = captureString("\nPress enter to perform another conversion or type 'XX' to end the program:", false);
		}while(!terminalString.equalsIgnoreCase("XX"));
		System.out.println("\nThank you for using this program!");
	}//end of main
	
	
	//Method to capture string input with prompt as argument
	public static String captureString(String prompt, boolean validateData){
		String strCapture;
		Scanner stringInput = new Scanner(System.in);
		do{//loop to obtain string. If validate is set to true, perform verification on string entered to ensure a valid conversion code; Otherwise any data received is valid
			System.out.println(prompt);
			strCapture = stringInput.nextLine();
			if(strCapture.equalsIgnoreCase("GL") || strCapture.equalsIgnoreCase("IC") || strCapture.equalsIgnoreCase("PK") || strCapture.equalsIgnoreCase("MK"))
				break;//break from loop once a valid code is received
			else if (validateData == true)
				System.out.println("Invalid conversion code, please try again.\n");
		}while(validateData == true);
		return strCapture;
	}//end of captureString
	
	
	//Method to capture valid number input
	public static double captureNum(){
		double conversionNum;
		Scanner conversionIn = new Scanner(System.in);
		do{//Loop to obtain a valid input
			try{
				System.out.println("Please enter an amount to be converted");
				conversionNum = conversionIn.nextDouble();
				if(conversionNum > 0)
					break;//Once a positive number is received, break from loop.
				System.out.println("\nInvalid number, please enter a positive number.\n");
			}
			catch(InputMismatchException ex){
				System.out.println("\nInvalid input, please enter a number " + ex + "\n");
				conversionIn.nextLine();//Clear input stream on error to try again
			}
		}while(true);
		conversionIn.nextLine();//Clear input stream on success
		return conversionNum;
	}//end of captureNum
	
	
	//Method to call calculation method depending on conversion code entered
	public static void conversionBranch(String conversionCode, double numInput){
		if(conversionCode.equalsIgnoreCase("GL"))
			calcGalToLit(numInput);
		else if(conversionCode.equalsIgnoreCase("IC"))
			calcInchToCM(numInput);
		else if(conversionCode.equalsIgnoreCase("PK"))
			calcPoundToKG(numInput);
		else
			calcMileToKM(numInput);
	}//end of conversionBranch
	
	
	//calculation and answer output methods
	public static void calcGalToLit(double gal){
		double lit = gal * 3.78541178;
		System.out.printf("%s%s%s%.5f%s%s","-------------------------------\n",
				gal, " Gallons = ", lit, " Liters.",
				"\n-------------------------------\n");
	}
	public static void calcInchToCM(double inch){
		double centimeters = inch * 2.5;
		System.out.printf("%s%s%s%.5f%s%s","-------------------------------\n",
				inch, " Inches = ", centimeters, " Centimeters.",
				"\n-------------------------------\n");
	}
	public static void calcPoundToKG(double pound){
		double KG = pound * 0.45359237;
		System.out.printf("%s%s%s%.5f%s%s","-------------------------------\n",
				pound, " Pounds = ", KG, " Kilograms.",
				"\n-------------------------------\n");
	}
	public static void calcMileToKM(double mile){
		double KM = mile * 1.609344;
		System.out.printf("%s%s%s%.5f%s%s","-------------------------------\n",
				mile, " Miles = ", KM, " kilometers.",
				"\n-------------------------------\n");
	}
}//end of class

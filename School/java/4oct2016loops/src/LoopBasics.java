import java.util.Scanner;
public class LoopBasics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*double myAnswer = 0;
		
		for(int counter = 0; counter<=4; counter++){
			System.out.println("For loop counter " + counter);
			myAnswer = counter * .75;
			//System.out.println("My Answer = " + myAnswer);
		}
		System.out.println("My Answer = " + myAnswer);
		
		int moreLoop = 1;
		int counter = 0;
		
		while(moreLoop == 1){
			counter++;
			System.out.println("While loop counter " + counter);
			System.out.println("Enter a 1 to count more or any other number to stop.");
			moreLoop = input.nextInt();
		}
		input.nextLine();
		int doCounter = 0;
		
		do {
			doCounter++;
			System.out.println("Do while loop counter " + doCounter);
			System.out.println("Enter a 1 to count more or any other number to stop.");
			moreLoop = input.nextInt();
		}while(moreLoop == 1);
		*/
		String code = "Nothing";
		do{
			System.out.println("input code my man");
			code = input.nextLine();
			if(code.equalsIgnoreCase("Stop")){
				break;
			}
			else System.out.println(code);
		}while(true);
		
	}
}

//Jstimpert
//Compound Conditionals
//13 sept 2016
import java.util.Scanner;
public class CompoundDecisionsVoting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int canidate1=0, canidate2=0, canidate3=0;
		String canidate1Name = "", canidate2Name = "", canidate3Name = "";
		
		try {
			System.out.println("Welcome to the voting calculator.\n");
			
			System.out.println("Please the name of canidate 1: ");
			canidate1Name = input.nextLine();
			System.out.println("Canidate 1 is named: "+canidate1Name+"\n");
			System.out.println("Enter the vote total for canidate 1: ");
			canidate1 = input.nextInt();
			input.nextLine();
			System.out.printf("%s%d%n%n", "The vote total for canidate 1 is ", canidate1);
			
			System.out.println("Please enter the name of canidate 2: ");
			canidate2Name = input.nextLine();
			System.out.println("Canidate 2 is named: "+canidate2Name+"\n");
			System.out.println("Enter the vote total for canidate 2: ");
			canidate2 = input.nextInt();
			input.nextLine();
			System.out.printf("%s%d%n%n", "The vote total for canidate 2 is ", canidate2);
			
			System.out.println("Please enter the name of canidate 3: ");
			canidate3Name = input.nextLine();
			System.out.println("Canidate 3 is named: "+canidate3Name+"\n");
			System.out.println("Enter the vote total for canidate 3: ");
			canidate3 = input.nextInt();
			input.nextLine();
			System.out.printf("%s%d%n%n", "The vote total for canidate 3 is ", canidate3);
		}
		
		catch (Exception ex) {
			System.out.println("Incorrect datatype error: " + ex);
			System.out.println("Ending program...");
			System.exit(-1);
		}
		
		int totalVotes = canidate1 + canidate2 + canidate3;
		System.out.println("The total votes cast is "+totalVotes+"\n");
		
		double c1percentage = ((double) canidate1 / totalVotes);
		System.out.printf("%s%.3f%n","The percentage of votes cast for canidate 1 is ", c1percentage);
		c1percentage = (double) canidate2 / totalVotes;
		System.out.printf("%s%.3f%n", "The percentage of votes cast for canidate 2 is ", c1percentage);
		c1percentage = (double) canidate3 / totalVotes;
		System.out.printf("%s%.3f%n%n", "The percentage of votes cast for canidate 3 is ", c1percentage);
		
		
		if(canidate1 > canidate2){
			if(canidate1 > canidate3){
				System.out.println(canidate1Name+" has recieved the most votes with "+canidate1+" votes.\n");
			}
			else{
				System.out.println(canidate3Name+" has recieved the most votes with "+canidate3+" votes.\n");
			}
		}
		else if(canidate2 > canidate3){
			System.out.println("Canidate 2 has recieved the most votes with "+canidate2+" votes.\n");
		}
		else if(canidate3 > canidate2){
			System.out.println("Canidate 3 has recieved the most votes with "+canidate3+" votes.\n");
		}
		//if ((canidate1 == canidate2) || (canidate1 == canidate3) || (canidate2 == canidate3)){
			//System.out.println("The winner is a tie");
		//}
		if (canidate1 == canidate2){
			System.out.println("The winner is a tie between "+canidate1Name+" and "+canidate2Name);
		}
		else if (canidate1 == canidate3){
			System.out.println("The winner is a tie between "+canidate1Name+" and "+canidate3Name);
		}
		else if (canidate2 == canidate3){
			System.out.println("The winner is a tie between "+canidate2Name+" and "+canidate3Name);
		}
		input.close();
		System.out.println("Thank you for using the Voting Calculator. \nCome back soon!");
	}	
}



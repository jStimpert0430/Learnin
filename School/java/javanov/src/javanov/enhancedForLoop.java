package javanov;

public class enhancedForLoop {

	public static void main(String[] args) {
		double average = 0;
		int standardTotal=0;
		int enhancedTotal=0;
		
		int[] examScores = {99, 80, 60, 100, 85, 97, 66};
		System.out.println("A standard FOR loop example.\n");
		
		for(int i = 0; i < examScores.length; i++){
			standardTotal += examScores[i];
			System.out.printf("The current Score is : %d.%n", examScores[i], ".");
			System.out.printf("The current Total is: %d.%n%n", standardTotal, ".");
		}
		
		average = (double)standardTotal / examScores.length;
		System.out.println("The average of the scores are :" + average);
		
		System.out.println("\n\nThe enhanced for loop example");
		
		for(int score: examScores){//Must have an array to work and use the same datatype for temportary variable
			enhancedTotal += score;
			System.out.printf("The current Score is %d.%n", score, ".");
			System.out.printf("The current Total is: %d.%n%n", enhancedTotal, ".");
		}
		
		average = (double)enhancedTotal / examScores.length;
		System.out.println("The average of the scores are :" + average);
	}

}

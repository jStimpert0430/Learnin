package javanov;
import java.util.Scanner;

public class Ex04varArgDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter 3 integers for comparison");
		int score01 = keyboard.nextInt();
		int score02 = keyboard.nextInt();
		int score03 = keyboard.nextInt();
		int highestScore1 = max(score01, score02, score03);
		System.out.println("Highest score = " + highestScore1);
		System.out.println("Please enter 4 integers for comparison");
		int score04 = keyboard.nextInt();
		int score05 = keyboard.nextInt();
		int score06 = keyboard.nextInt();
		int score07 = keyboard.nextInt();
		int highestScore2 = max(score04, score05, score06, score07);
		System.out.println("Highest score = " + highestScore2);
		int highestScore3 = max(highestScore1, highestScore2);
		System.out.println("The higher highest score = " + max(highestScore1, highestScore2));

	}
	
	/*static int max(int score1, int score2, int score3){
		return 1;
	}
	
	static int max(int score1, int score2, int score3, int score4){
		return 2;
	}
	
	static int max(int score1, int score2){
		return 3;
	}
	*/
	
	public static int max(int... arg){ //variable arguments list
		if(arg.length == 0){
			System.out.println("There are no numbers to compare");
			System.exit(0);
		}
		int largest = arg[0];
		for(int i = 1; i < arg.length; i++){
			if(arg[i] > largest)
				largest = arg[i];
		}
		return largest;
	}

}

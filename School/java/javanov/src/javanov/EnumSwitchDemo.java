package javanov;
import java.util.Scanner;

public class EnumSwitchDemo {
	enum Flavor {VANILLA, CHOCOLATE, STRAWBERRY, SHERBERT};

	public static void main(String[] args) {
		Flavor favorite = null;
		Scanner keyboard = new Scanner(System.in);
		String answer = "";
		do{
		try{
				System.out.println("What is your favorite flavor?");
				answer = keyboard.next();
				answer = answer.toUpperCase();
				favorite = Flavor.valueOf(answer);//Same numerical value as the string in the enum
				break;
		}
		catch(Exception ex){
			System.out.println("error : " + ex);
		}
		}while(true);
		switch (favorite){
		case VANILLA:
			System.out.println("Classic");
			break;
		case CHOCOLATE:
			System.out.println("Gross");
			break;
		default: 
			System.out.println("Hmmm");
		}

	}

}

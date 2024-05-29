import java.util.Scanner;
public class switches1 {

	public static void main(String[] args) {
		char myChar;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character: ");
		myChar = input.nextLine().charAt(0);
		
		switch(myChar){
		case 'a': 
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.print("The character is a vowel.");
			break;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.print("The character is a digit.");
			break;
		default:
			System.out.print("The character is something else");
		}

	}

}

//Joshua Stimpert
//Print Variations
//1 sept, 2016
public class PrintVariations {

	public static void main(String[] args) {
		System.out.print("Hello! " + "Joshua Stimpert");
		System.out.print("\n");
		System.out.println("Hello! " + "Joshua Stimpert");
		System.out.print("Hello! " + "Joshua Stimpert");
		System.out.println();
		System.out.print("Hello! " + "\nJoshua Stimpert\n");
		System.out.println("*******************************************");
		System.out.printf("%s", "hello4");
		System.out.print("\n");
		System.out.printf("%S", "hello5");
		System.out.printf("%n");
		System.out.printf("%d", 12345);
		System.out.printf("%n");
		System.out.printf("%,d", 123456789);
		System.out.printf("%n");
		System.out.printf("%,.3f", 12345.6);
		System.out.printf("%n");
		System.out.printf("%.2f", 12.3456);
		System.out.printf("%n");
		System.out.printf("%.2e", 12345.6);
		System.out.printf("%n");
		System.out.printf("%n%S%s%d%s%n%s", "Hello!\n","It is the ",14,"th day of the month","That is all!");
	}

}

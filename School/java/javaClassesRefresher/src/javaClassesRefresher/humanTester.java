package javaClassesRefresher;

public class humanTester {

	public static void main(String[] args) {
		HumanClass human1 = new HumanClass();
		HumanClass human2 = new HumanClass("Josh", 30);
		HumanClass human3 = new HumanClass("Joe", 32);
		
		System.out.println(human1.toString());
		System.out.println(human2.toString());
		System.out.println(human3.toString());
		
		human2.Birthday();
		human2.Birthday();
		human2.Birthday();
	}

}

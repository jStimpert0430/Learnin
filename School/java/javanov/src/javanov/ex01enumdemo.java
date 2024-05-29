package javanov;

public class ex01enumdemo {
	enum WorkDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};// enums are classes of type enum

	public static void main(String[] args) {
		WorkDay startDay = WorkDay.MONDAY;
		WorkDay endDay = WorkDay.FRIDAY;
		
		System.out.println("Work starts on " + startDay);
		System.out.println("Work ends on " + endDay);

	}

}

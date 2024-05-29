//Joshua Stimpert - Java II - Fall 2020
//Lab 1 - Month Class


public class Month {
	private int monthNumber;
	private String[] calender = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "Invalid"};
	
	//No-arg constructor that initializes monthNumber to 1
	public Month() {
		setMonthNumber(1);
	}
	
	//Constructor that takes int to intialize new month
	public Month(int newMonthNumber) {
		setMonthNumber(newMonthNumber);
	}
	
	//Constructor that takes a string to initialize a new month(subtract 1 from length so user can't enter "Invalid" as a valid month)
	public Month(String monthName) {
		for(int i = 0; i < calender.length - 1; i++) {
			if (monthName.equalsIgnoreCase(calender[i])) {
				setMonthNumber(i + 1);
				return;
			}
		}
		
		setMonthNumber(13);
	}
	
	//get methods
	public int getMonthNumber() {
		return monthNumber;
	}
	
	public String getMonthName() {
		return calender[monthNumber - 1];
	} 
	
	//set methods
	public void setMonthNumber(int newMonthNumber) {
		if(newMonthNumber > 0 && newMonthNumber < 13)
			monthNumber = newMonthNumber;
		else
			monthNumber = 13;
	}
	
	public boolean equals(Month otherMonth) {
		if(this.getMonthNumber() == otherMonth.getMonthNumber())
			return true;
		else
			return false;
	}
	
	public boolean greaterThan (Month otherMonth) {
		if (this.getMonthNumber() > otherMonth.getMonthNumber())
			return true;
		else
			return false;
	}
	
	public boolean lessThan (Month otherMonth) {
		if(this.getMonthNumber() < otherMonth.getMonthNumber())
			return true;
		else
			return false;
	}
	
	//toString override
	public String toString() {
		return getMonthName();
		
	}

}

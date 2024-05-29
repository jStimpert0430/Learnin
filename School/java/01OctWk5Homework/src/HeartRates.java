//Joshua Stimpert
//Week 5 lab
//Oct 1, 2016
public class HeartRates {
	//Instance Variables
	private String fName;
	private String lName;
	private int birthYear;
	
	//Default Constructor
	public HeartRates(){
		setFName("NO");
		setLName("NAME");
		setBirthYear(1901);
	}
	
	//Full Argument Constructor
	public HeartRates(String newFName, String newLName, int newBirthYear){
		setFName(newFName);
		setLName(newLName);
		setBirthYear(newBirthYear);
	}
	
	//Accessor Methods
	public String getFName(){
		return fName;
	}
	public String getLName(){
		return lName;
	}
	public int getBirthYear(){
		return birthYear;
	}
	
	//Mutator Methods
	public void setFName(String updateFName){
		fName = updateFName;
	}
	public void setLName(String updateLName){
		lName = updateLName;
	}
	public void setBirthYear(int updateBirthYear){
		birthYear = updateBirthYear;
	}
	
	//Other Methods
	public int calcAge(){//Calculate the users age based on their birthyear
		return (2016 - birthYear);
	}
	public int calcMaxHeart(int age){//Calculate a user's max hear rate
		return (220 - age);
	}
	public int calcTargetHeart(int maxHearRate, double target){//Calculate a target heartrate based on their max rate and a target multiplier then cast to an int
		return (int)(maxHearRate * target);
	}
	
	//toString Method
	public String toString(){
		return "\nWelcome, " + fName + " " + lName + "." +
				"\nAge: " + calcAge() + 
				"\nMax heart rate: " + calcMaxHeart(calcAge()) + " bpm" +
				"\nOptimal heart rate range: " + calcTargetHeart(calcMaxHeart(calcAge()), 0.5) + " - " + calcTargetHeart(calcMaxHeart(calcAge()), 0.85) + " bpm";
	}
	
}//End of class

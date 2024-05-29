
public class WoooooWWow70s {
	private int cadence;
	private int gear;
	private int speed;
	private final int id;
	
	private static int numberOfBicycles = 0;

	public WoooooWWow70s(int startCadence, int startSpeed, int startGear){
		gear = startGear;
		cadence = startCadence;
		speed=startSpeed;
		
		id = ++numberOfBicycles;
	}
	
	public int getID(){
		return id;
	}
	public int getCadence(){
		return cadence;
	}
	public int getGear(){
		return gear;
	}
	public int getSpeed(){
		return speed;
	}
	public static int getNumberOfBicycles(){
		return numberOfBicycles;
	}
	
	public void setCadence(int newCadence){
		cadence = newCadence;
	}
	public void setGear(int newGear){
		gear = newGear;
	}
	public void applyBrake(int decrement){
		speed -= decrement;
	}
	public void speedUp(int increment){
		speed += increment;
	}
	
	//public void setID(int newID){
	//	id = newID;
	//}
}

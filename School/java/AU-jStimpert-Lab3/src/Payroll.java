import java.io.Serializable;

public class Payroll implements Serializable {
	private static int id;
	private String name;
	private double payRate;
	private int hoursWorked;
	
	public Payroll() {
		
	}
	
	public Payroll(String newName, double newPayRate, int newHoursWorked) {
		
	}
	
	
	public double getGrossPay() {
		return payRate * hoursWorked;
	}
	
	
	public String getName() {
		return "";
	}
	
	public double getPayRate() {
		return 0;
	}
	
	public int getHoursWorked() {
		return 0;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setPayRate(double newPayRate) {
		payRate = newPayRate;
	}
	
	public void setHoursWorked(int newHoursWorked) {
		hoursWorked = newHoursWorked;
	}
	
	
}

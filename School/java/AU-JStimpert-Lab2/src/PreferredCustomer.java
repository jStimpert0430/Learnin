//Joshua Stimpert - Lab 2


public class PreferredCustomer extends Customer{
	private double totalSpent;
	private double discount;
	
	public PreferredCustomer() {
		super("No Name", "No Address", "No Number", false);
		totalSpent = 0;
		discount = 0;
	}
	
	public PreferredCustomer(String newName, String newAddress, String newNumber, Boolean mailingListChoice) {
		super(newName,newAddress,newNumber,mailingListChoice);
		totalSpent = 0;
		discount = 0;
		
	}
	
	public double getDiscount() {
		updateDiscount();
		return discount;
	}
	
	public double getTotalSpent() {
		return totalSpent;
	}
	
	public void setTotalSpent(double newAmount) {
		totalSpent = newAmount;
		updateDiscount();
	}
	
	public void purchase(double receiptTotal) {
		if((totalSpent + receiptTotal) >= 0)
			totalSpent += receiptTotal;
		else
			System.out.println("Total spent for an account cannot be negative.");
		updateDiscount();
	}
	
	public void updateDiscount() {
		if(totalSpent >= 2000) {
			discount = 10;
		}
		else if(totalSpent >= 1500) {
			discount = 7;
		}
		
		else if(totalSpent >= 1000) {
			discount = 6;
		}
		
		else if(totalSpent >= 500) {
			discount = 5;
		}
		
		else discount = 0;
	}
}

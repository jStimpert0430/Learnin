//Joshua Stimpert - Lab 2


public class Customer extends Person{
	private static int customerCount;
	private int customerNumber;
	private boolean mailingList;
	
	
	public Customer() {
		super("No Name", "No Address", "No Number");
		setMailingList(false);
		customerNumber = customerCount;
		customerCount++;
	}
	
	public Customer(String newName, String newAddress, String newNumber, Boolean mailingListChoice) {
		super(newName,newAddress, newNumber);
		setMailingList(mailingListChoice);
		customerNumber = customerCount;
		customerCount++;
	}
	
	public Boolean getMailingList(){
		return mailingList;
	}
	
	public int getCustomerNumber() {
		return customerNumber;
	}
	
	public void setCustomerNumber(int newCustomerNumber) {
		customerNumber = newCustomerNumber;
	}
	
	public void setMailingList(Boolean choice) {
		mailingList = choice;
	}
	
	
}

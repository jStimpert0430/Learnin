// Joshua Stimpert
// lab 4 - fully formed class
// 9/22/16

public class Invoice {
	//Instance Variables
	private String partNumber, partDescription;
	private int itemQty;
	private double itemPrice;
	
	//Default constructor
	public Invoice(){
		setPartNumber("0");
		setPartDescription("NULL");
		setItemQty(0);
		setItemPrice(0.0);
	}
	
	//Full Arg constructor
	public Invoice(String newPartNum, String newPartDesc, int newItemQty, double newItemPrice){
		setPartNumber(newPartNum);
		setPartDescription(newPartDesc);
		setItemQty(newItemQty);
		setItemPrice(newItemPrice);
	}
	
	//Accessor methods
	public String getPartNumber(){
		return partNumber;
	}
	public String getPartDescription(){
		return partDescription;
	}
	public int getItemQty(){
		return itemQty;
	}
	public double getItemPrice(){
		return itemPrice;
	}
	
	//Mutator methods
	public void setPartNumber(String updatePartNumber){
		partNumber = updatePartNumber;
	}
	public void setPartDescription(String updatePartDescription){
		partDescription = updatePartDescription;
	}
	public void setItemQty(int updateItemQty){
		itemQty = updateItemQty;
	}
	public void setItemPrice(double updateItemPrice){
		itemPrice = updateItemPrice;
	}
	
	//Invoice calculation method
	public double getInvoiceAmount(){
		double total;
		total = itemPrice * itemQty;
		return total;
	}
	
	//toString method
	public String toString(){
		return "Your order for a: "
				+ "\n\tPart number: " + partNumber
				+ "\n\tPart Description: " + partDescription
				+ "\n\tItem Quantity: " + itemQty
				+ "\n\tItem Price: " + itemPrice + "\n";
	}
	
}//end of class

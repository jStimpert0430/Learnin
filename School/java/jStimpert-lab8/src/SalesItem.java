//Joshua Stimpert
//Class to create sales detail
//25 oct 2016

public class SalesItem {
	private String name;
	private int qty;
	private double productPrice;


	public SalesItem(){
		setName(null);
		setQty(0);
		setProductPrice(0);
	}

	public SalesItem(String newName, int newQty, double newPrice){
		setName(newName);
		setQty(newQty);
		setProductPrice(newPrice);
	}

	public String getName(){
		return name;
	}

	public int getQty(){
		return qty;
	}
	
	public double getProductPrice(){
		return productPrice;
	}

	public void setName(String updateName){
		name = updateName;
	}

	public void setQty(int updateQty){
		if(updateQty < 0)
			updateQty = 0;
		qty = updateQty;
	}
	
	public void setProductPrice(double updatePrice){
		productPrice = updatePrice;
	}
	
	public double calcExtendedPrice(){
		return productPrice * qty;
	}
	public String toString(){
		return "Product name: " + name +
				"\nProduct Quantity: " + qty + 
				"\nProduct Price: $" + productPrice;
	}
}

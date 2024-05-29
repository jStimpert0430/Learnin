//Joshua Stimpert
//22 sept 2016
//A pizza class
public class Pizza {
	private String size;
	private int cheeseToppings;
	private int meatToppings;
	private int veggieToppings;
	
	public Pizza(){
		setSize("SMALL");
		setCheeseToppings(0);
		setMeatToppings(0);
		setVeggieToppings(0);
	}
	
	public Pizza(String newSize, int newCheese, int newMeat, int newVeggie){
		setSize(newSize);
		setCheeseToppings(newCheese);
		setMeatToppings(newMeat);
		setVeggieToppings(newVeggie);
	}
	
	public String getSize(){
		return size;
	}
	
	public int getCheese(){
		return cheeseToppings;
	}
	
	public int getMeat(){
		return meatToppings;
	}
	
	public int getVeggie(){
		return veggieToppings;
	}
	
	public void setSize(String updateSize){
		size = updateSize;
	}
	
	public void setCheeseToppings(int updateCheeseToppings){
		cheeseToppings = updateCheeseToppings;
	}
	
	public void setMeatToppings(int updateMeatToppings){
		meatToppings = updateMeatToppings;
	}
	
	public void setVeggieToppings(int updateVeggieToppings){
		veggieToppings = updateVeggieToppings;
	}
	
	public double calcCost(){
		int cost = 0;
		int toppings = cheeseToppings + meatToppings + veggieToppings;
		if (size.equalsIgnoreCase("SMALL")){
			cost = 10 + 2 * toppings;
		}
		if (size.equalsIgnoreCase("MEDIUM")){
			cost = 12 + 2 * toppings;
		}
		if (size.equalsIgnoreCase("LARGE")){
			cost = 14 + 2 * toppings;
		}
		return cost;
	}
	
	public String toString(){
		return "Your pizza is a " + size + " size with-"
				+ "\nCheese toppings: " + cheeseToppings 
				+ "\nMeat Toppings: " + meatToppings
				+ "\nVeggie Toppings: " + veggieToppings;
	}
}




public class Person {
	private String name, address, telephone;
	
	public Person() {
		name = "no name";
		address = "no address";
		telephone = "no number";
	}
	
	public Person(String newName, String newAddress, String newNumber) {
		setName(newName);
		setAddress(newAddress);
		setNumber(newNumber);
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return telephone;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAddress(String newAddress) {
		address = newAddress;
	}
	
	public void setNumber(String newTelephone) {
		telephone = newTelephone;
	}
	
	public String toString() {
		return name;
	}
	
}

// Joshua Stimpert
// lab 4-tester
// 9/22/16
public class InvoiceTest {

	public static void main(String[] args) {
		//create new invoice objects
		Invoice invoice01 = new Invoice();
		Invoice invoice02 = new Invoice("1", "Hammer", 2, 5.00);
		
		//output with method calls
		System.out.printf("%S", invoice01.toString());
		System.out.printf("%S$%.2f%n%n", "\tTotal Price: ", invoice01.getInvoiceAmount());
		System.out.printf("%S", invoice02.toString());
		System.out.printf("%S$%.2f%n%n", "\tTotal Price: ", invoice02.getInvoiceAmount());
	}

}

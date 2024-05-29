//Joshua Stimpert - Lab 2

import static org.junit.Assert.*;

import org.junit.Test;

public class PrefCustomerTest {

	@Test
	public void test() {
		
		Customer testCustomer = new Customer();
		PreferredCustomer testPrefCustomer = new PreferredCustomer("John", "121 rainy street", "330-111-1111", false);
		//test ID accumulates the same number for both parent and inherited classes
		assertEquals(testPrefCustomer.getCustomerNumber(), 1);
		assertEquals(testPrefCustomer.getDiscount(), 0f, 0.001);
		//test purchase and direct setting
		testPrefCustomer.purchase(750.00);
		assertEquals(testPrefCustomer.getTotalSpent(), 750, 0.001);
		assertEquals(testPrefCustomer.getDiscount(), 5, 0.001);
		testPrefCustomer.setTotalSpent(2500.00);
		assertEquals(testPrefCustomer.getDiscount(), 10, 0.001);
		//test totalSpent to make sure it won't go negative on purchase
		testPrefCustomer.purchase(-3500.00);
		assertEquals(testPrefCustomer.getTotalSpent(), 2500, 0.001);
		
		
	}
	

}

//Joshua Stimpert - Lab 2

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {

	@Test
	public void customerTest() {
		Customer testCustomer = new Customer("John", "121 rainy street", "330-111-1111", false);
		//Check subclass creation
		assertEquals(testCustomer.getName(), "John");
		assertEquals(testCustomer.getAddress(), "121 rainy street");
		assertEquals(testCustomer.getPhone(), "330-111-1111");
		assertEquals(testCustomer.getMailingList(), false);
		testCustomer.setMailingList(true);
		assertEquals(testCustomer.getMailingList(), true);
		//Check ID accumulation
		assertEquals(0, testCustomer.getCustomerNumber());
		Customer testCustomer2 = new Customer();
		Customer testCustomer3 = new Customer();
		assertEquals(2, testCustomer3.getCustomerNumber());
	}

}

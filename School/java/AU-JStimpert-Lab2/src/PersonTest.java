import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		Person testPerson = new Person("John", "121 rainy street", "330-111-1111");
		assertEquals(testPerson.getName(), "John");
		assertEquals(testPerson.getAddress(), "121 rainy street");
		assertEquals(testPerson.getPhone(), "330-111-1111");
	}

}

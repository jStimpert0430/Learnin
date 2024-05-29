import static org.junit.Assert.*;

import org.junit.Test;

public class MonthTest {
	


	@Test
	public void testSetMonthNumber() {
		Month testMonth = new Month();
		testMonth.setMonthNumber(2);
		assertEquals(2, testMonth.getMonthNumber());
		testMonth.setMonthNumber(25);
		assertEquals(13, testMonth.getMonthNumber());
	}

	@Test
	public void testEqualsMonth() {
		Month testMonth = new Month();
		Month testMonth2 = new Month();
		testMonth2.setMonthNumber(3);
		assertEquals(true, testMonth.equals(testMonth));
		assertEquals(false, testMonth.equals(testMonth2));
	}

	@Test
	public void testGreaterThan() {
		Month testMonth = new Month();
		Month testMonth2 = new Month();
		testMonth2.setMonthNumber(3);
		assertEquals(false, testMonth.greaterThan(testMonth));
		assertEquals(true, testMonth2.greaterThan(testMonth));
	}

	@Test
	public void testLessThan() {
		Month testMonth = new Month();
		Month testMonth2 = new Month();
		testMonth2.setMonthNumber(3);
		assertEquals(false, testMonth.lessThan(testMonth));
		assertEquals(true, testMonth.lessThan(testMonth2));
	}

}

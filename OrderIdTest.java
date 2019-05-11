/**
 * 
 */
package order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Tommy Cusack
 *
 */
class OrderIdTest {
	
	/**
	 * Test method for {@link order.OrderId#hashCode()}.
	 */
	@Test
	final void testHashCode() {
		OrderId orderId = new OrderId();
		Assertions.assertNotEquals(0, orderId.hashCode(), "OrderId.hashCode() test failed");
	}

	/**
	 * Test method for {@link order.OrderId#OrderId()}.
	 */
	@Test
	final void testOrderIdOrderIdNumber() {
		OrderId orderId = new OrderId();
		Assertions.assertEquals(true, orderId.getOrderIdNumber() instanceof AtomicLong, "OrderId.testOrderIdOrderIdNumber() test failed");
	}

	/**
	 * Test method for {@link order.OrderId#OrderId()}.
	 */
	@Test
	final void testOrderIdOrderIdString() {
		OrderId orderId = new OrderId();
		Assertions.assertEquals(true, orderId.getOrderIdString() instanceof String, "OrderId.testOrderIdOrderIdString() test failed");
	}

	/**
	 * Test method for {@link order.OrderId#getOrderIdNumber()}.
	 */
	@Test
	final void testGetOrderIdNumber() {
		OrderId orderId = new OrderId();
		Assertions.assertEquals(true, orderId.getOrderIdNumber() instanceof AtomicLong, "OrderId.testGetOrderIdNumber() test failed");
	}

	/**
	 * Test method for {@link order.OrderId#getOrderIdString()}.
	 */
	@Test
	final void testGetOrderIdString() {
		OrderId orderId = new OrderId();
		Assertions.assertEquals(true, orderId.getOrderIdString() instanceof String, "OrderId.testGetOrderIdString() test failed");
	}

	/**
	 * Test method for {@link order.OrderId#setOrderIdString(java.lang.String)}.
	 */
	@Test
	final void testSetOrderIdStringString() {
		// final String ORDERID_STRING = orderId.getOrderIdString();
		OrderId orderId = new OrderId();
		String testString = "test string";
		orderId.setOrderIdString(testString);
		Assertions.assertEquals(testString, orderId.getOrderIdString(), "OrderId.testSetOrderIdStringString() test failed");
	}

	/**
	 * Test method for {@link order.OrderId#setOrderIdString(java.util.concurrent.atomic.AtomicLong)}.
	 */
	@Test
	final void testSetOrderIdStringAtomicLong() {
		OrderId orderId = new OrderId();
		AtomicLong atomicLong = new AtomicLong( Long.MAX_VALUE );
		orderId.setOrderIdString(atomicLong);
		Assertions.assertEquals(true, orderId.getOrderIdString().endsWith(""+Long.MAX_VALUE), "OrderId.testSetOrderIdStringAtomicLong() test failed");
	}

	/**
	 * Test method for {@link order.OrderId#isOrderIdNumberValid(java.util.concurrent.atomic.AtomicLong)}.
	 */
	@Test
	final void testIsOrderIdNumberValid() {
		OrderId orderId = new OrderId();
		Assertions.assertEquals(true, orderId.getOrderIdNumber() instanceof AtomicLong, "OrderId.testIsOrderIdNumberValid() test failed");
	}

	/**
	 * Test method for {@link order.OrderId#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObject() {
		OrderId orderId = new OrderId();
		Assertions.assertEquals(true, orderId.getOrderIdNumber().equals( orderId.getOrderIdNumber() ) , "OrderId.testEqualsObject() test failed");
	}

	/**
	 * Test method for {@link order.OrderId#toString()}.
	 */
	@Test
	final void testToStringNonNull() {
		OrderId orderId = new OrderId();
		Assertions.assertNotEquals(null, orderId.toString(), "OrderId.testToStringNonNull() test failed");
	}

	/**
	 * Test method for {@link order.OrderId#toString()}.
	 */
	@Test
	final void testToStringNonEmpty() {
		OrderId orderId = new OrderId();
		Assertions.assertNotEquals("", orderId.toString(), "OrderId.testToStringNonEmpty() test failed");
	}
}

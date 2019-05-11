/**
 * 
 */
package order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Tommy Cusack
 *
 */
class OrderStatusTest {
	
	/**
	 * Test method for {@link order.OrderStatus#getOrderStatusString()}.
	 */
	@Test
	final void testGetOrderStatusString() {
		OrderStatus orderStatus = OrderStatus.LIVE;
		Assertions.assertEquals("LIVE", orderStatus.getOrderStatusString(), "userId.testGetOrderStatusString() test failed");
	}

	/**
	 * Test method for {@link order.OrderStatus#getOrderStatusDefault()}.
	 */
	@Test
	final void testGetOrderStatusDefault() {
		Assertions.assertEquals(OrderStatus.INVALID_ORDER_STATUS, OrderStatus.getOrderStatusDefault(), "userId.testGetOrderStatusDefault() test failed");
	}

}

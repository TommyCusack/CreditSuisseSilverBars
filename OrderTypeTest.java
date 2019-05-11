/**
 * 
 */
package order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author tommy
 *
 */
class OrderTypeTest {
	
	/**
	 * Test method for {@link order.OrderType#getOrderTypeString()}.
	 */
	@Test
	final void testGetOrderTypeString() {
		OrderType orderType = OrderType.BUY;
		Assertions.assertEquals("BUY", orderType.getOrderTypeString(), "OrderType.testGetOrderTypeString() test failed");
	}

	/**
	 * Test method for {@link order.OrderType#getOrderTypeDefault()}.
	 */
	@Test
	final void testGetOrderTypeDefault() {
		Assertions.assertEquals(OrderType.INVALID_ORDER_TYPE, OrderType.getOrderTypeDefault(), "OrderUnit.testGetOrderTypeDefault() test failed");
	}

}

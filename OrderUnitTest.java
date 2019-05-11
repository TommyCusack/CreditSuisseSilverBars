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
class OrderUnitTest {
	
	/**
	 * Test method for {@link order.OrderUnit#getOrderUnitString()}.
	 */
	@Test
	final void testGetOrderUnitString() {
		OrderUnit orderUnit = OrderUnit.KILOGRAM;
		Assertions.assertEquals("kg", orderUnit.getOrderUnitString(), "OrderUnit.testGetOrderUnitString() test failed");
	}

	/**
	 * Test method for {@link order.OrderUnit#getOrderUnitDefault()}.
	 */
	@Test
	final void testGetOrderUnitDefault() {
		Assertions.assertEquals(OrderUnit.KILOGRAM, OrderUnit.getOrderUnitDefault(), "OrderUnit.testGetOrderUnitDefault() test failed");
	}

	/**
	 * Test method for {@link order.OrderUnit#isOrderUnitValid(order.OrderUnit)}.
	 */
	@Test
	final void testIsOrderUnitValidFalse() {
		Assertions.assertFalse(OrderUnit.isOrderUnitValid(OrderUnit.INVALID_ORDER_UNIT), "OrderUnit.testIsOrderUnitValidFalse() test failed");
	}

	/**
	 * Test method for {@link order.OrderUnit#isOrderUnitValid(order.OrderUnit)}.
	 */
	@Test
	final void testIsOrderUnitValidTrue() {
		Assertions.assertTrue(OrderUnit.isOrderUnitValid(OrderUnit.KILOGRAM), "OrderUnit.testIsOrderUnitValidTrue() test failed");
	}
}

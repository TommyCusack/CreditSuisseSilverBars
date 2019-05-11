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
class OrderQuantityTest {
	/**
	 * Test method for {@link order.OrderQuantity#hashCode()}.
	 */
	@Test
	final void testHashCode() {
		OrderQuantity orderQuantity = new OrderQuantity();
		Assertions.assertNotEquals(0, orderQuantity.hashCode(), "OrderQuantity.testHashCode() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#OrderQuantity()}.
	 */
	@Test
	final void testOrderQuantityConstructorQuantity() {
		OrderQuantity orderQuantity = new OrderQuantity();
		Assertions.assertEquals(true, orderQuantity.getQuantity() instanceof Double, "OrderQuantity.testOrderQuantityConstructorQuantity() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#OrderQuantity()}.
	 */
	@Test
	final void testOrderQuantityConstructorOrderUnit() {
		OrderQuantity orderQuantity = new OrderQuantity();
		Assertions.assertEquals(true, orderQuantity.getOrderUnit() instanceof OrderUnit, "OrderQuantity.testOrderQuantityConstructorOrderUnit() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#OrderQuantity(order.java.lang.Double)}.
	 */
	@Test
	final void testOrderQuantityQuantityConstructorQuantity() {
		OrderQuantity orderQuantityQuantity = new OrderQuantity(11.11);
		Assertions.assertEquals(true, orderQuantityQuantity.getQuantity() instanceof Double, "OrderQuantity.testOrderQuantityQuantityConstructorQuantity() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#OrderQuantity(order.java.lang.Double)}.
	 */
	@Test
	final void testOrderQuantityQuantityConstructorOrderUnit() {
		OrderQuantity orderQuantityQuantity = new OrderQuantity(11.11);
		Assertions.assertEquals(true, orderQuantityQuantity.getOrderUnit() instanceof OrderUnit, "OrderQuantity.testOrderQuantityQuantityConstructorOrderUnit() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#OrderQuantity(order.OrderUnit)}.
	 */
	@Test
	final void testOrderQuantityOrderUnitConstructorQuantity() {
		OrderQuantity orderQuantityOrderUnit = new OrderQuantity( OrderUnit.INVALID_ORDER_UNIT );
		Assertions.assertEquals(true, orderQuantityOrderUnit.getQuantity() instanceof Double, "OrderQuantity.testOrderQuantityOrderUnitConstructorQuantityQuantity() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#OrderQuantity(order.OrderUnit)}.
	 */
	@Test
	final void testOrderQuantityOrderUnitConstructorOrderUnit() {
		OrderQuantity orderQuantityOrderUnit = new OrderQuantity( OrderUnit.INVALID_ORDER_UNIT );
		Assertions.assertEquals(true, orderQuantityOrderUnit.getOrderUnit() instanceof OrderUnit, "OrderQuantity.testOrderQuantityOrderUnitConstructorOrderUnit() test failed");
	}
	
	/**
	 * Test method for {@link order.OrderQuantity#OrderQuantity(java.lang.Double, order.OrderUnit)}.
	 */
	@Test
	final void testOrderQuantityQuantityOrderUnitConstructorQuantityQuantity() {
		OrderQuantity orderQuantityQuantityOrderUnit = new OrderQuantity(33.33, OrderUnit.INVALID_ORDER_UNIT);
		Assertions.assertEquals(true, orderQuantityQuantityOrderUnit.getQuantity() instanceof Double, "OrderQuantity.testOrderQuantityQuantityOrderUnitConstructorQuantityQuantity() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#OrderQuantity(java.lang.Double, order.OrderUnit)}.
	 */
	@Test
	final void testOrderQuantityQuantityOrderUnitConstructorOrderUnit() {
		OrderQuantity orderQuantityQuantityOrderUnit = new OrderQuantity(33.33, OrderUnit.INVALID_ORDER_UNIT);
		Assertions.assertEquals(true, orderQuantityQuantityOrderUnit.getOrderUnit() instanceof OrderUnit, "OrderQuantity.testOrderQuantityQuantityOrderUnitConstructorOrderUnit() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#getOrderUnitDefault()}.
	 */
	@Test
	final void testGetOrderUnitDefault() {
		Assertions.assertEquals(OrderUnit.getOrderUnitDefault(), OrderQuantity.getOrderUnitDefault(), "OrderQuantity.testGetOrderUnitDefault() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#isOrderUnitValid(order.OrderUnit)}.
	 */
	@Test
	final void testIsOrderUnitValid() {
		OrderQuantity orderQuantity = new OrderQuantity();
		Assertions.assertEquals(true, OrderQuantity.isOrderUnitValid( orderQuantity.getOrderUnit() ), "OrderQuantity.testIsOrderUnitValid() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#isQuantityValid(java.lang.Double)}.
	 */
	@Test
	final void testIsQuantityValid() {
		OrderQuantity orderQuantity = new OrderQuantity();
		Assertions.assertEquals(true, OrderQuantity.isQuantityValid( orderQuantity.getQuantity()), "OrderQuantity.testIsQuantityValid() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#isOrderQuantityInterfaceValid()}.
	 */
	@Test
	final void testIsOrderQuantityInterfaceValid() {
		OrderQuantity orderQuantity = new OrderQuantity();
		Assertions.assertEquals(true, orderQuantity.isOrderQuantityInterfaceValid(), "OrderQuantity.testIsOrderQuantityInterfaceValid() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#isOrderQuantityInterfaceValid(order.OrderQuantityInterface)}.
	 */
	@Test
	final void testIsOrderQuantityInterfaceValidOrderQuantityInterface() {
		OrderQuantity orderQuantity = new OrderQuantity();
		Assertions.assertEquals(true, orderQuantity.isOrderQuantityInterfaceValid( orderQuantity ), "OrderQuantity.testIsOrderQuantityInterfaceValidOrderQuantityInterface() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#getQuantityDefault()}.
	 */
	@Test
	final void testGetQuantityDefault() {
		Assertions.assertEquals(true, OrderQuantity.getQuantityDefault() instanceof Double, "OrderQuantity.testGetQuantityDefault() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#getQuantity()}.
	 */
	@Test
	final void testGetQuantity() {
		OrderQuantity orderQuantityQuantityOrderUnit = new OrderQuantity(33.33, OrderUnit.INVALID_ORDER_UNIT);
		Assertions.assertEquals(true, orderQuantityQuantityOrderUnit.getQuantity() instanceof Double, "OrderQuantity.testGetQuantity() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#setQuantity(java.lang.Double)}.
	 */
	@Test
	final void testSetQuantity() {
		OrderQuantity orderQuantityQuantityOrderUnit = new OrderQuantity(33.33, OrderUnit.INVALID_ORDER_UNIT);
		Double newQuantity = 123.456; 
		orderQuantityQuantityOrderUnit.setQuantity(newQuantity);
		
		Assertions.assertEquals(newQuantity, orderQuantityQuantityOrderUnit.getQuantity(), "OrderQuantity.testGetQuantity() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#getOrderUnit()}.
	 */
	@Test
	final void testGetOrderUnit() {
		OrderQuantity orderQuantityQuantityOrderUnit = new OrderQuantity(33.33, OrderUnit.INVALID_ORDER_UNIT);
		Assertions.assertEquals(true, orderQuantityQuantityOrderUnit.getOrderUnit() instanceof OrderUnit, "OrderQuantity.testGetOrderUnit() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#setOrderUnit(order.OrderUnit)}.
	 */
	@Test
	final void testSetOrderUnit() {
		OrderQuantity orderQuantityQuantityOrderUnit = new OrderQuantity(33.33, OrderUnit.INVALID_ORDER_UNIT);
		OrderUnit newOrderUnit = OrderUnit.KILOGRAM; 
		orderQuantityQuantityOrderUnit.setOrderUnit(newOrderUnit);
		
		Assertions.assertEquals(newOrderUnit, orderQuantityQuantityOrderUnit.getOrderUnit(), "OrderQuantity.testSetOrderUnit() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#equals(java.lang.Object)}.
	 */
	@Test
	final void testEqualsObject() {
		OrderQuantity orderQuantityQuantityOrderUnit = new OrderQuantity(33.33, OrderUnit.INVALID_ORDER_UNIT);
		OrderQuantity orderQuantityQuantityOrderUnit2 = new OrderQuantity(33.33, OrderUnit.INVALID_ORDER_UNIT);
		Assertions.assertEquals(orderQuantityQuantityOrderUnit, orderQuantityQuantityOrderUnit2, "OrderQuantity.testEqualsObject() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#toString()}.
	 */
	@Test
	final void testToStringNonNull() {
		OrderQuantity orderQuantity = new OrderQuantity();
		Assertions.assertNotEquals(null, orderQuantity.toString(), "PriceOrderUnit.testToStringNonNull() test failed");
	}

	/**
	 * Test method for {@link order.OrderQuantity#toString()}.
	 */
	@Test
	final void testToStringNonEmpty() {
		OrderQuantity orderQuantity = new OrderQuantity();
		Assertions.assertNotEquals("", orderQuantity.toString(), "PriceOrderUnit.testToStringNonEmpty() test failed");
	}
}

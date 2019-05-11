/**
 * 
 */
package order;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import financial.Price;
import financial.PriceInterface;

/**
 * @author Tommy Cusack
 *
 */
class OrderTypeSortKeyTest {
	
	/**
	 * Test method for {@link order.OrderTypeSortKey#OrderTypeSortKey(order.OrderType, financial.PriceInterface)}.
	 */
	@Test
	final void testOrderTypeSortKey() {
		OrderTypeSortKey orderTypeSortKey = new OrderTypeSortKey(OrderType.SELL, new Price() );
		Assertions.assertEquals(true, orderTypeSortKey instanceof OrderTypeSortKey, "OrderTypeSortKey.testOrderTypeSortKey() test failed");
	}

	/**
	 * Test method for {@link order.OrderTypeSortKey#getOrderType()}.
	 */
	@Test
	final void testGetOrderType() {
		OrderTypeSortKey orderTypeSortKey = new OrderTypeSortKey(OrderType.SELL, new Price() );
		Assertions.assertEquals(true, orderTypeSortKey.getOrderType() instanceof OrderType, "OrderTypeSortKey.testGetOrderType() test failed");
	}

	/**
	 * Test method for {@link order.OrderTypeSortKey#getPriceImplementation()}.
	 */
	@Test
	final void testGetPriceImplementation() {
		OrderTypeSortKey orderTypeSortKey = new OrderTypeSortKey(OrderType.SELL, new Price() );
		Assertions.assertEquals(true, orderTypeSortKey.getPriceImplementation() instanceof PriceInterface, "OrderTypeSortKey.testGetPriceImplementation() test failed");
	}

}

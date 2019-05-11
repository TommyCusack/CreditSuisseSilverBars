/**
 * 
 */
package orderBoard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author tommy
 *
 */
class OrderGroupByTest {
	
	/**
	 * Test method for {@link orderBoard.OrderGroupBy#getOrderMergeByString()}.
	 */
	@Test
	final void testGetOrderMergeByString() {
		OrderGroupBy orderGroupBy = OrderGroupBy.PRICE;
		Assertions.assertEquals(OrderGroupBy.PRICE, orderGroupBy, "OrderGroupBy.testGetOrderMergeByString() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderGroupBy#getOrderMergeByDefault()}.
	 */
	@Test
	final void testGetOrderMergeByDefault() {
		OrderGroupBy orderGroupBy = OrderGroupBy.PRICE;
		Assertions.assertEquals(OrderGroupBy.PRICE, orderGroupBy, "OrderGroupBy.testGetOrderMergeByDefault() test failed");
	}

}

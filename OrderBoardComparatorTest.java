/**
 * 
 */
package orderBoard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import financial.Price;
import order.OrderType;
import order.OrderTypeSortKey;

/**
 * @author Tommy Cusack
 *
 */
class OrderBoardComparatorTest {
	
	/**
	 * Test method for {@link orderBoard.OrderBoardComparator#compare(order.OrderTypeSortKey, order.OrderTypeSortKey)}.
	 */
	@Test
	final void testCompare() {
		OrderBoardComparator orderBoardComparator = new OrderBoardComparator();
		OrderTypeSortKey orderTypeSortKey = new OrderTypeSortKey(OrderType.getOrderTypeDefault(), new Price());
		OrderTypeSortKey orderTypeSortKeySame = new OrderTypeSortKey(OrderType.getOrderTypeDefault(), new Price());
		Assertions.assertEquals(0, orderBoardComparator.compare(orderTypeSortKey, orderTypeSortKeySame), "OrderBoardComparator.testCompare() test failed");
	}
	
	/**
	 * Test method for {@link orderBoard.OrderBoardComparator#compare(order.OrderTypeSortKey, order.OrderTypeSortKey)}.
	 */
	@Test
	final void testCompareDifferent() {
		OrderBoardComparator orderBoardComparator = new OrderBoardComparator();
		OrderTypeSortKey orderTypeSortKey = new OrderTypeSortKey(OrderType.getOrderTypeDefault(), new Price());
		OrderTypeSortKey orderTypeSortKeyDifferentPrice = new OrderTypeSortKey(OrderType.getOrderTypeDefault(), new Price(999.999));
		Assertions.assertNotEquals(0, orderBoardComparator.compare(orderTypeSortKey, orderTypeSortKeyDifferentPrice), "OrderBoardComparator.testCompareDifferent() test failed");
	}
	
	/**
	 * Test method for {@link orderBoard.OrderBoardComparator#isOrdersComparable(order.OrderTypeSortKey, order.OrderTypeSortKey)}.
	 */
	@Test
	final void testIsOrdersComparable() {
		OrderBoardComparator orderBoardComparator = new OrderBoardComparator();
		OrderTypeSortKey orderTypeSortKey = new OrderTypeSortKey(OrderType.getOrderTypeDefault(), new Price());
		OrderTypeSortKey orderTypeSortKeySame = new OrderTypeSortKey(OrderType.getOrderTypeDefault(), new Price());
		Assertions.assertEquals(true, orderBoardComparator.isOrdersComparable(orderTypeSortKey, orderTypeSortKeySame), "OrderBoardComparator.testIsOrdersComparable() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoardComparator#isOrderComparable(order.OrderTypeSortKey)}.
	 */
	@Test
	final void testIsOrderComparable() {
		OrderBoardComparator orderBoardComparator = new OrderBoardComparator();
		OrderTypeSortKey orderTypeSortKey = new OrderTypeSortKey(OrderType.getOrderTypeDefault(), new Price());
		Assertions.assertEquals(true, orderBoardComparator.isOrderComparable(orderTypeSortKey), "OrderBoardComparator.testIsOrderComparable() test failed");
	}

}

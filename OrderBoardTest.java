/**
 * 
 */
package orderBoard;

import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import financial.Price;
import financial.PriceInterface;
import order.Order;
import order.OrderQuantity;
import order.OrderStatus;
import order.OrderType;
import order.OrderUnit;
import user.UserId;

/**
 * @author Tommy Cusack
 *
 */
class OrderBoardTest {
	
	/**
	 * Test method for {@link orderBoard.OrderBoard#hashCode()}.
	 */
	@Test
	final void testHashCode() {
		OrderBoard orderBoard = new OrderBoard();
		Assertions.assertEquals(0, orderBoard.hashCode(), "OrderBoard.testHashCode() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#hashCode()}.
	 */
	@Test
	final void testHashCodeNotEmpty() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.UK); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	orderBoard.addOrder(order);
    	
		Assertions.assertNotEquals(0, orderBoard.hashCode(), "OrderBoard.testHashCode() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#addOrder(java.util.Optional)}.
	 */
	@Test
	final void testAddOrderOptionalOfOrder() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.UK); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	Optional<Order> orderOptional = Optional.of(order);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	Assertions.assertTrue(orderBoard.addOrder(orderOptional), "OrderBoard.testAddOrderOptionalOfOrder() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#addOrder(order.Order)}.
	 */
	@Test
	final void testAddOrderOrder() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.UK); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	Assertions.assertTrue(orderBoard.addOrder(order), "OrderBoard.testAddOrderOrder() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#removeOrder(java.util.Optional)}.
	 */
	@Test
	final void testRemoveOrder() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.FRANCE); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	orderBoard.addOrder(order);
    	Optional<Order> orderOptional = Optional.of(order);
    	
    	Assertions.assertTrue(orderBoard.removeOrder(orderOptional), "OrderBoard.testRemoveOrder() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#removeOrder(java.util.Optional)}.
	 */
	@Test
	final void testRemoveOrderNotPresent() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.FRANCE); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	Optional<Order> orderOptional = Optional.of(order);
    	
    	OrderStatus orderStatusNotPresent = OrderStatus.INVALID_ORDER_STATUS;
    	Order orderNotPresent  = new Order(orderQuantityImplementation, orderStatusNotPresent, orderType, priceImplementation, userIdImplementation);
    	Optional<Order> orderOptionalNotPresent = Optional.of(orderNotPresent );
    	
    	OrderBoard orderBoard = new OrderBoard();
    	orderBoard.addOrder(orderOptional);
    	
    	Assertions.assertFalse(orderBoard.removeOrder(orderOptionalNotPresent), "OrderBoard.testRemoveOrderNotPresent() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#cancelOrder(java.util.Optional)}.
	 */
	@Test
	final void testCancelOrder() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.FRANCE); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	orderBoard.addOrder(order);
    	Optional<Order> orderOptional = Optional.of(order);
    	
    	Assertions.assertTrue(orderBoard.cancelOrder(orderOptional), "OrderBoard.testCancelOrder() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#filterOrderBoard(order.OrderStatus)}.
	 */
	@Test
	final void testFilterOrderBoardOrderStatus() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.FRANCE); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderStatus orderStatusInvalid = OrderStatus.INVALID_ORDER_STATUS;
    	Order orderInvalid = new Order(orderQuantityImplementation, orderStatusInvalid, orderType, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	Optional<Order> orderOptional = Optional.of(order);
    	Optional<Order> orderOptionalInvalid = Optional.of(orderInvalid);
    	orderBoard.addOrder(orderOptional);
    	orderBoard.addOrder(orderOptionalInvalid);
    	
    	List<Order> orderList = orderBoard.filterOrderBoard(OrderStatus.LIVE);
    	Assertions.assertEquals(1, orderList.size(), "OrderBoard.testFilterOrderBoardOrderStatus() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#filterOrderList(java.util.List, order.OrderStatus)}.
	 */
	@Test
	final void testFilterOrderListListOfOrderOrderStatus() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.FRANCE); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderStatus orderStatusInvalid = OrderStatus.INVALID_ORDER_STATUS;
    	Order orderInvalid = new Order(orderQuantityImplementation, orderStatusInvalid, orderType, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	Optional<Order> orderOptional = Optional.of(order);
    	Optional<Order> orderOptionalInvalid = Optional.of(orderInvalid);
    	orderBoard.addOrder(orderOptional);
    	orderBoard.addOrder(orderOptionalInvalid);
    	
    	List<Order> orderList = orderBoard.getOrderBoardAsList();
    	List<Order> orderListFiltered = orderBoard.filterOrderList(orderList, OrderStatus.LIVE);
    	Assertions.assertEquals(1, orderListFiltered.size(), "OrderBoard.testFilterOrderListListOfOrderOrderStatus() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#filterOrderBoard(order.OrderType)}.
	 */
	@Test
	final void testFilterOrderBoardOrderType() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.FRANCE); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderType orderTypeInvalid = OrderType.INVALID_ORDER_TYPE;
    	Order orderInvalid = new Order(orderQuantityImplementation, orderStatus, orderTypeInvalid, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	Optional<Order> orderOptional = Optional.of(order);
    	Optional<Order> orderOptionalInvalid = Optional.of(orderInvalid);
    	orderBoard.addOrder(orderOptional);
    	orderBoard.addOrder(orderOptionalInvalid);
    	
    	List<Order> orderList = orderBoard.filterOrderBoard(OrderType.SELL);
    	Assertions.assertEquals(1, orderList.size(), "OrderBoard.testFilterOrderBoardOrderType() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#filterOrderList(java.util.List, order.OrderType)}.
	 */
	@Test
	final void testFilterOrderListListOfOrderOrderType() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.FRANCE); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderType orderTypeInvalid = OrderType.INVALID_ORDER_TYPE;
    	Order orderInvalid = new Order(orderQuantityImplementation, orderStatus, orderTypeInvalid, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	Optional<Order> orderOptional = Optional.of(order);
    	Optional<Order> orderOptionalInvalid = Optional.of(orderInvalid);
    	orderBoard.addOrder(orderOptional);
    	orderBoard.addOrder(orderOptionalInvalid);
    	
    	List<Order> orderList = orderBoard.getOrderBoardAsList();
    	List<Order> orderListFiltered = orderBoard.filterOrderList(orderList, OrderType.SELL);
    	Assertions.assertEquals(1, orderListFiltered.size(), "OrderBoard.testFilterOrderListListOfOrderOrderType() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#groupOrders(orderBoard.OrderGroupBy)}.
	 */
	@Test
	final void testGroupOrdersOrderGroupBy() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.FRANCE); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderType orderTypeInvalid = OrderType.INVALID_ORDER_TYPE;
    	Order orderInvalid = new Order(orderQuantityImplementation, orderStatus, orderTypeInvalid, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	Optional<Order> orderOptional = Optional.of(order);
    	Optional<Order> orderOptionalInvalid = Optional.of(orderInvalid);
    	orderBoard.addOrder(orderOptional);
    	orderBoard.addOrder(orderOptionalInvalid);
    	
    	List<Order> orderListGrouped = orderBoard.groupOrders(OrderGroupBy.PRICE);
    	Assertions.assertEquals(orderBoard.size(), orderListGrouped.size(), "OrderBoard.testGroupOrdersOrderGroupBy() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#groupOrders(java.util.List, orderBoard.OrderGroupBy)}.
	 */
	@Test
	final void testGroupOrdersListOfOrderOrderGroupBy() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.FRANCE); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderType orderTypeInvalid = OrderType.INVALID_ORDER_TYPE;
    	Order orderInvalid = new Order(orderQuantityImplementation, orderStatus, orderTypeInvalid, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	Optional<Order> orderOptional = Optional.of(order);
    	Optional<Order> orderOptionalInvalid = Optional.of(orderInvalid);
    	orderBoard.addOrder(orderOptional);
    	orderBoard.addOrder(orderOptionalInvalid);
    	
    	List<Order> orderList = orderBoard.getOrderBoardAsList();
    	List<Order> orderListGrouped = orderBoard.groupOrders(orderList, OrderGroupBy.PRICE);
    	Assertions.assertEquals(orderBoard.size(), orderListGrouped.size(), "OrderBoard.testGroupOrdersListOfOrderOrderGroupBy() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#getOrderBoardAsList()}.
	 */
	@Test
	final void testGetOrderBoardAsList() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.FRANCE); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderType orderTypeInvalid = OrderType.INVALID_ORDER_TYPE;
    	Order orderInvalid = new Order(orderQuantityImplementation, orderStatus, orderTypeInvalid, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	Optional<Order> orderOptional = Optional.of(order);
    	Optional<Order> orderOptionalInvalid = Optional.of(orderInvalid);
    	orderBoard.addOrder(orderOptional);
    	orderBoard.addOrder(orderOptionalInvalid);
    	
    	List<Order> orderList = orderBoard.getOrderBoardAsList();
    	Assertions.assertEquals(orderBoard.size(), orderList.size(), "OrderBoard.testGetOrderBoardAsList() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#equals(List<Order>)}.
	 */
	@Test
	final void testEqualsObject() {
		OrderQuantity orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
    	OrderStatus orderStatus = OrderStatus.LIVE;
    	OrderType orderType = OrderType.SELL;
    	PriceInterface priceImplementation = new Price(306.00, Locale.FRANCE); 
    	UserId userIdImplementation = new UserId("User1");
    	Order order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
    	
    	OrderType orderTypeInvalid = OrderType.INVALID_ORDER_TYPE;
    	Order orderInvalid = new Order(orderQuantityImplementation, orderStatus, orderTypeInvalid, priceImplementation, userIdImplementation);
    	
    	OrderBoard orderBoard = new OrderBoard();
    	OrderBoard orderBoard2 = new OrderBoard();
    	
    	Optional<Order> orderOptional = Optional.of(order);
    	Optional<Order> orderOptionalInvalid = Optional.of(orderInvalid);
    	orderBoard.addOrder(orderOptional);
    	orderBoard2.addOrder(orderOptional);
    	orderBoard.addOrder(orderOptionalInvalid);
    	orderBoard2.addOrder(orderOptionalInvalid);
    	
    	Assertions.assertTrue(orderBoard.getOrderBoardAsList().equals(orderBoard2.getOrderBoardAsList()), "OrderBoard.testEqualsObject() test failed");
	}

	/**
	 * Test method for {@link orderBoard.OrderBoard#toString()}.
	 */
	@Test
	final void testToSize() {
		OrderBoard orderBoard = new OrderBoard();
		Assertions.assertEquals(0, orderBoard.size(), "OrderBoard.testToSize() test failed");
	}
	
	/**
	 * Test method for {@link orderBoard.OrderBoard#toString()}.
	 */
	@Test
	final void testToString() {
		OrderBoard orderBoard = new OrderBoard();
		Assertions.assertNotEquals("", orderBoard.toString(), "OrderBoard.testToStringNonEmpty() test failed");
	}
	
	/**
	 * Test method for {@link orderBoard.OrderBoard#toString()}.
	 */
	@Test
	final void testToStringNotNull() {
		OrderBoard orderBoard = new OrderBoard();
		Assertions.assertNotEquals(null, orderBoard.toString(), "OrderBoard.testToStringNotNull() test failed");
	}
}

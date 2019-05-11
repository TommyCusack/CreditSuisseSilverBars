package CreditSuisse.CreditSuisseTest;

import java.util.List;
import java.util.Locale;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import financial.Price;
import financial.PriceInterface;
import order.Order;
import order.OrderQuantity;
import order.OrderQuantityInterface;
import order.OrderStatus;
import order.OrderType;
import order.OrderUnit;
import orderBoard.OrderBoard;
import orderBoard.OrderGroupBy;
import user.UserId;
import user.UserIdInterface;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * App class is the main launcher for OrderBoard and calling/running its various methods.
 * 
 */
public class App 
{
	private static final Logger LOGGER = Logger.getLogger( Class.class.getName() );
	
	/*
	 * main method for running application by calling high-level methods only.
	 * @param args String to use for passing values from command line launcher to application.
	 * @return void. 
	 */
	public static void main( String[] args ){
    	App application = new App();
    	LOGGER.addHandler(new ConsoleHandler());
    	
    	LOGGER.logp(Level.INFO, Class.class.getPackageName(), "main", "Creating OrderBoard");
    	OrderBoard orderBoard = new OrderBoard();
    	application.implementOrderBoard(orderBoard);
    	LOGGER.exiting(application.getClass().getName(), "Basic functionality implemented and tested");
    }
    
	/*
	 * Displays Orders of OrderBoard.
	 * @param orderBoard OrderBoard whose Orders will be displayed.
	 * @return void. 
	 */
	public void displayOrderBoard(OrderBoard orderBoard) {
    	if(orderBoard instanceof OrderBoard) {
    		for(Order order:orderBoard.getOrderBoardAsList()) {
    			LOGGER.logp(Level.INFO, Class.class.getPackageName(), "displayOrderBoard(OrderBoard orderBoard)", order.toString());
    		}
    	}else{
    		LOGGER.logp(Level.INFO, Class.class.getPackageName(), "displayOrderBoard(OrderBoard orderBoard)", "orderList is null!");
    	}
    }
    
	/*
	 * Displays Orders of OrderList.
	 * @param orderList OrderList whose Orders will be displayed.
	 * @return void. 
	 */
	public void displayOrderList(List<Order> orderList) {
    	if(orderList instanceof List<?>) {
    		for(Order order:orderList) {
    			LOGGER.logp(Level.INFO, Class.class.getPackageName(), "displayOrderList(List<Order> orderList)", order.toString());
    		}
    	}else{
    		LOGGER.logp(Level.INFO, Class.class.getPackageName(), "displayOrderList(List<Order> orderList)", "orderList is null!");
    	}
    }
    
	/*
	 * Test method populating OrderBoard with reasonable Order data.
	 * @param orderBoard OrderBoard to be populated by Orders.
	 * @return void. 
	 */
	public void populateOrderBoard(OrderBoard orderBoard) {
    	Order order;
    	OrderQuantityInterface orderQuantityImplementation;
    	OrderStatus orderStatus;
    	OrderType orderType;
    	PriceInterface priceImplementation;
    	UserIdInterface userIdImplementation;
    	
    	if(orderBoard != null) {
    		LOGGER.logp(Level.FINEST, Class.class.getPackageName(), "populateOrderBoard(OrderBoard orderBoard)", "Adding order to orderBoard");
    		orderQuantityImplementation = new OrderQuantity(3.5, OrderUnit.KILOGRAM);
        	orderStatus = OrderStatus.LIVE;
        	orderType = OrderType.SELL;
        	priceImplementation = new Price(306.00, Locale.UK); 
        	userIdImplementation = new UserId("User1");
        	order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
        	orderBoard.addOrder(order);
        	
        	LOGGER.logp(Level.FINEST, Class.class.getPackageName(), "populateOrderBoard(OrderBoard orderBoard)", "Adding order to orderBoard");
        	orderQuantityImplementation = new OrderQuantity(1.2, OrderUnit.KILOGRAM);
        	orderStatus = OrderStatus.LIVE;
        	orderType = OrderType.SELL;
        	priceImplementation = new Price(310.00, Locale.UK); 
        	userIdImplementation = new UserId("User2");
        	order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
        	orderBoard.addOrder(order);

        	LOGGER.logp(Level.FINEST, Class.class.getPackageName(), "populateOrderBoard(OrderBoard orderBoard)", "Adding order to orderBoard");
        	orderQuantityImplementation = new OrderQuantity(1.5, OrderUnit.KILOGRAM);
        	orderStatus = OrderStatus.LIVE;
        	orderType = OrderType.SELL;
        	priceImplementation = new Price(307.00, Locale.UK); 
        	userIdImplementation = new UserId("User3");
        	order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
        	orderBoard.addOrder(order);

        	LOGGER.logp(Level.FINEST, Class.class.getPackageName(), "populateOrderBoard(OrderBoard orderBoard)", "Adding order to orderBoard");
        	orderQuantityImplementation = new OrderQuantity(2.0, OrderUnit.KILOGRAM);
        	orderStatus = OrderStatus.LIVE;
        	orderType = OrderType.SELL;
        	priceImplementation = new Price(306.00, Locale.UK); 
        	userIdImplementation = new UserId("User4");
        	order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
        	orderBoard.addOrder(order);

        	LOGGER.logp(Level.FINEST, Class.class.getPackageName(), "populateOrderBoard(OrderBoard orderBoard)", "Adding order to orderBoard");
        	orderQuantityImplementation  = new OrderQuantity(6.66, OrderUnit.KILOGRAM);
        	orderStatus = OrderStatus.LIVE;
        	orderType = OrderType.BUY;
        	priceImplementation = new Price(1234.00, Locale.UK); 
        	userIdImplementation = new UserId("User5");
        	order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
        	orderBoard.addOrder(order);
        	
        	LOGGER.logp(Level.FINEST, Class.class.getPackageName(), "populateOrderBoard(OrderBoard orderBoard)", "Adding order to orderBoard");
        	orderQuantityImplementation  = new OrderQuantity(6.66, OrderUnit.KILOGRAM);
        	orderStatus = OrderStatus.LIVE;
        	orderType = OrderType.BUY;
        	priceImplementation = new Price(666.00, Locale.UK); 
        	userIdImplementation = new UserId("User6");
        	order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
        	orderBoard.addOrder(order);
        	
        	LOGGER.logp(Level.FINEST, Class.class.getPackageName(), "populateOrderBoard(OrderBoard orderBoard)", "Adding order to orderBoard");
        	orderQuantityImplementation  = new OrderQuantity(12.34, OrderUnit.KILOGRAM);
        	orderStatus = OrderStatus.LIVE;
        	orderType = OrderType.BUY;
        	priceImplementation = new Price(999.00, Locale.UK); 
        	userIdImplementation = new UserId("User7");
        	order = new Order(orderQuantityImplementation, orderStatus, orderType, priceImplementation, userIdImplementation);
        	orderBoard.addOrder(order);
    	}else{
    		LOGGER.logp(Level.INFO, Class.class.getPackageName(), "populateOrderBoard(OrderBoard orderBoard)", "orderBoard is null!");
    	}
    }
    
	/*
	 * Test method performing various filter/group methods upon OrderBoard.
	 * @param orderBoard OrderBoard to be filtered/grouped to test functionality.
	 * @return void. 
	 */
	public void implementOrderBoard(OrderBoard orderBoard) {
    	if(orderBoard != null) {
    		populateOrderBoard(orderBoard);
        	displayOrderBoard(orderBoard);
        	
        	List<Order> orderBoardGrouped = orderBoard.groupOrders(OrderGroupBy.PRICE);
        	displayOrderList(orderBoardGrouped);
        	
        	orderBoardGrouped = orderBoard.filterOrderBoard(OrderStatus.LIVE);
        	orderBoardGrouped = orderBoard.groupOrders(orderBoardGrouped, OrderGroupBy.PRICE);
        	displayOrderList(orderBoardGrouped);
    	}else{
    		LOGGER.logp(Level.INFO, Class.class.getPackageName(), "testOrderBoard(OrderBoard orderBoard)", "orderBoard is null!");
    	}
    }
}

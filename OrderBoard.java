/**
 * 
 */
package orderBoard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import company.Company;
import financial.Price;
import financial.PriceInterface;
import order.Order;
import order.OrderQuantity;
import order.OrderQuantityInterface;
import order.OrderStatus;
import order.OrderType;
import user.UserId;
import user.UserIdInterface;
import utility.Utility;
/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * OrderBoard is a class declaring the necessary fields/methods to implement the minimum required functionality in the SilverBars instructions.
 */
public class OrderBoard {
	private static final Logger LOGGER = Logger.getLogger( Class.class.getName() );
	
    private List<Order> orderCollection = new ArrayList<>(); 
	private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	
	public boolean addOrder(Optional<Order> orderOptional){
		try {
			if(this.orderCollection instanceof List<?> && orderOptional.isPresent()) {
				return orderCollection.add(orderOptional.get());
			}
		}catch(Exception e) {
			Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "addOrder(Optional<Order> orderOptional)", "Exception occurred when trying to addOrder via orderOptional.");
		}
		
		return false;
	}
	
	public boolean addOrder(Order order){
		try {
			if(this.orderCollection instanceof List<?> && order instanceof Order) {
				return orderCollection.add(order);
			}
		}catch(Exception e) {
			Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "addOrder(Order order)", "Exception occurred when trying to addOrder.");
		}
		
		return false;
	}
	
	public boolean removeOrder(Optional<Order> orderOptional){
		try {
			if(this.orderCollection instanceof List<?> && orderOptional.isPresent()) {
				return orderCollection.remove(orderOptional.get());
			}
		}catch(Exception e) {
			Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "removeOrder(Optional<Order> orderOptional)", "Exception occurred when trying to removeOrder(...).");
		}
		
		return false;
	}
	
	public boolean cancelOrder(Optional<Order> orderOptional){
		boolean orderAdded = false;
		boolean orderCancel = false;
		boolean orderRemove = false;
		
		if(this.orderCollection instanceof List<?> && orderOptional.isPresent()) {
			readWriteLock.writeLock().lock();
			try {
				Order order = orderOptional.get();
				orderRemove = removeOrder(orderOptional);
				
				if(orderRemove) {
					order.setOrderStatus(OrderStatus.CANCELLED);
					Optional<Order> orderAddOptional = Optional.of(order);
					orderAdded = addOrder(orderAddOptional);
					orderCancel = orderAdded && orderRemove;
				}
	        }catch(Exception e) {
	        	Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "cancelOrder(Optional<Order> orderOptional)", "Exception occurred when trying to cancelOrder(...).");
			}finally {
	        	readWriteLock.writeLock().unlock();
	        }
		}
		return orderCancel;
	}
	
	public List<Order> filterOrderBoard(OrderStatus orderStatus){
		List<Order> orderCollectionFiltered;
		
		try {
			if(this.orderCollection instanceof List<?> && orderStatus instanceof OrderStatus) {
				orderCollectionFiltered = this.orderCollection.stream()
					.filter(order	->	order.getOrderStatus() == orderStatus)
					.collect(Collectors.toList());
			}else {
				orderCollectionFiltered = new ArrayList<>();
			}
		}catch(Exception e) {
			orderCollectionFiltered = new ArrayList<>();
			Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "filterOrderBoard(OrderStatus orderStatus)", "Exception occurred when trying to filterOrderBoard via orderStatus.");
		}
		
		return orderCollectionFiltered;
	}

	public List<Order> filterOrderList(List<Order> orderList, OrderStatus orderStatus){
		List<Order> orderCollectionFiltered;

		try {
			if(orderList instanceof List<?> && orderStatus instanceof OrderStatus) {
				orderCollectionFiltered = orderList.stream()
					.filter(order	->	order.getOrderStatus() == orderStatus)
					.collect(Collectors.toList());
			}else {
				orderCollectionFiltered = new ArrayList<>();
			}
		}catch(Exception e) {
			orderCollectionFiltered = new ArrayList<>();
			Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "filterOrderList(List<Order> orderList, OrderStatus orderStatus)", "Exception occurred when trying to filterOrderList(...).");
		}
		
		return orderCollectionFiltered;
	}

	public List<Order> filterOrderBoard(OrderType orderType){
		List<Order> orderCollectionFiltered;
		
		try {
			if(this.orderCollection instanceof List<?> && orderType != null) {
				orderCollectionFiltered = this.orderCollection.stream()
					.filter(order	->	order.getOrderType() == orderType)
					.collect(Collectors.toList());
			}else {
				orderCollectionFiltered = new ArrayList<>();
			}
		}catch(Exception e) {
			orderCollectionFiltered = new ArrayList<>();
			Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "filterOrderBoard(OrderType orderType)", "Exception occurred when trying to filterOrderBoard(...).");
		}
		
		return orderCollectionFiltered;
	}	
	
	public List<Order> filterOrderList(List<Order> orderList, OrderType orderType){
		List<Order> orderCollectionFiltered;
		
		try {
			if(orderList instanceof List<?> && orderType instanceof OrderType) {
				orderCollectionFiltered = orderList.stream()
					.filter(order	->	order.getOrderType() == orderType)
					.collect(Collectors.toList());
			}else {
				orderCollectionFiltered = new ArrayList<>();
			}
		}catch(Exception e) {
			orderCollectionFiltered = new ArrayList<>();
			Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "filterOrderList(List<Order> orderList, OrderType orderType)", "Exception occurred when trying to filterOrderList(...).");
		}
		
		return orderCollectionFiltered;
	}	
	
	public List<Order> groupOrders(OrderGroupBy orderGroupBy){
		List<Order> orderCollectionGrouped;
		
		try {
			return groupOrders(this.orderCollection, orderGroupBy); 
		}catch(Exception e) {
			orderCollectionGrouped = new ArrayList<>();
			Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "groupOrders(OrderGroupBy orderGroupBy)", "Exception occurred when trying to groupOrders(...).");
		}
		
		return orderCollectionGrouped;
	}
	
	public List<Order> groupOrders(List<Order> orderList, OrderGroupBy orderGroupBy){
		final List<Order> ORDER_COLLECTION_GROUPED = new ArrayList<>();
		List<Order> sortedList = new ArrayList<>();
		
		final Set<Price> ORDER_STATUS_PRICE_INTERFACE_SET = new HashSet<>();
		final Set<OrderStatus> ORDER_STATUS_SET = new HashSet<>();
		final Set<OrderType> ORDER_TYPE_SET = new HashSet<>();
		
		try {
			if(orderList instanceof List<?> && orderGroupBy instanceof OrderGroupBy) {
				orderList.stream()
					.map( Order::getPriceImplementation ).forEach(
						priceInterface	->	ORDER_STATUS_PRICE_INTERFACE_SET.add( (Price) priceInterface)
					);
				
				orderList.stream()
					.map( Order::getOrderStatus ).forEach(
						orderStatus	->	ORDER_STATUS_SET.add(orderStatus)
					);
				
				orderList.stream()
					.map( Order::getOrderType ).forEach(
						orderType	->	ORDER_TYPE_SET.add(orderType)
					);
				
				switch(orderGroupBy) {
					case PRICE: 
						Map<OrderType, Map<OrderStatus, Map<PriceInterface, List<Order>>>> mappingOrderTypeStatusPriceImplementation = orderList.stream() // , Map<PriceInterface
					    .collect(Collectors.groupingBy(Order::getOrderType,
					        Collectors.groupingBy(Order::getOrderStatus,
					        Collectors.groupingBy(Order::getPriceImplementation))));
						
						for(OrderType orderType:ORDER_TYPE_SET) {
							if( mappingOrderTypeStatusPriceImplementation.containsKey(orderType) ){
								for(OrderStatus orderStatus:ORDER_STATUS_SET) {
									if( mappingOrderTypeStatusPriceImplementation.get(orderType).containsKey(orderStatus) ){
										for(PriceInterface priceInterface:ORDER_STATUS_PRICE_INTERFACE_SET) {
											if( mappingOrderTypeStatusPriceImplementation.get(orderType).get(orderStatus).containsKey(priceInterface) ){
												List<Order> orderOrderStatusPriceList = mappingOrderTypeStatusPriceImplementation.get(orderType).get(orderStatus).get(priceInterface);
												
												Double orderQuantitySum = orderOrderStatusPriceList.stream()
														.map(Order::getOrderQuantityImplementation)
														.mapToDouble(OrderQuantityInterface::getQuantity)
														.sum();
													
												String userIdSummaryReduce = orderOrderStatusPriceList.stream()
													.map(Order::getUserIdImplementation)
													.map(UserIdInterface::getUserIdString) 
													.sorted()
													.reduce("", (n1, n2)	->	n1 + " + " + n2 );
										
												OrderQuantity orderQuantity = new OrderQuantity(orderQuantitySum);
												
												UserId userId = new UserId();
												userId.setUserIdString(userIdSummaryReduce);
												
												Order order = new Order(orderQuantity, orderStatus, orderType, priceInterface, userId);
												
												ORDER_COLLECTION_GROUPED.add(order);
											}
										}
									}
								}
							}
						}
						
						ORDER_COLLECTION_GROUPED.stream()
							.sorted(Comparator.comparing( Order::getOrderTypeSortKey, new OrderBoardComparator() ))
							.collect( Collectors.toList() );
						sortedList = ORDER_COLLECTION_GROUPED.stream().sorted( Comparator.comparing( Order::getOrderTypeSortKey, new OrderBoardComparator() ) ).collect(Collectors.toList());
						break;
					default:
						break;
				} 
			}else {
				sortedList = new ArrayList<>();
			} 
		}catch(Exception e) {
			sortedList = new ArrayList<>();
			Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "groupOrders(List<Order> orderList, OrderGroupBy orderGroupBy)", "Exception occurred when trying to groupOrders(...).");
		}
		
		return sortedList;
	}

	public List<Order> getOrderBoardAsList(){
		List<Order> orderCollectionDefensiveCopy = new ArrayList<>();
		
		try {
			if(this.orderCollection instanceof List<?>) {
				orderCollectionDefensiveCopy.addAll(this.orderCollection);
			}
		}catch(Exception e) {
			orderCollectionDefensiveCopy = new ArrayList<>();
			Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "getOrderBoardAsList()", "Exception occurred when trying to getOrderBoardAsList(...).");
		}
		
		return orderCollectionDefensiveCopy;
	}
	
	public boolean equals(List<Order> orderList) {
		try {
			if(this.orderCollection instanceof List<?> && orderList instanceof List<?>
				&& this.getOrderBoardAsList().containsAll(orderList) && orderList.containsAll(this.getOrderBoardAsList()) ) {
					return true;
			}
		}catch(Exception e) {
			Utility.logErrorMessage(LOGGER, Level.WARNING, e, Class.class.getPackageName(), "equals(Object object)", "object cannot be cast to List<Order>!");
		}
		
		return false;
	}
	
	@Override public int hashCode() {
		int hashCodeOrderCollection = 0;
		
		try {
			if(this.orderCollection instanceof List<?>) {
				for(Order order:this.orderCollection) {
					if(order instanceof Order) {
						hashCodeOrderCollection += order.hashCode();
					}
				}
				hashCodeOrderCollection += this.orderCollection.hashCode();
				hashCodeOrderCollection = Utility.generateHashCode( hashCodeOrderCollection );
			}
		}catch(Exception e) {
			LOGGER.logp(Level.WARNING, Class.class.getPackageName(), "hashCode()", "Exception occurred when trying to calculate hashCode.");
		}
		
		return hashCodeOrderCollection;
	}

	public int size() {
		int size = 0;
		
		try {
			if(this.orderCollection instanceof List<?>) {
				size = this.orderCollection.size();
			}
		}catch(Exception e) {
			size = 0;
			LOGGER.logp(Level.WARNING, Class.class.getPackageName(), "size()", "Exception occurred when trying to calculate size.");
		}
		
		return size;
	}
	
	@Override public String toString() {
		StringBuilder stringBuilder;
		
		try {
			stringBuilder = new StringBuilder( new Company().getCompanyName() );
			stringBuilder.append(" ");
			stringBuilder.append("OrderBoard Collection ");
			
			if(this.orderCollection instanceof List<?>) {
				stringBuilder.append("contains ");
				stringBuilder.append(this.orderCollection.size());
				stringBuilder.append(" Orders.");
			}
		}catch(Exception e) {
			LOGGER.logp(Level.WARNING, Class.class.getPackageName(), "toString()", "Exception occurred when trying to calculate toString().");
			stringBuilder = new StringBuilder("OrderBoard Collection ");
		}
		
		return stringBuilder.toString();
	}
}

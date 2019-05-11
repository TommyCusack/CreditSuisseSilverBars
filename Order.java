/**
 * 
 */
package order;

import financial.Price;
import financial.PriceInterface;
import user.UserId;
import user.UserIdInterface;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * Order class provides the methods/fields allowing for Order selection according to supplied field criteria.
 */
public class Order implements OrderInterface, OrderTypeSortKeyInterface{
	private OrderQuantityInterface orderQuantityImplementation;
	private OrderStatus orderStatus;
	private OrderType orderType;
	private PriceInterface priceImplementation;
	private UserIdInterface userIdImplementation;
	
	public Order(OrderQuantityInterface orderQuantityImplementation
			, OrderStatus orderStatus, OrderType orderType
			, PriceInterface priceImplementation, UserIdInterface userIdImplementation) {
		
		setOrderQuantityImplementation(orderQuantityImplementation);
		setOrderStatus(orderStatus);
		setUserIdImplementation(userIdImplementation);
		
		if(orderType != null) {
			this.orderType = orderType;
		}else {
			this.orderType = OrderType.getOrderTypeDefault();
		}
		
		if(priceImplementation.isPriceInterfaceValid(priceImplementation)) {
			this.priceImplementation = priceImplementation;
		}else {
			this.priceImplementation = new Price();
		}
	}

	/**
	 * @return the orderQuantityImplementation
	 */
	public OrderQuantityInterface getOrderQuantityImplementation() {
		return orderQuantityImplementation;
	}

	/**
	 * @param orderQuantityImplementation the orderQuantityImplementation to set
	 */
	public void setOrderQuantityImplementation(OrderQuantityInterface orderQuantityImplementation) {
		if(orderQuantityImplementation != null) {
			if(orderQuantityImplementation.isOrderQuantityInterfaceValid()) {
				this.orderQuantityImplementation = orderQuantityImplementation;
			}else {
				this.orderQuantityImplementation = new OrderQuantity(); 
			}
		}else {
			this.orderQuantityImplementation = new OrderQuantity();
		}
	}

	/**
	 * @return the orderStatus
	 */
	public OrderStatus getOrderStatus() {
		return this.orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(OrderStatus orderStatus) {
		if(orderStatus instanceof OrderStatus) {
			this.orderStatus = orderStatus;
		}else {
			this.orderStatus = OrderStatus.getOrderStatusDefault();
		}
	}

	/**
	 * @return the orderType
	 */
	public OrderType getOrderType() {
		return this.orderType;
	}

	/**
	 * @param orderType the orderType to set
	 */
	public void setOrderType(OrderType orderType) {
		if(orderType != null) {
			this.orderType = orderType;
		}else {
			this.orderType = OrderType.getOrderTypeDefault();
		}
	}

	/**
	 * @return the priceImplementation
	 */
	public PriceInterface getPriceImplementation() {
		return this.priceImplementation;
	}

	/**
	 * @param priceImplementation the priceImplementation to set
	 */
	public void setPriceImplementation(PriceInterface priceImplementation) {
		if(userIdImplementation instanceof PriceInterface) {
			if(priceImplementation.isPriceInterfaceValid(priceImplementation)) {
				this.priceImplementation = priceImplementation;
			}else {
				this.priceImplementation = new Price();
			}
		}else {
			this.priceImplementation = new Price();
		}
	}

	/**
	 * @return the userIdImplementation
	 */
	public UserIdInterface getUserIdImplementation() {
		return this.userIdImplementation;
	}

	/**
	 * @param userIdImplementation the userIdImplementation to set
	 */
	public void setUserIdImplementation(UserIdInterface userIdImplementation) {
		if(userIdImplementation != null) {
			if(userIdImplementation.isUserIdInterfaceValid() ){
				this.userIdImplementation = userIdImplementation;
			}else {
				this.userIdImplementation = new UserId(); 
			}
		}else {
			this.userIdImplementation = new UserId(); 
		}
	}
	
	public OrderTypeSortKey getOrderTypeSortKey() {
		return new OrderTypeSortKey(getOrderType(), getPriceImplementation());
	}
	
	@Override public String toString() {
		return getOrderType().toString() + ": "  + getOrderQuantityImplementation().toString() + " for " + getPriceImplementation().toString() + "[" + getUserIdImplementation().toString() + "]";
	}
}

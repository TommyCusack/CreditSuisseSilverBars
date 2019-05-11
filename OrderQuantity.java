/**
 * 
 */
package order;

import utility.Utility;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * OrderQuantity class provides the methods/fields allowing for Order to set the Quantity of its constituent parts.
 */
public class OrderQuantity implements OrderQuantityInterface{
	private static final Double QUANTITY_DEFAULT = 0.0;
	
	private Double quantity;
	private OrderUnit orderUnit;
	
	public OrderQuantity() {
		this( OrderQuantity.getQuantityDefault(), OrderUnit.getOrderUnitDefault());
	}
	
	public OrderQuantity(OrderUnit orderUnit) {
		this( OrderQuantity.getQuantityDefault(), orderUnit);
	}
	
	public OrderQuantity(Double quantity) {
		this( quantity, getOrderUnitDefault() );
	}
	
	public OrderQuantity(Double quantity, OrderUnit orderUnit) {
		setQuantity(quantity);
		setOrderUnit(orderUnit);
	}
	
	public static OrderUnit getOrderUnitDefault() {
		return OrderUnit.getOrderUnitDefault();
	}

	public static boolean isOrderUnitValid(OrderUnit orderUnit) {
		return OrderUnit.isOrderUnitValid(orderUnit);
	}
	
	public static boolean isQuantityValid(Double quantity) {
		return (quantity instanceof Double);
	}
	
	public boolean isOrderQuantityInterfaceValid() {
		return isOrderQuantityInterfaceValid(this);
	}
	
	public boolean isOrderQuantityInterfaceValid(OrderQuantityInterface orderQuantityInterface) {
		if(orderQuantityInterface instanceof OrderQuantityInterface) {
			return ( (OrderQuantity.isQuantityValid( ((OrderQuantity)orderQuantityInterface).quantity) ) && isOrderUnitValid( ((OrderQuantity)orderQuantityInterface).orderUnit) );
		}
		return false;
	}
	
	public static Double getQuantityDefault() {
		return OrderQuantity.QUANTITY_DEFAULT;
	}
	
	public Double getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(Double quantity) {
		if(OrderQuantity.isQuantityValid(quantity)){
			this.quantity = quantity;
		}else {
			this.quantity = OrderQuantity.getQuantityDefault();
		}
	}
	
	public OrderUnit getOrderUnit() {
		return this.orderUnit;
	}

	public void setOrderUnit(OrderUnit orderUnit) {
		if( isOrderUnitValid(orderUnit) ) {
			this.orderUnit = orderUnit;
		}else {
			this.orderUnit = OrderQuantity.getOrderUnitDefault();
		}
	}
	
	@Override public boolean equals(Object object) {
		return ( (object instanceof OrderQuantity) 
				&& ((OrderQuantity)object).getQuantity().equals(this.getQuantity())  
				&& ((OrderQuantity)object).getOrderUnit().equals( getOrderUnit() ) );
	}
	
	@Override public int hashCode() {
		int hashCodeOrderUnit = 0;
		int hashCodeQuantity = 0;
		
		if(this.getOrderUnit() instanceof OrderUnit) {
			hashCodeOrderUnit = this.getOrderUnit().hashCode();
		}
		
		if(this.getQuantity() instanceof Double) {
			hashCodeQuantity = this.getQuantity().hashCode();
		}
		
		return Utility.generateHashCode( hashCodeQuantity * 17 + hashCodeOrderUnit * 19 );
	}

	@Override public String toString() {
		StringBuilder stringBuilder;
		
		if( OrderQuantity.isQuantityValid(this.quantity) ) {
			stringBuilder = new StringBuilder(this.quantity.toString());
		}else {
			stringBuilder = new StringBuilder("");
		}
		
		stringBuilder.append(" ");
		if( isOrderUnitValid(this.orderUnit) ) {
			stringBuilder.append(this.orderUnit);
		}else {
			stringBuilder.append(" ");
		}
		
		return stringBuilder.toString();
	}
}

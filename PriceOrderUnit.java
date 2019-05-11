/**
 * 
 */
package financial;

import order.OrderUnit;
import utility.Utility;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * PriceOrderUnit class provides the methods for the Price per OrderUnit for Orders on OrderBoard.
 */
public class PriceOrderUnit {
	protected static final Price PRICE_DEFAULT = new Price( Price.getAmountDefault(), Price.getLocaleDefault() );
	
	private OrderUnit orderUnit;
	private Price price;
	
	public PriceOrderUnit(Price price, OrderUnit orderUnit) {
		setPrice(price);
		setOrderUnit(orderUnit);
	}
	
	public static OrderUnit getOrderUnitDefault() {
		return OrderUnit.getOrderUnitDefault();
	}

	public OrderUnit getOrderUnit() {
		return this.orderUnit;
	}

	public void setOrderUnit(OrderUnit orderUnit) {
		if(orderUnit instanceof OrderUnit) {
			this.orderUnit = orderUnit;
		}else {
			this.orderUnit = PriceOrderUnit.getOrderUnitDefault();
		}
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		if((price instanceof Price) && price.isPriceInterfaceValid(price)) {
			this.price = price;
		}
	}

	public static Price getPriceDefault() {
		return PriceOrderUnit.PRICE_DEFAULT;
	}
	
	public static boolean isOrderUnitValid(OrderUnit orderUnit) {
		if(orderUnit instanceof OrderUnit) {
			return OrderUnit.isOrderUnitValid(orderUnit);
		}
		return false;
	}
	
	public boolean isPriceOrderUnitValid() {
		return PriceOrderUnit.isPriceOrderUnitValid(this);
	}

	public static boolean isPriceOrderUnitValid(PriceOrderUnit priceOrderUnit) {
		if(priceOrderUnit instanceof PriceOrderUnit && priceOrderUnit.price instanceof Price) {
			return ( (priceOrderUnit.price.isPriceInterfaceValid(priceOrderUnit.price) ) 
					&& isOrderUnitValid(priceOrderUnit.orderUnit) );
		}
		return false;
	}

	@Override public boolean equals(Object object) {
		if(object instanceof PriceOrderUnit) {
			return ( ((PriceOrderUnit) object).getOrderUnit().equals(this.orderUnit)
					&& ((PriceOrderUnit) object).getPrice().equals(this.price) );
		}
		return false;
	}
	
	@Override public int hashCode() {
		return Utility.generateHashCode( this.orderUnit.hashCode() * 3 + this.price.hashCode() * 5 );
	}	
	
	@Override public String toString() {
		StringBuilder stringBuilder = new StringBuilder("");
		
		if(this.price instanceof Price && this.price.isPriceInterfaceValid(this.price)){
			stringBuilder.append( this.price.toString() );
		}
		
		stringBuilder.append(" per ");
		if( isOrderUnitValid(this.orderUnit) ) {
			stringBuilder.append(this.orderUnit);
		}else {
			stringBuilder.append(" ");
		}
		
		return stringBuilder.toString();
	}
}

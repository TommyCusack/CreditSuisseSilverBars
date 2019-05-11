/**
 * 
 */
package order;

import financial.Price;
import financial.PriceInterface;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * OrderTypeSortKey is an enum declaring the necessary fields/methods for Order to have the minimum required sorting functionality.
 */
public class OrderTypeSortKey {

	private final OrderType orderType;
	private final PriceInterface priceImplementation;
	
	public OrderTypeSortKey (OrderType orderType, PriceInterface priceImplementation) {
		if(orderType instanceof OrderType) {
			this.orderType = orderType;
		}else {
			this.orderType = OrderType.getOrderTypeDefault();
		}
		
		if(priceImplementation instanceof PriceInterface) {
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
	 * @return the orderType
	 */
	public OrderType getOrderType() {
		return this.orderType;
	}

	/**
	 * @return the priceImplementation
	 */
	public PriceInterface getPriceImplementation() {
		return this.priceImplementation;
	}


}

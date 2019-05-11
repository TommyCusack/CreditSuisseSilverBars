/**
 * 
 */
package orderBoard;

import java.util.Comparator;

import financial.PriceInterface;
import order.OrderType;
import order.OrderTypeSortKey;
/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * OrderTypeSortKeyInterface is a class implementing the necessary fields/methods for OrderBoard to have the minimum required sorting functionality.
 */
public class OrderBoardComparator implements Comparator<OrderTypeSortKey>{
	public int compare(OrderTypeSortKey orderTypeSortKey1, OrderTypeSortKey orderTypeSortKey2) {
		try {
			if(isOrdersComparable(orderTypeSortKey1, orderTypeSortKey2)){
				final OrderType orderType1 = orderTypeSortKey1.getOrderType();
				final OrderType orderType2 = orderTypeSortKey2.getOrderType();
				
				if(orderType1.equals(OrderType.BUY) && orderType2.equals(OrderType.BUY)){
					return orderTypeSortKey1.getPriceImplementation().getAmount().compareTo( orderTypeSortKey2.getPriceImplementation().getAmount() );
				}else if(orderType1.equals(OrderType.SELL) && orderType2.equals(OrderType.SELL)){
					return orderTypeSortKey2.getPriceImplementation().getAmount().compareTo( orderTypeSortKey1.getPriceImplementation().getAmount() );
				}else {
					return orderTypeSortKey1.getPriceImplementation().getAmount().compareTo( orderTypeSortKey2.getPriceImplementation().getAmount() );
				}
			}else{
				return 0;
			}
		}catch(Exception e) {
			return 0;
		}
	}
	
	protected boolean isOrdersComparable(OrderTypeSortKey orderTypeSortKey1, OrderTypeSortKey orderTypeSortKey2) {
		return ( isOrderComparable(orderTypeSortKey1) && isOrderComparable(orderTypeSortKey2) );
	}
	
	protected boolean isOrderComparable(OrderTypeSortKey orderTypeSortKey) {
		return (orderTypeSortKey instanceof OrderTypeSortKey && orderTypeSortKey.getPriceImplementation() instanceof PriceInterface && orderTypeSortKey.getOrderType() instanceof OrderType);
	}
}

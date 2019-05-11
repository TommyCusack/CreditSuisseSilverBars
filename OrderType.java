/**
 * 
 */
package order;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * OrderType is an enum declaring the necessary fields/methods for OrderQuantity to have the minimum required functionality.
 */
public enum OrderType{
	BUY("BUY"),	INVALID_ORDER_TYPE("INVALID_ORDER_TYPE"), SELL("SELL");
	
	private String orderTypeString;
	
	// getter method 
    public String getOrderTypeString() { 
        return this.orderTypeString; 
    }
    
    // enum constructor - cannot be public or protected 
    private OrderType(String orderTypeString){ 
        this.orderTypeString = orderTypeString; 
    }
    
    // getter method 
    public static OrderType getOrderTypeDefault() { 
        return OrderType.INVALID_ORDER_TYPE; 
    }
    
}

/**
 * 
 */
package order;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * OrderStatus is an enum declaring the necessary fields/methods for OrderQuantity to have the minimum required functionality.
 */
public enum OrderStatus {
	CANCELLED("CANCELLED"), DEAD("DEAD"), EXPIRED("EXPIRED"), INVALID_ORDER_STATUS("INVALID_ORDER_STATUS"), LIVE("LIVE"), ZOMBIE("ZOMBIE");
	
	private String orderStatusString;
	
	// getter method 
    public String getOrderStatusString() { 
        return this.orderStatusString; 
    } 
  
    // enum constructor - cannot be public or protected 
    private OrderStatus(String orderStatusString){ 
        this.orderStatusString = orderStatusString; 
    } 
    
    // getter method 
    public static OrderStatus getOrderStatusDefault() { 
        return OrderStatus.INVALID_ORDER_STATUS; 
    }
}

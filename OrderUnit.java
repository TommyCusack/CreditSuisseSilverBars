/**
 * 
 */
package order;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * OrderUnit is an enum declaring the necessary fields/methods for Order to have the minimum required functionality.
 */
public enum OrderUnit{
	INVALID_ORDER_UNIT("INVALID_ORDER_UNIT"), KILOGRAM("kg");
	
	private String orderUnitString;
	
	// getter method 
    public String getOrderUnitString(){ 
        return this.orderUnitString; 
    } 
  
    // enum constructor - cannot be public or protected 
    private OrderUnit(String orderUnitString){ 
        this.orderUnitString = orderUnitString; 
    }
    
    // getter method 
    public static OrderUnit getOrderUnitDefault() { 
        return OrderUnit.KILOGRAM; 
    }
    
    public static boolean isOrderUnitValid(OrderUnit orderUnit) {
    	if(orderUnit instanceof OrderUnit) {
    		if( !(orderUnit.equals(INVALID_ORDER_UNIT)) ){
    			return true;
    		}
        }
    	return false;
    }
}

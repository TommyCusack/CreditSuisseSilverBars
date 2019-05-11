/**
 * 
 */
package orderBoard;

/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * OrderGroupBy is an enum declaring the necessary fields/methods for OrderQuantity to have the minimum required grouping functionality.
 *
 */
public enum OrderGroupBy{
	PRICE("PRICE"),	USER("USER");
	
	private String orderMergeByString;
	
	// getter method 
    public String getOrderMergeByString() { 
        return this.orderMergeByString; 
    }
    
    // enum constructor - cannot be public or protected 
    private OrderGroupBy(String orderMergeByString){ 
        this.orderMergeByString = orderMergeByString; 
    }
    
    // getter method 
    public static OrderGroupBy getOrderMergeByDefault() { 
        return OrderGroupBy.PRICE; 
    }
}

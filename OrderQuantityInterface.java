/**
 * 
 */
package order;


/**
 * @author Tommy Cusack
 * @version 1.0
 * @since   2019-05-11
 * OrderQuantityInterface declares the methods for OrderQuantity to have the minimum required functionality.
 */
public interface OrderQuantityInterface {
	public OrderUnit getOrderUnit();
	public void setOrderUnit(OrderUnit orderUnit);
	
	public Double getQuantity();
	public void setQuantity(Double quantity);
	
	public boolean isOrderQuantityInterfaceValid();
	public boolean isOrderQuantityInterfaceValid(OrderQuantityInterface orderQuantityInterface);

}
